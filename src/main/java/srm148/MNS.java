package main.java.srm148;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * SRM 148 DIV I LEVEL 2, DIV II LEVEL 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1744
 */
//SRM 148 Div 2 Level 3
public class MNS {
	Set<List<Integer>> _combinationSet = new HashSet<List<Integer>>();

public int combos(int[] numbers) {
		List<Integer> input = new ArrayList<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			input.add(numbers[i]);
		}
		comb(input, 0, new int[9], new int[9]);
		int count = 0;
		for(List<Integer> instanceCombination : _combinationSet) {
			if (testMagicSquare(instanceCombination)) {
				count++;
			}
		}
		return count;
	}
	
	private boolean testMagicSquare(List<Integer> matrix) {
		int sumRow = matrix.get(0) + matrix.get(1) + matrix.get(2);
		if (sumRow != (matrix.get(3) + matrix.get(4) + matrix.get(5))) {
			return false;
		}
		if (sumRow != (matrix.get(6) + matrix.get(7) + matrix.get(8))) {
			return false;
		}
		int sumCol = matrix.get(0) + matrix.get(3) + matrix.get(6);
		if (sumCol != (matrix.get(1) + matrix.get(4) + matrix.get(7))) {
			return false;
		}
		if (sumCol != (matrix.get(2) + matrix.get(5) + matrix.get(8))) {
			return false;
		}
		return true;
	}
	
	private void comb(List<Integer> input, int start, int[] result, int[] flag) {
		for( int i = 0; i < input.size(); i++) {
			if (flag[i] == 1) {
				continue;
			}
			result[start] = input.get(i);
			flag[i] = 1;
			if(start == 8) {
				List<Integer> resultList =  new ArrayList<Integer>();
				for(int j = 0; j < result.length; j++) {
					resultList.add(result[j]);
				}
				_combinationSet.add(resultList);
			} else {
				comb(input, start + 1, result, flag);
			}
			flag[i] = 0;
		}
	}
	
	
	
	public  static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
