package main.java.tccc;
/*
 * TopCoder Collegiate Challenge MW and W Regional Round - DIV I, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=1144
 */
public class FleasFleas {
	public int population(int n, int k) {
		int count = countFleas(n, k, 1);
		if (count == -1) {
			return count;
		} else {
			return n + count;
		}
	}
	
	private int countFleas(int n, int k, int prev) {
		if (k <= 0) {
			return 0;
		}
		int count = countFleas(n, k - 5, prev * k);
		if (count > 10000000 || count == -1) {
			return -1;
		}
		return count + prev * k * n;
	}
}
