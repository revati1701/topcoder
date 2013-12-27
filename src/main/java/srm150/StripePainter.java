package main.java.srm150;

import java.util.HashMap;
import java.util.Map;

/*
 * SRM 150 DIV I Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1215
 */
public class StripePainter {
	public int minStrokes(String stripes) {
		Map<String, Integer> stripeCountMap = new HashMap<String, Integer>();
		computeMap(stripeCountMap, stripes);
		
		return 0;
		
	}
	
	private void computeMap(Map<String, Integer> stripeCountMap, String stripes) {
		for(int i = 0; i < stripes.length(); i++) {
			int stripeCount = 0;
			String stripe = String.valueOf(stripes.charAt(i));
			if(stripeCountMap.containsKey(stripe)) {
				stripeCount = stripeCountMap.get(stripe);
				stripeCount++;
			}
			stripeCountMap.put(stripe, stripeCount++);
		}
	}
}
