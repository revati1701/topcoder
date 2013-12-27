package main.java.srm150;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/*
 * SRM 150 DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1751
 */
public class BrickByBrick {
	
	protected class Transition {
		private float _startX;
		private float _startY;
		private float _endX;
		private float _endY;
		
		private Transition() {
			
		}
		
		private Transition(float endX, float endY, float startX, float startY) {
			_endX = endX;
			_endY = endY;
			_startX = startX;
			_startY = startY;
		}
		
		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Transition)) {
				return false;
			}
			Transition other = (Transition) o;
			return other._endX == _endX && other._endY == _endY && other._startX == _startX && other._startY == _startY;
			
		}
		
		public int hashCode() {
	        return new HashCodeBuilder(17, 31).
	            append(_startX).
	            append(_endX).
	            append(_endY).
	            append(_startY).
	            toHashCode();
	    }
		
	}
	private int _numBricks = 0;
	private float _indexX = 1;
	private float _indexY = 0;
	private int _numRows = 0;
	private int _numColumns = 0;
	private char[][] _matrix;
	
	private Transition _currInstance = new Transition(1, 0.5f, 0.5f, 0);
	
	private Map<Transition, Integer> _transitionByCountMap = new HashMap<Transition, Integer>();
	
	public int timeToClear(String[] map) {
		int count = 0;
		_matrix = new char[map.length][map[0].length()];
		_numRows = map.length;
		_numColumns = map[0].length();
		computeArray(map);
		while(_numBricks > 0) {
			count++;
			if (isCycle()) {
				return -1;
			}
			updateXY();
		}
		
		return count;
	}
	
	private boolean isCycle() {
		if (_transitionByCountMap.containsKey(_currInstance)) {
			int visited = _transitionByCountMap.get(_currInstance);
			visited++;
			if (visited > 2){
				return true;
			}
			_transitionByCountMap.put(_currInstance, visited);
		} else {
			_transitionByCountMap.put(_currInstance, 0);
		}
		return false;
	}
	
	private void updateXY() {
		char brickType = getHitBrick();
		if(brickType == '.') {
			updateXYWithoutCollision();
		} else {
			updateXYOnCollision();
			if (brickType == 'B') {
				_matrix[(int)_indexY][(int)_indexX] = '.';
				_numBricks--;
				_transitionByCountMap.clear();
			}
		}
	}
	
	private void updateXYWithoutCollision() {
		Transition newInstance = new Transition();
		float dX = _currInstance._endX - _currInstance._startX;
		float dY = _currInstance._endY - _currInstance._startY;
		newInstance._startX = _currInstance._endX;
		newInstance._startY = _currInstance._endY;
		if(dX > 0 && dY > 0) {
			newInstance._endX = _currInstance._endX + 0.5f;
			newInstance._endY = _currInstance._endY + 0.5f;
		} else if (dX > 0 && dY < 0) {
			newInstance._endX = _currInstance._endX + 0.5f;
			newInstance._endY = _currInstance._endY - 0.5f;
		} else if (dX < 0 && dY > 0) {
			newInstance._endX = _currInstance._endX - 0.5f;
			newInstance._endY = _currInstance._endY + 0.5f;
		} else if (dX < 0 && dY < 0) {
			newInstance._endX = _currInstance._endX - 0.5f;
			newInstance._endY = _currInstance._endY - 0.5f;
		}
		_currInstance = newInstance;
	}
	
	private void updateXYOnCollision() {
		Transition newInstance = new Transition();
		float dX = _currInstance._endX - _currInstance._startX;
		float dY = _currInstance._endY - _currInstance._startY;
		float intialY = _currInstance._startY;
		newInstance._startX = _currInstance._endX;
		newInstance._startY = _currInstance._endY;
		if (dX > 0 && dY > 0) {
			if (isInteger(intialY)) {
				newInstance._endX = _currInstance._endX - 0.5f;
				newInstance._endY =_currInstance._endY + 0.5f;
			} else {
				newInstance._endX = _currInstance._endX + 0.5f;
				newInstance._endY = _currInstance._endY - 0.5f;
			}
		} else if (dX < 0 && dY > 0) {
			if (isInteger(intialY)) { 
				newInstance._endX = _currInstance._endX + 0.5f;
				newInstance._endY = _currInstance. _endY + 0.5f;
			} else {
				newInstance._endX = _currInstance._endX - 0.5f;
				newInstance._endY = _currInstance._endY - 0.5f;
			}
		} else if (dX > 0 && dY < 0) {
			if (isInteger(intialY)) {
				newInstance._endX = _currInstance._endX - 0.5f;
				newInstance._endY = _currInstance._endY - 0.5f;
			} else {
				newInstance._endX = _currInstance._endX + 0.5f;
				newInstance._endY = _currInstance._endY + 0.5f;
			}
			
		} else {
			if (isInteger(intialY)) {
				newInstance._endX = _currInstance._endX + 0.5f;
				newInstance._endY = _currInstance._endY - 0.5f;
			} else {
				newInstance._endX = _currInstance._endX - 0.5f;
				newInstance._endY = _currInstance._endY + 0.5f;
			}
		}
		_currInstance = newInstance;
	}
	
	
	private boolean isInteger(float number) {
		int x = (int) number;
		if (number - x == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private char getHitBrick() {
		float endX = _currInstance._endX;
		float endY = _currInstance._endY;
		float startX = _currInstance._startX;
		float startY = _currInstance._startY;
				
		float dX = endX - startX;
		float dY = endY - startY;
		if (dX > 0 && dY > 0) {
			if (isInteger(startY)) {
				_indexX = startX + 0.5f;
				_indexY = startY;
			} else {
				_indexX = startX;
				_indexY = startY + 0.5f;
			}
			
		} else if (dX < 0 && dY > 0) {
			if (isInteger(startY)) {
				_indexX = startX - 1;
				_indexY = startY;
			} else {
				_indexX = startX - 1;
				_indexY = startY + 0.5f;
			}
		} else if (dX > 0 && dY < 0) {
			if (isInteger(startY)) {
				_indexX = startX + 0.5f;
				_indexY = startY  - 1;
			} else {
				_indexX = startX;
				_indexY = startY - 1.5f;
			}
		} else if (dX < 0 && dY < 0) {
			if (isInteger(startY)) {
				_indexX = startX - 1;
				_indexY = startY - 0.5f;
			} else {
				_indexX = startX - 1.0f;
				_indexY = startY - 1.5f;
			}
			
		}
		if (_indexY >= _numRows || _indexX>= _numColumns || _indexX < 0 || _indexY < 0) {
			return '#';
		}
		return _matrix[(int)_indexY][(int)_indexX];
		
	}
	
	private void computeArray(String[] map) {
		for(int i = 0; i < map.length; i++) {
			String row = map[i];
			for(int j = 0; j < row.length(); j++) {
				char ch = row.charAt(j);
				_matrix[i][j] = ch;
				if (ch == 'B') {
					_numBricks++;
				}
				
			}
		}
	}
}
