package main.java.srm150;

import java.util.HashSet;
import java.util.Set;

/*
 * SRM 150 DIV I Level 1, DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1523
 */
public class InterestingDigits {
	private int _base;
	
	int[] digits(int base) {
		_base = base;
	
		Set<Integer> interestingDigits = new HashSet<Integer>();
		int currMultiple = 0;
		boolean isInteresting = false;
		for(int currNumber = 2; currNumber < base; currNumber++) {
			isInteresting = false;
			for(int i = 2; i <= 999; i++) {
				currMultiple = currNumber * i;
				currMultiple = convertToBase(currMultiple, _base);
				isInteresting = isInteresting(currMultiple, currNumber);
				if(!isInteresting) {
					break;
				}
			}
			if(isInteresting) {
				interestingDigits.add(currNumber);
			}
		}
		return toPrimitive(interestingDigits);
	}
	
	private int convertToBase(int number, int base) {
		int numberInBase = 0;
		int multiple = 1;
		while(number > base) {
			numberInBase = numberInBase  + multiple * (number % base);
			number = number / base;
			multiple = multiple * 10;
		}
		numberInBase = numberInBase + multiple * number;
		return numberInBase;
	}
	
	private boolean isInteresting(int multiple, int number) {
		int sum = 0;
		multiple = convertToDecimal(multiple);
		while(multiple > 9) {
			sum = sum + multiple % 10;
			multiple = multiple / 10;
		}
		
		sum = sum + multiple % 10;
		
		System.out.println("Now" + multiple + " " + sum);
		if (sum % number == 0) {
			
			return true;
		} else {
			return false;
		}
	}
	
	private int convertToDecimal(int number) {
		int numberInDecimal = 0;
		int i = 0;
		while(number > 10) {
			numberInDecimal = numberInDecimal + (number % 10) * (int) Math.pow(_base, i);
			number = number / 10;
			i++;
		}
		return numberInDecimal;
	}
	
	private int[] toPrimitive(Set<Integer> arraySet) {
		int[] array = new int[arraySet.size()];
		int i = 0;
		for(Integer integer : arraySet) {
			array[i++] = integer;
		}
		return array;
	}
}
