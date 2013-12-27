package main.java.srm453;

import java.util.LinkedList;

/*
 * SRM 453.5 DIV I Level 1, DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=10451
 */
public class MazeMaker {
	
	public class Node {
		private int _x;
		private int _y;
		private int _minSteps;
		
		Node(int x, int y, int minSteps) {
			_x = x;
			_y = y;
			_minSteps = minSteps;
		}
		
		public int getX() {
			return _x;
		}
		public void setX(int x) {
			_x = x;
		}
		public int getY() {
			return _y;
		}
		public void setY(int y) {
			this._y = y;
		}
		public int getMinSteps() {
			return _minSteps;
		}
		public void setMinSteps(int minSteps) {
			this._minSteps = minSteps;
		}
	}
	
	
	public int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {
		
		char[][] mazeArray = getArray(maze);
		LinkedList<Node> queue = new LinkedList<Node>();
		int longest = -1;
		queue.add(new Node(startRow, startCol, 0));
		mazeArray[startRow][startCol] = 'X';
		int rowCount = mazeArray.length;
		int colCount = mazeArray[0].length;
		
		while(!queue.isEmpty()) {
			Node currNode = queue.remove();
			int currX = currNode.getX();
			int currY = currNode.getY();
			int currCost = currNode.getMinSteps();
			if (currCost > longest) {
				longest = currCost;
			}
			
			for(int i = 0; i < moveRow.length; i++) {
				int nextX = currX + moveRow[i];
				int nextY = currY + moveCol[i];
				int cost = currCost + 1;
				if (nextX >= rowCount || nextY >= colCount || nextX < 0 || nextY < 0) {
					continue;
				}
				if(mazeArray[nextX][nextY] == '.') {
					queue.add(new Node(nextX, nextY, cost));
					//Note that cell needs to be marked visited here, not on stack.pop it is too late then
					// and stack will contain multiple values of same cell.
					mazeArray[nextX][nextY] = 'X';
				}
			}
		
			
		}
		
		
		for (int i = 0; i < rowCount; i++) {
			for(int j = 0; j < colCount; j++) {
				if (mazeArray[i][j] == '.') {
					return -1;
				}
			}
		}
		
		return longest;
	}
	
	public char[][] getArray(String[] maze) {
		int rowLength = maze.length;
		int colLength = maze[0].length();
		char[][] mazeArray = new char[rowLength][colLength];
		for (int i = 0; i < rowLength; i++) {
			for(int j = 0; j < colLength; j++) {
				mazeArray[i][j] = maze[i].charAt(j);
			}
		}
		return mazeArray;
	}

}
