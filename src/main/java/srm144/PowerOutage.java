package main.java.srm144;
/*
 * SRM 144 DIV 2 Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1697
 */
public class PowerOutage {
private int[] _fromJunction;

private int[] _toJunction;

private int[] _ductLength;

public int estimateTimeOut(int[] fromJunction, int[] toJunction, int[] ductLength) {

	_fromJunction = fromJunction;
	
	_toJunction = toJunction;
	
	_ductLength = ductLength;
	
	
	int longestTime = 0;
	int pathTime = 0;
	
	
	for(int i = 0; i < _fromJunction.length; i++) {
		pathTime = getLongestTime(_toJunction[i], _ductLength[i], _ductLength[i]);
		if (pathTime > longestTime) {
			longestTime = pathTime;
		}
	}
	
	System.out.println("LongestTime" + longestTime);
	
	int cost  = 0;
	
	for (int i = 0; i < _ductLength.length; i++) {
		cost = cost + _ductLength[i] * 2;
	}
	return cost - longestTime;
	}
	
	
	private int getLongestTime(int currToNode, int currCost, int longestPathCost) {
		int fullPathCost = 0;
		for(int i = 0; i < _fromJunction.length; i++) {
			if (currToNode == _fromJunction[i]) {
				int temp = currCost + _ductLength[i];
				System.out.println("CurrCost " + temp + " from " +  currToNode + " to " + _toJunction[i]);	
				fullPathCost = getLongestTime(_toJunction[i], currCost + _ductLength[i], longestPathCost);
				if (fullPathCost > longestPathCost) {
					longestPathCost = fullPathCost;
				} 
				if(currCost + _ductLength[i] >  longestPathCost) {
					longestPathCost = currCost + _ductLength[i];
				}
			}
		}
		System.out.println("Returning" + longestPathCost);
		return longestPathCost;
}

}
