package com.hieuvv.composite;

public class Score {

	private double result;

	private Match match;

	public Score(double result, Match match) {
		this.result = result;
		this.match = match;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}
}
