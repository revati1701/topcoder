package main.java.srm435;

import java.util.HashSet;
import java.util.Set;

/*
 * SRM 435 DIV I Level 1, DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=10275
 */
public class CellRemoval {
	public int cellsLeft(int[] parent, int deletedCell) {
		Set<Integer> cellSet = new HashSet<Integer>();
		Set<Integer> deletedSet = new HashSet<Integer>();
		for(int i = 0; i < parent.length; i++) {
			cellSet.add(i);
		}
		deletedSet.add(deletedCell);
		cellSet.remove(deletedCell);
		
		boolean found;
		do {
			found = false;
			for(int i = 0; i < parent.length; i++) {
				if (deletedSet.contains(parent[i]) && !deletedSet.contains(i)) {
					deletedSet.add(i);
					found = true;
				}
			}
		} while(found);
		
		for(int i = 0; i < parent.length; i++) {
			cellSet.remove(parent[i]);
			if (deletedSet.contains(parent[i])) {
				cellSet.remove(i);
			}
		}
		return cellSet.size();
	}
}
