package main.java.tccc;
/*
 * TCCC06 Online Round 2A - DIV I, Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=4798
 */
public class MatchCounts {
	private String[] _ability;
	
	public int howMany(String[] ability) {
		_ability = ability;
		return countWays(0, 0, new boolean[6]);
	}
	
	private int countWays(int level, int count, boolean[] taskUsed) {
		if(level >= _ability.length) {
			return count + 1;
		}
		String personAbility = _ability[level];
		for(int i = 0; i < personAbility.length(); i++) {
			char task = personAbility.charAt(i);
			if(!taskUsed[Character.getNumericValue(task)]) {
				taskUsed[Character.getNumericValue(task)] = true;
				count = countWays(level + 1, count, taskUsed);
				taskUsed[Character.getNumericValue(task)] = false;
			}
		}
		return count;
	}
}
