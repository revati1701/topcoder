package main.java.tccc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * TCC Round 4 DIV I Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1592
 */
public class ChessMetric {
	private int[] _end;
	private long  _numWays;
	private int _size;
	
	private Set<ArrayList<ArrayList<Integer>>> _sequence = new HashSet<ArrayList<ArrayList<Integer>>>(); 
	
	long howMany(int size, int[] start, int[] end, int numMoves) {
		_size = size;
		_end = end;
		dfs(numMoves, start, new ArrayList<ArrayList<Integer>>());
		return _numWays;
	}
	
	private void dfs(int numMoves, int[] curr, ArrayList<ArrayList<Integer>> list) {
		System.out.println("NumMoves " + numMoves);
		if(curr[0] < 0 || curr[1] < 0 || curr[0] >= _size || curr[1] >= _size) {
			return;
		}
		ArrayList<Integer> pointList = new ArrayList<Integer>();
		pointList.add(curr[0]);
		pointList.add(curr[1]);
		list.add(pointList);
		if (numMoves == 0) {
			System.out.println(curr[0] + " " + curr[1]);
			if(isEnd(curr) && !_sequence.contains(list)) {
				_sequence.add(list);
				_numWays++;
				System.out.println(_numWays);
				return;
			} else {
				return;
			}
		}
		//UP
		dfs(numMoves - 1, new int[]{curr[0], curr[1] - 1}, new ArrayList<ArrayList<Integer>>(list));
		
		//DOWN
		dfs(numMoves - 1, new int[]{curr[0], curr[1] + 1}, new ArrayList<ArrayList<Integer>>(list));
		
		//LEFT
		dfs(numMoves - 1, new int[]{curr[0] - 1, curr[1]}, new ArrayList<ArrayList<Integer>>(list));
		
		//RIGHT
		dfs(numMoves - 1, new int[]{curr[0] + 1, curr[1]}, new ArrayList<ArrayList<Integer>>(list));
		
		//Diagonally Right Up	
		dfs(numMoves - 1, new int[]{curr[0] + 1, curr[1] - 1}, new ArrayList<ArrayList<Integer>>(list));
		
		//Diagonally Right Down
		dfs(numMoves - 1, new int[]{curr[0] + 1, curr[1] + 1}, new ArrayList<ArrayList<Integer>>(list));
		
		//Diagonally Left Up
		dfs(numMoves - 1, new int[]{curr[0] - 1, curr[1] - 1}, new ArrayList<ArrayList<Integer>>(list));
		
		//Diagonally Left Down
		dfs(numMoves - 1, new int[]{curr[0] - 1, curr[1] + 1}, new ArrayList<ArrayList<Integer>>(list));
		
		//L Moves
		
		//Horizontal First
		dfs(numMoves - 1, new int[]{curr[0] + 2, curr[1] - 1}, new ArrayList<ArrayList<Integer>>(list));
		dfs(numMoves - 1, new int[]{curr[0] + 2, curr[1] + 1}, new ArrayList<ArrayList<Integer>>(list));
		dfs(numMoves - 1, new int[]{curr[0] - 2, curr[1] - 1}, new ArrayList<ArrayList<Integer>>(list));
		dfs(numMoves - 1, new int[]{curr[0] - 2, curr[1] + 1}, new ArrayList<ArrayList<Integer>>(list));
		
		//Vertical First
		dfs(numMoves - 1, new int[]{curr[0] + 1, curr[1] - 2}, new ArrayList<ArrayList<Integer>>(list));
		dfs(numMoves - 1, new int[]{curr[0] - 1, curr[1] - 2}, new ArrayList<ArrayList<Integer>>(list));
		dfs(numMoves - 1, new int[]{curr[0] + 1, curr[1] + 2}, new ArrayList<ArrayList<Integer>>(list));
		dfs(numMoves - 1, new int[]{curr[0] - 1, curr[1] + 2}, new ArrayList<ArrayList<Integer>>(list));
		
	}
	
	
	private boolean isEnd(int[] point) {
		return point[0] == _end[0] && point[1] == _end[1];
	}
	
}
