package main.java.srm151;

import java.util.ArrayList;
import java.util.List;

/*
 * SRM 151 DIV I Level 2, DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1705
 */
public class MergeSort {
	private int _numComparisions;

	public int howManyComparisons(int[] numbers) {
		List<Integer> numbersList = new ArrayList<Integer>();
		for(int number: numbers) {
			numbersList.add(number);
		}
		mergeSort(numbersList);
		return _numComparisions;
	}
	
	private List<Integer> mergeSort(List<Integer> numbers) {
		if (numbers.size() <= 1) {
			return numbers;
		}
		int size = numbers.size();
		List<Integer> a = numbers.subList(0, size/2);
		List<Integer> b = numbers.subList(size/2, size);
		List<Integer> sortedA = mergeSort(a);
		List<Integer> sortedB = mergeSort(b);
		return merge(sortedA, sortedB);
	}
	
	private List<Integer> merge(List<Integer> a, List<Integer> b) {
		List<Integer> merged = new ArrayList<Integer>();
		int aIndex = 0;
		int bIndex = 0;
		while (aIndex < a.size() && bIndex < b.size()) {
			if (a.get(aIndex) < b.get(bIndex)) {
				merged.add(a.get(aIndex++));
			} else if (a.get(aIndex) > b.get(bIndex)){
				merged.add(b.get(bIndex++));
			} else {
				merged.add(a.get(aIndex++));
				merged.add(b.get(bIndex++));
			}
			 _numComparisions++;
		}
		while(aIndex < a.size()) {
			merged.add(a.get(aIndex++));
		}
		while(bIndex < b.size()) {
			merged.add(b.get(bIndex++));
		}
		return merged;
	}
}
