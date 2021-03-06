package com.hieuvv.component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.hieuvv.composite.Document;
import com.hieuvv.composite.Match;

public class MatchService {

	private static DocumentMatch documentMatch = new DocumentMatch();

    /**
     * Use this for De-duplication of data, where for a given list of documents it finds duplicates
     * Data is aggregated by a given Document
     *
     * @param documents the list of documents to match against
     * @return a map containing the grouping of each document and its corresponding matches
     */
    public Map<Document, List<Match<Document>>> applyMatch(List<Document> documents) {
        return documentMatch.matchDocuments(documents.parallelStream())
                .collect(Collectors.groupingBy(Match::getData));
    }

    /**
     * Use this to check duplicates for bulk inserts, where a list of new Documents is checked against existing list
     * Data is aggregated by a given Document
     *
     * @param documents the list of documents to match from
     * @param matchWith the list of documents to match against
     * @return a map containing the grouping of each document and its corresponding matches
     */
    public Map<Document, List<Match<Document>>> applyMatch(List<Document> documents, List<Document> matchWith) {
        return documentMatch.matchDocuments(Stream.concat(
                documents.parallelStream().map(document -> {
                    document.setSource(true);
                    return document;
                }), matchWith.parallelStream().map(document -> {
                    document.setSource(false);
                    return document;
                })))
                .collect(Collectors.groupingBy(Match::getData));
    }

    /**
     * Use this to check duplicate for a new record, where it checks whether a new Document is a duplicate in existing list
     * Data is aggregated by a given Document
     *
     * @param document the document to match
     * @param matchWith the list of documents to match against
     * @return a map containing the grouping of each document and its corresponding matches
     */
    public Map<Document, List<Match<Document>>> applyMatch(Document document, List<Document> matchWith) {
        return applyMatch(Arrays.asList(document), matchWith);
    }

    /**
     * Use this to check duplicate for a new record, where it checks whether a new Document is a duplicate in existing list
     * Data is aggregated by a given Document Id
     *
     * @param document the document to match
     * @param matchWith the list of documents to match against
     * @return a map containing the grouping of each document id and its corresponding matches
     */
    public Map<Object, List<Match<Document>>> applyMatchByDocId(Document document, List<Document> matchWith) {
        return applyMatchByDocId(Arrays.asList(document), matchWith);
    }

    /**
     * Use this for De-duplication of data, where for a given list of documents it finds duplicates
     * Data is aggregated by a given Document Id
     *
     * @param documents the list of documents to match against
     * @return a map containing the grouping of each document id and its corresponding matches
     */
    public Map<Object, List<Match<Document>>> applyMatchByDocId(List<Document> documents) {
        return documentMatch.matchDocuments(documents.parallelStream())
                .collect(Collectors.groupingBy(match -> match.getData().getKey()));
    }

    /**
     * Use this to check duplicates for bulk inserts, where a list of new Documents is checked against existing list
     * Data is aggregated by a given Document Id
     *
     * @param documents the list of documents to match from
     * @param matchWith the list of documents to match against
     * @return a map containing the grouping of each document id and its corresponding matches
     */
    public Map<Object, List<Match<Document>>> applyMatchByDocId(List<Document> documents, List<Document> matchWith) {
        return documentMatch.matchDocuments(Stream.concat(
                documents.parallelStream().map(document -> {
                    document.setSource(true);
                    return document;
                }), matchWith.parallelStream().map(document -> {
                    document.setSource(false);
                    return document;
                })))
                .collect(Collectors.groupingBy(match -> match.getData().getKey()));
    }
}
