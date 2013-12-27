package main.java.srm153;

/*
 * SRM 153 DIV I Level 1, DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1772
 */
public class Inventory {
	public int monthlyOrder(int[] sales, int[] daysAvailable) {
		int n = sales.length;
		double average = 0.0;
		double perDaySales = 0.0;
		
		for(int i = 0; i < sales.length; i++) {
			if (daysAvailable[i] == 0) {
				n = n - 1;
				continue;
			}
			if (daysAvailable[i] == 30) {
				average = average + sales[i];
			} else {
				perDaySales = sales[i] * 1.0 / daysAvailable[i];
				average = average + perDaySales * 30;
			}
		}
		average = Math.ceil((average - 1e-9) / n);
		return Double.valueOf(average).intValue();
	}
}
