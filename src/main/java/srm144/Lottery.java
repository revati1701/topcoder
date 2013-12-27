package main.java.srm144;

import java.util.Set;
import java.util.TreeSet;

/*
 * SRM-144 DIV 1 500
 * http://community.topcoder.com/stat?c=problem_statement&pm=1659
 */

public class Lottery {
	
	public class Game implements Comparable<Game>{
		private String _name;
		private Double _odds;
		
		Game(String name, Double odds) {
			_name = name;
			_odds = odds;
		}
		
		public String getName() {
			return _name;
		}
		
		public void setName(String name) {
			_name = name;
		}
		
		public Double getOdds() {
			return _odds;
		}
		
		public void setOdds(Double odds) {
			_odds = odds;
		}

		@Override
		public int compareTo(Game o) {
			if (_odds.equals(o.getOdds())) {
				return _name.compareTo(o.getName());
			}
			return _odds.compareTo(o.getOdds());
		}
		
		
	}
	
	public String[] sortByOdds(String[] rules) {
		Set<Game> sortedSet = new TreeSet<Game>();
		for(String rule : rules) {
			String name = rule.substring(0, rule.indexOf(':'));
			rule = rule.substring(rule.indexOf(':') + 2, rule.length());
			String[] parameters = rule.split(" ");
			int n = Integer.valueOf(parameters[0]);
			int r = Integer.valueOf(parameters[1]);
			boolean isSorted = parameters[2].equals("T") ? true : false;
			boolean isUnique = parameters[3].equals("T") ? true : false;
			double odds = getOdds(n, r, isSorted, isUnique);
			Game game = new Game(name, odds);
			sortedSet.add(game);
		}
		String[] result = new String[sortedSet.size()];
		int i = 0;
		for (Game game : sortedSet) {
			result[i++] = game.getName();
		}
		return result;
	}
	
	private double getOdds(int n, int r, boolean isSorted, boolean isUnique) {
		double odds = 0;
		
		if (!isSorted && !isUnique) {
			//Permuation with repeatability Formula: n raise to r ie n * n ...r times
			odds = Math.pow(n, r);
			return odds;
		}
		
		if (isSorted && !isUnique) {
			//Combination with repeatability Formula: (n + r - 1)!/(n-1)!r!
			odds = getFactorial(n + r - 1)/(getFactorial(n - 1) * getFactorial(r));
			return odds;
		}
		
		if (!isSorted && isUnique) {
			//Permutation without repeatability Formula: n!/(n-r)
			odds = getFactorial(n)/getFactorial(n - r);
			return odds;
		}
		
		if (isSorted && isUnique) {
			//Combination without repeatability Formula: n!/(n-r)!r!
			odds = getFactorial(n)/(getFactorial(n - r) * getFactorial(r));
			return odds;
		}
		return odds;
	}
	
	private double getFactorial(int n) {
		//This needs to double, else you cross limit for int, long for 100!
		double factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
