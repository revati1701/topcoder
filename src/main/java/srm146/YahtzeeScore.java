package main.java.srm146;

import java.util.HashMap;
import java.util.Map;

/*
 * SRM 146, SRM 212 DIV II Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1692
 */
public class YahtzeeScore {
	public int maxPoints(int[] toss) {
		int max = 0;
		Map<Integer, Integer> tossBySumMap = new HashMap<Integer, Integer>();
		int sum = 0;
		for(int i = 0; i < toss.length; i++) {
			//containsKey function - i looked it up
			if(tossBySumMap.containsKey(toss[i])) {
				sum = tossBySumMap.get(toss[i]);
			} else {
				//Need this in here. 
				sum = 0;
			}
			//http://stackoverflow.com/questions/2254435/can-an-int-be-null-in-java
			tossBySumMap.put(toss[i], sum + toss[i]);
		}
		//Another nice example of auto unboxing
		//values() function - i looked it up
		for (int elem : tossBySumMap.values()) {
			if (max < elem) {
				max = elem;
			}
		}
		return max;
	}

}
