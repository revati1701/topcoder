package main.java.srm148;

/*
 * SRM DIV II LEVEL 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1740
 */
public class CeyKaps {
	public String decipher(String typed, String[] switches) {
		char[] switchedRelationShip = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for(String switchString : switches) {
			String[] switchPair = switchString.split(":");
			for(int i = 0; i < switchedRelationShip.length; i++) {
				if (switchedRelationShip[i] == switchPair[0].charAt(0)) {
					switchedRelationShip[i] = switchPair[1].charAt(0);
				} else if (switchedRelationShip[i] == switchPair[1].charAt(0)) {
					switchedRelationShip[i] = switchPair[0].charAt(0);
				} 
			}
		}
		
		StringBuilder text = new StringBuilder();
		
		for(int i = 0; i < typed.length(); i++) {
			text.append(switchedRelationShip[typed.charAt(i) - 'A']);
		}
		return text.toString();
	}
	
}
