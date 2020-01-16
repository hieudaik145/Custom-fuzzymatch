package com.hieuvv.component;

import java.util.List;
import java.util.function.BiFunction;

import com.hieuvv.composite.Match;
import com.hieuvv.composite.Score;

public interface Matchable {

	public long getChildCount(Matchable other);

	public BiFunction<Match, List<Score>, Score> getScoringFunction();

	public double getWeight();

	public long getUnmatchedChildCount(Matchable other);

}
