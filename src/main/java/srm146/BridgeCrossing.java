package main.java.srm146;

import java.util.Arrays;

/*
 * SRM 146 DIV II Level 3 
 * http://community.topcoder.com/stat?c=problem_statement&pm=1599
 * //Make use of the fact that times length is between 1 and 6
 */
public class BridgeCrossing {
	public int minTime(int[] times) {
		Arrays.sort(times);
		switch(times.length) {
		case 1:
			return times[0];
		case 2:
			return times[1];
		case 3:
			return times[0] + times[1] + times[2];
		case 4: 
			return times[0] + times[1] * 3 + times[3];
		case 5:
			return times[0] * 2 + times[1] * 3 + times[2] + times[4];
		case 6: 
			return times[0] * 3 + times[1] * 3 + times[2] + times[3] + times[5];
		}
		
		return 0;
	}

}
