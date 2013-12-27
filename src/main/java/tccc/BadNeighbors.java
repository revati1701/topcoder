package main.java.tccc;

/*
 * 2004 TCCC ROUND 4 DIV 1 LEVEL 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=2402
 */
public class BadNeighbors {

	public int maxDonations(int[] donations) {
		int len = donations.length;
	
		int[] seq1 = new int[len - 1];
		int[] sum1 = new int[len -1];
		int[] seq2 = new int[len - 1];
		int[] sum2 = new int[len - 1];
	
		for( int i = 1; i < len; i++) {
			seq1[i - 1] = donations[i];
			sum1[i - 1] = donations[i];
		}
		
		for(int i = 0 ; i < len - 1; i++) {
			seq2[i] = donations[i];
			sum2[i] = donations[i];
		}
		
		int maxSum1 = getMaxSum(seq1, sum1);
		
		int maxSum2 = getMaxSum(seq2, sum2);
		
		return maxSum1 > maxSum2 ? maxSum1 : maxSum2;
	}

	private int getMaxSum(int[] seq, int[] sum) {
	
		int maxSum = sum[0];
		
		for(int i = 1; i < seq.length; i++) {
			
			for (int j = 0; j < i; j++) {
			
				if(j != i -1) {
					if (sum[i] < seq[i] + sum[j]) {
						sum[i] = seq[i] + sum[j];
					}
					if (maxSum <  sum[i]) {
						maxSum = sum[i];
					}
				
				}
			}
		}
		return maxSum;
	
	}
	
	
	

}
