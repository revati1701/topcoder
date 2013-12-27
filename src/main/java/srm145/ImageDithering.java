package main.java.srm145;

import java.util.HashSet;
import java.util.Set;

/*
 * SRM 145, SRM 408 DIV II Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1728
 */
public class ImageDithering {
	public int count(String dithered, String[] screen) {
		int count = 0;
		Set<Character> ditheredCharacterSet = new HashSet<Character>();
		for(int i = 0; i < dithered.length(); i++) {
			ditheredCharacterSet.add(Character.valueOf(dithered.charAt(i)));
		}
		for(String screenRow : screen) {
			for(int i = 0; i < screenRow.length(); i++) {
				if (ditheredCharacterSet.contains(Character.valueOf(screenRow.charAt(i)))) {
					count++;
				}
			}
		}
		
		return count;
	}
}
