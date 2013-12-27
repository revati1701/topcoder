package main.java.srm152;

import java.util.ArrayList;
import java.util.List;

/*
 * SRM 152 DIV I Level 1, DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1716
 */
public class LeaguePicks {
	public int[] returnPicks(int position, int friends, int picks) {
		List<Integer> chosenPicksList = new ArrayList<Integer>();
		int count = 1;
		while(picks > 0) {
			for(int i = 1; i <= friends; i++) {
				if (i == position) {
					chosenPicksList.add(count);
				}
				count++;
				picks--;
				if (picks <= 0 ) {
					break;
				}
			}
			for(int j = friends; j > 0; j--) {
				if (j == position) {
					chosenPicksList.add(count);
				}
				count++;
				picks--;
				if (picks <= 0 ) {
					break;
				}
			}
		}
		return listToInt(chosenPicksList);
	}
	
	private int[] listToInt(List<Integer> list) {
		int[] array = new int[list.size()];
		int i = 0;
		for(int elem : list) {
			array[i++] = elem;
		}
		return array;
	}
}
