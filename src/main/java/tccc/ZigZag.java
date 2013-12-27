package main.java.tccc;

/*
 * TopCoder Collegiate Challenge Semi final Round 3 - Division I, Level One
 * http://community.topcoder.com/stat?c=problem_statement&pm=1259
 */
public class ZigZag {
	public int longestZigZag(int[] sequence) {
		if (sequence.length == 1) {
			return 1;
		}
		int[] diff = new int[sequence.length - 1];
		for(int i = 0; i + 1 < sequence.length; i ++) {
			diff[i] = sequence[i + 1] - sequence[i];
		}
		int[] maxZigZag = new int[diff.length];
		for (int i = 0; i < maxZigZag.length; i++) {
			maxZigZag[i] = 1;
		}
		for(int i = 1; i < diff.length; i++) {
			for(int j = 0; j < i; j++) {
				if (isAlternate(diff[j], diff[i])) {
					if (maxZigZag[i] < 1 + maxZigZag[j]) {
						maxZigZag[i] = 1 + maxZigZag[j];
						
					}
				} else if (maxZigZag[i] < maxZigZag[j]) {
					maxZigZag[i] = maxZigZag[j];
					
				}
			}
		}
		return maxZigZag[maxZigZag.length - 1] + 1;
	}
	
	private boolean isAlternate(int a, int b) {
		if ( a > 0 && b > 0) {
			return false;
		}
		if (a > 0 && b < 0) {
			return true;
		}
		if (a < 0 && b > 0) {
			return true;
		}
		if (a < 0 && b < 0) {
			return false;
		}
		return false;
	}
}

