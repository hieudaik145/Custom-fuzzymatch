package com.hieuvv.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.BooleanUtils;

import com.hieuvv.composite.Document;
import com.hieuvv.composite.Element;
import com.hieuvv.composite.ElementClassification;
import com.hieuvv.composite.Match;
import com.hieuvv.composite.Score;

/**
 * <p>
 * Starts the Matching process by element level matching and aggregates the
 * results back This uses the ScoringFunction defined at each Document to get
 * the aggregated Document score for matched Elements
 */
public class DocumentMatch {

	private static ElementMatch elementMatch = new ElementMatch();

	public Stream<Match<Document>> matchDocuments(Stream<Document> documents) {
		Stream<Element> elements = documents.flatMap(d -> d.getPreProcessedElement().stream());
		Map<ElementClassification, List<Element>> elementMap = elements
				.collect(Collectors.groupingBy(Element::getElementClassification));

		List<Match<Element>> matchedElements = new ArrayList<>();
		elementMap.forEach((key, value) -> {
			List<Match<Element>> result = elementMatch.matchElements(key, value.parallelStream())
					.collect(Collectors.toList());
			matchedElements.addAll(result);
		});

		return rollupDocumentScore(matchedElements.parallelStream());
	}

	private Stream<Match<Document>> rollupDocumentScore(Stream<Match<Element>> matchElementStream) {

		Map<Document, Map<Document, List<Match<Element>>>> groupBy = matchElementStream
				.collect(Collectors.groupingBy(matchElement -> matchElement.getData().getDocument(),
						Collectors.groupingBy(matchElement -> matchElement.getMatchedWith().getDocument())));
		
		return groupBy.entrySet().parallelStream().flatMap(leftDocumentEntry -> leftDocumentEntry.getValue().entrySet()
				.parallelStream().flatMap(rightDocumentEntry -> {
					List<Score> childScoreList = rightDocumentEntry.getValue().stream().map(d -> d.getScore())
							.collect(Collectors.toList());
					Match<Document> leftMatch = new Match<Document>(leftDocumentEntry.getKey(),
							rightDocumentEntry.getKey(), childScoreList);
					if (BooleanUtils.isNotFalse(rightDocumentEntry.getKey().isSource())) {
						Match<Document> rightMatch = new Match<Document>(rightDocumentEntry.getKey(),
								leftDocumentEntry.getKey(), childScoreList);
						return Stream.of(leftMatch, rightMatch);
					}

					return Stream.of(leftMatch);
				})).filter(match -> match.getResult() > match.getData().getThreshold());
	}

}
