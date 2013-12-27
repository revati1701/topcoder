package main.java.srm151;

/*
 * SRM 151 DIV II Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1700
 */
public class PrefixCode {
	public String isOne(String[] words) {
		for(int i = 0; i < words.length; i++) {
			String currWord = words[i];
			for (int j = 0; j < words.length; j++) {
				if(words[j].startsWith(currWord) && i != j) {
					return "No, " + i;
				}
			}
		}
		return "Yes";
		
	}
}
