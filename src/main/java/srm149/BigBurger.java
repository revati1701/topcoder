package main.java.srm149;

/*
 * SRM DIV I Level 1, DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1648
 */

//SRM 149 Div 2 Level 2
public class BigBurger {
	int maxWait(int[] arrival, int[] service) {
		int curr = arrival[0] + service[0];
		int maxWait = 0;
		int currWait = 0;
		for(int i = 1; i < arrival.length; i++) {
			if (arrival[i] > curr) {
				currWait = 0;
				curr = arrival[i] + service[i];
			} else {
				currWait = curr - arrival[i];
				curr = curr + service[i];
			}
			maxWait = Math.max(currWait, maxWait);
			
		}
		return maxWait;
		
	}
}
