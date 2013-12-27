package main.java.srm148;

import java.util.ArrayList;
import java.util.List;

/*
 * SRM 148, SRM 235 DIV II Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1741
 */
public class DivDigits {
	
	public int howMany(int number) {
		int count = 0;
		int currNumber = number;
		int digit;
		List<Integer> digitList = new ArrayList<Integer>();
		
		while(currNumber != 0) {
			digit = currNumber % 10;
			if (digit != 0) {
				digitList.add(digit);
			}
			currNumber = currNumber / 10;
		}
		
		for(Integer i : digitList) { 
			if (number % i == 0) {
				count++;
			}
		}
		return count;
	}

}
