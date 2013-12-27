package main.java.srm154;

import java.util.ArrayList;
import java.util.List;

/*
 * SRM 154 DIV I Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1779
 */
public class CheatCode {

	public int[] matches(String keyPresses, String[] codes) {
		List<Integer> matches = new ArrayList<Integer>();
		for(int i = 0; i < codes.length; i++) {
			if (isCodePresent(codes[i], keyPresses)) {
				matches.add(i);
			}
		}
		return getPrimitiveArray(matches);
	}
	
	private boolean isCodePresent(String code, String keyPresses) {
		if (code.length() > keyPresses.length()) {
			return false;
		}
		int codeIndex = 0;
		boolean prefixFound = false;
		for(int i = 0; i < keyPresses.length(); i++) {
			if (keyPresses.charAt(i) == code.charAt(codeIndex)) {
				codeIndex++;
				prefixFound = true;
				if (codeIndex == code.length()) {
					return true;
				}
			} else if (i > 0 && keyPresses.charAt(i) == keyPresses.charAt(i - 1)){
				
			} else if (prefixFound){
				prefixFound = false;
				codeIndex = 0;
			}
		}
		return false;
	}
	
	private int[] getPrimitiveArray(List<Integer> list) {
		int[] array = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
}
