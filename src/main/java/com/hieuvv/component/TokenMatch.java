package com.hieuvv.component;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.hieuvv.composite.ElementClassification;
import com.hieuvv.composite.Match;
import com.hieuvv.composite.Token;

public class TokenMatch {

	public Stream<Match<Token>> matchTokens(ElementClassification elementClassification, Stream<Token> input) {
		
		return elementClassification.getMatchOptimizerFunction().apply(input.collect(Collectors.toList()))
				.filter(tokenMatch -> tokenMatch.getResult() >= tokenMatch.getData().getElement().getThreshold());
	}
}
