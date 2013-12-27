package main.java.srm155;

import java.util.ArrayList;
import java.util.List;

/*
 * SRM 155 DIV I Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1694
 */
public class QuipuReader {
	private List<Integer> _start = new ArrayList<Integer>();
	private List<Integer> _end = new ArrayList<Integer>();
	private String[] _knots;
	public int[] readKnots(String[] knots)  {
		_knots = knots;
		computeStartEnd();
		int[] numbers = new int[knots.length];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		int startIndex = 0;
		int endIndex = 0;
		int count = 0;
		boolean started = false;
		boolean ended = false;
		for(int knotIndex = 0; knotIndex < _knots.length; knotIndex++) {
			String knot = _knots[knotIndex];
			count = 0;
			ended = false;
			startIndex = 0;
			endIndex = 0;
			for(int columnIndex = 0; columnIndex < knot.length(); columnIndex++) {
				if(!started && columnIndex == _start.get(startIndex)) {
					started = true;
					startIndex++;
				} else if (columnIndex == _end.get(endIndex)) {
					started = false;
					ended = true;
					endIndex++;
				}
				if(knot.charAt(columnIndex) == 'X') {
					count++;
				}
				if (ended) {
					if(numbers[knotIndex] != 0) {
						numbers[knotIndex] = numbers[knotIndex] * 10 + count;
					} else {
						numbers[knotIndex] = count;
					}
					ended = false;
					count = 0;
				}
			}
		}
		
		return numbers;
	}
	
	private void computeStartEnd() {
		int numColumns = _knots[0].length(); 
		boolean knotStarted = false;
		int countDashes = 0;
		for(int columnIndex = 0; columnIndex < numColumns; columnIndex++) {
			countDashes = 0;
			for(int knotIndex = 0; knotIndex < _knots.length; knotIndex++) {
				if (!knotStarted && _knots[knotIndex].charAt(columnIndex) == 'X') {
					knotStarted = true;
					_start.add(columnIndex);
					
				}
				if (knotStarted && _knots[knotIndex].charAt(columnIndex) == '-') {
					countDashes++;
				}
			}
			if (countDashes == _knots.length) {
				_end.add(columnIndex);			
				countDashes = 0;
				knotStarted = false;
			} else if (knotStarted) {
				
			}
		}
	}

}
