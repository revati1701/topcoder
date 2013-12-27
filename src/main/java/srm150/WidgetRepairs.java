package main.java.srm150;

/*
 * SRM 150 DIV II Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1346
 */
public class WidgetRepairs {
	public int days(int[] arrivals, int numPerDay) {
		int numDays = 0;
		int numCurrRepairs = 0;
		for(int i = 0; i < arrivals.length; i++) {
			numCurrRepairs += arrivals[i];
			if (numCurrRepairs > 0) {
				if (numCurrRepairs > numPerDay) {
					numCurrRepairs -= numPerDay;
				} else {
					numCurrRepairs = 0;
				}
				numDays++;
			}
		}
		while(numCurrRepairs > 0) {
			numDays++;
			numCurrRepairs -= numPerDay;
		}
		return numDays;
	}
}
