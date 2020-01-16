package com.hieuvv.composite;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

import static com.hieuvv.function.PreProcessFunction.*;
import static com.hieuvv.function.TokenizerFunction.*;
import static com.hieuvv.function.SimilarityMatchFunction.*;
import static com.hieuvv.function.MatchOptimizerFunction.*;

public enum ElementType {

	TENHOATDONG(namePreprocessing(), wordTokenizer(), soundex(), searchGroupOptimizer()),
	QUANHUYEN(namePreprocessing(), wordTokenizer(), soundex(), searchGroupOptimizer()),
    XAPHUONG(removeSpecialChars(), wordTokenizer(), soundex(), searchGroupOptimizer()),
    HOATDONGTUNGAY(none(),valueTokenizer(),dateDifferenceWithinYear(), dateSortOptimizer()),
    HOATDONGDENNGAY(none(),valueTokenizer(),dateDifferenceWithinYear(), dateSortOptimizer()),
    PHONE(usPhoneNormalization(),decaGramTokenizer(), equality(), searchGroupOptimizer()),
    NUMBER(numberPreprocessing(),valueTokenizer(),numberDifferenceRate(), numberSortOptimizer()),
    DATE(none(),valueTokenizer(),dateDifferenceWithinYear(), dateSortOptimizer()),
	DIACHI(none(),wordTokenizer(),soundex(),searchGroupOptimizer()),
	NOIDUNGHOATDONG(none(), wordTokenizer(), soundex(), searchGroupOptimizer());
	
	private final Function<Object, Object> preProcessFunction;

	private final Function<Element, Stream<Token>> tokenizerFunction;

	private final BiFunction<Token, Token, Double> similarityMatchFunction;

	private final Function<List<Token>, Stream<Match<Token>>> matchOptimizerFunction;

	ElementType(Function<Object, Object> preProcessFunction, Function<Element, Stream<Token>> tokenizerFunction,
			BiFunction<Token, Token, Double> similarityMatchFunction,
			Function<List<Token>, Stream<Match<Token>>> matchOptimizerFunction) {
		this.preProcessFunction = preProcessFunction;
		this.tokenizerFunction = tokenizerFunction;
		this.similarityMatchFunction = similarityMatchFunction;
		this.matchOptimizerFunction = matchOptimizerFunction;
	}

	public Function<Object, Object> getPreProcessFunction() {
		return preProcessFunction;
	}

	public Function<Element, Stream<Token>> getTokenizerFunction() {
		return tokenizerFunction;
	}

	public BiFunction<Token, Token, Double> getSimilarityMatchFunction() {
		return similarityMatchFunction;
	}

	public Function<List<Token>, Stream<Match<Token>>> getMatchOptimizerFunction() {
		return matchOptimizerFunction;
	}
}
