package main.java.srm154;

/*
 * SRM 154, SRM 228 DIV II Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1768
 */
public class ProfitCalculator {
	public int percent(String[] items) {
		Float totalPrice = 0.0f;
		Float totalCost = 0.0f;
				
		for (int i = 0; i < items.length; i++) {
			String[] item = items[i].split(" ");
			totalPrice = totalPrice + Float.valueOf(item[0]);
			totalCost = totalCost + Float.valueOf(item[1]);
		}
		Float profitPercentage = ((totalPrice - totalCost) / totalPrice) * 100;
		return profitPercentage.intValue();
		
	}
	
}
