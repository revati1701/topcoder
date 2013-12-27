package main.java.srm145;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * SRM 145 Div 1 Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1677
 */
public class Bonuses {
	int[] getDivision(int[] points) {
		
		int[] percentages = new int[points.length];
		Map<Integer, Set<Integer>> percentageByIndexMap = new TreeMap<Integer, Set<Integer>>(Collections.reverseOrder());
		Double total = 0.0;
		for(int point : points) {
			total += point;
		}
		System.out.println(total);
		for(int i = 0; i < points.length; i++) {
			Double percentageInDouble = points[i] * 100 / total;
			Integer percentage = percentageInDouble.intValue();
			System.out.println(percentage);
			if(percentageByIndexMap.containsKey(percentage)) {
				Set<Integer> indexSet = percentageByIndexMap.get(percentage);
				indexSet.add(i);
				percentageByIndexMap.put(percentage, indexSet);
			} else {
				Set<Integer> indexSet = new TreeSet<Integer>();
				indexSet.add(i);
				percentageByIndexMap.put(percentage, indexSet);
			}
		}
		Integer leftOver = 0;
		Integer percentage = 0;
		int times = 0;
		for(Entry<Integer, Set<Integer>> entry : percentageByIndexMap.entrySet()) {
			percentage = entry.getKey();
			times = entry.getValue().size();
			leftOver+= percentage * times;
		}
		leftOver = 100 - leftOver;
		System.out.println(leftOver);
		int count = 0;
		for(Entry<Integer, Set<Integer>> entry : percentageByIndexMap.entrySet()) {
			for(Integer index: entry.getValue()) {
				if(count < leftOver) {
					percentages[index] = entry.getKey() + 1;
				} else {
					percentages[index] = entry.getKey();
				}
				count++;
			}
			
		}
		return percentages;
	}
	
	
}