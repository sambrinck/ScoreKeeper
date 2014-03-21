package org.brinck.fun;

import java.util.LinkedHashMap;
import java.util.Map;

public class Model {

	private Map<String, Integer> people = new LinkedHashMap<String, Integer>();
	private boolean subtract = true;
	private int startingVal = 0;

	public boolean addPerson(String name) {
		return (null == people.put(name, startingVal));
	}
	
	public int addScore(String name, int score) {
		if (subtract) {
			score = -score;
		}
		score += people.get(name);
		people.put(name, score);
		return score;
	}
	
	
}
