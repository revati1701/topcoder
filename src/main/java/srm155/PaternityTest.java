package main.java.srm155;

import java.util.ArrayList;
import java.util.List;

/*
 * SRM 155 DIV I Level 1, DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1669
 */
public class PaternityTest {
	public int[] possibleFathers(String child, String mother, String[] men) {
		boolean[] matchedMother = new boolean[child.length()];
		int half = child.length() / 2;
		int countMatchMotherChar= 0;
		for(int i = 0; i < child.length(); i++) {
			if (mother.charAt(i) == child.charAt(i)) {
				matchedMother[i] = true;
				countMatchMotherChar++;
			}	
		}
		int countMatchManChar = 0;
		int actualCountMatchMotherChar = countMatchMotherChar;
		List<Integer> matchedMenList = new ArrayList<Integer>();
		for(int menIndex = 0; menIndex < men.length; menIndex++) {
			countMatchManChar = 0;
			countMatchMotherChar = actualCountMatchMotherChar;
			String man = men[menIndex];
			for(int i = 0; i < child.length(); i++) {
				if (child.charAt(i) == man.charAt(i)) {
					if (matchedMother[i]) {
						if(countMatchMotherChar > half) {
							countMatchMotherChar = countMatchMotherChar - 1;
							countMatchManChar++;
						}
					} else {
						countMatchManChar++;
					}
					
				}
			}
			if(countMatchManChar >= half &&  countMatchMotherChar >= half && (countMatchManChar + countMatchMotherChar >= child.length())) {
				matchedMenList.add(menIndex);
			}
		}
		int[] possibleFathers = new int[matchedMenList.size()];
		for(int i = 0; i < matchedMenList.size(); i++) {
			possibleFathers[i] = matchedMenList.get(i);
		}
		return possibleFathers;
	}

}
