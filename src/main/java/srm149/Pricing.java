package main.java.srm149;

import java.util.Arrays;

/*
 * SRM 149 DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1600
 */
public class Pricing {
	public int maxSales(int[] price) {
		//Arrays.sort(price);
		
		Arrays.sort(price);
		reverseOrder(price);
		int currSum = 0;
		int maxSum = 0;
		
		if (price.length < 4) {
			for(int p = 0; p < price.length; p++) {
				maxSum += price[p];
			}
			return maxSum;
		}
		
		
		for(int i = 0; i < price.length - 4; i++) {
			int a = price[i];
			for(int j = i + 1; j < price.length - 3; j++) {
				int b = price[j];
				for(int k = j + 1; k < price.length- 2; k++) {
					int c = price[k];
					for(int l = k + 1; l < price.length - 1; l++) {
						int d = price[l];
						System.out.println(a + " " + b + " " + c + " " + d);
						 for(int m = 0; m < price.length; m++) {
							 if(price[m] >= a) {
								 currSum += a;
							 } else if (price[m] >= b){
								 currSum += b;
							 } else if (price[m] >= c) {
								 currSum += c;
							 } else if(price[m] >= d) {
								 currSum +=d;
							 }
						 }
						 //Note this method
						 maxSum = Math.max(maxSum, currSum);
						 currSum = 0;
					}
				}
			}
		}
		return maxSum;
	}
	
	private void reverseOrder(int[] array) {
		//TODO: instance inside for loop v/s outside declaration
		int endIndex = array.length - 1;
		int i =0;
		for(i = 0; i < array.length/2; i++) {
			int temp = array[i];
			array[i] = array[endIndex - i];
			array[endIndex - i] = temp;
			
		}
		if (array.length %2 != 0) {
			int temp = array[i];
			array[i] = array[endIndex - i];
			array[endIndex - i] = temp;
		}
	}
}


