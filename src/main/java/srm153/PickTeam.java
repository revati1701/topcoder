package main.java.srm153;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * SRM 153 DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1773
 */
public class PickTeam {
	Map<String, Integer[]> _familarityByPerson = new HashMap<String, Integer[]>();
	String[] _peopleArray;
	String[] _maxSet;
	int _maxSum;
	
	public String[] pickPeople(int teamSize, String[] people) {
		_peopleArray = new String[people.length];
		constructMap(people);
		
		String[] subSet = new String[teamSize];
		comb(teamSize, subSet, 0, 0);
		return _maxSet;
	}
	
	private void comb(int teamSize, String[] subSet, int subSetIndex, int peopleIndex) {
		if (teamSize == 0) {
			calculateMax(subSet);
			return;
		}
		for(int i = peopleIndex; i < _peopleArray.length; i++) {
			if ( i + teamSize <= _peopleArray.length) {
				subSet[subSetIndex] = _peopleArray[i]; 
				comb(teamSize - 1, subSet, subSetIndex + 1, i + 1);
			}
		}
			
	}
	
	private void calculateMax(String[] subset) {
		Set<Integer> indexes = new HashSet<Integer>();
		for(int i = 0; i < subset.length; i++) {
			Integer[] familarity = _familarityByPerson.get(subset[i]);
			for(int j = 0; j < familarity.length; j++) {
				if(familarity[j] == 0) {
					indexes.add(j);
				}
			}
			
		}
		int sum = 0;
		for(int i = 0; i + 1 < subset.length; i++) {
			Integer[] familarity = _familarityByPerson.get(subset[i]);
			for(int j = 0; j < familarity.length; j++) {
				if(indexes.contains(j)) {
					sum = sum + familarity[j];
				}
			}
			if (sum > _maxSum) {
				_maxSum = sum;
				_maxSet = Arrays.copyOf(subset, subset.length);
			}
		}
	}
	
	private void constructMap(String[] people) {
		int k = 0;
		for(int i = 0; i < people.length; i++) {
			String[] peopleSplit = people[i].split(" ");
			String key = peopleSplit[0];
			Integer[] familarity = new Integer[peopleSplit.length - 1];
			for(int j = 1; j < peopleSplit.length; j++) {
				familarity[j - 1] = Integer.valueOf(peopleSplit[j]);
			}
			_familarityByPerson.put(key, familarity);
			_peopleArray[k++] = key;
		}
	}
	

}
