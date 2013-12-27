package main.java.srm153;

/*
 * SRM 153, SRM 223 DIV II Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1774
 */
public class MostProfitable {
	public String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {
		int diff = 0;
		int maxProfit = 0;
		int maxIndex = -1;
		for(int i = 0; i < costs.length; i++) {
			diff = (prices[i] - costs[i]) * sales[i];
			if (maxProfit < diff) {
				maxProfit = diff;
				maxIndex = i;
			}
		}
		if (maxIndex > -1) {
			return items[maxIndex];
		} else {
			return "";
		}
	}
}
