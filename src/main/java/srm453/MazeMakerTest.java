package main.java.srm453;

import junit.framework.Assert;

public class MazeMakerTest {
	public static void main(String[] args) {
	    testExample0();
		testExample1();
		testExample2();
		testExample3();
		testExample4();
		testExample5();
	}
	
	public static void testExample0() {
		String[] maze = {"...",
				 "...",
		 "..."};
		
		int startRow = 0;
		int startCol = 1;
		int[] moveRow = {1,0,-1,0};
		int [] moveCol = {0,1,0,-1};
		
		MazeMaker mazeMaker = new MazeMaker();
		int longest = mazeMaker.longestPath(maze, startRow, startCol, moveRow, moveCol);
		Assert.assertEquals(3, longest);
		System.out.println("Example 0 Sucess");
	}
	
	public static void testExample1() {
		String[] maze = {"...",
			 "...",
			 "..."};
		int startRow = 0;
		int startCol = 1;
		int[] moveRow = {1, 0, -1, 0, 1, 1, -1, -1};
		int[] moveCol = {0, 1, 0, -1, 1, -1, 1, -1};
		
		MazeMaker mazeMaker = new MazeMaker();
		int longest = mazeMaker.longestPath(maze, startRow, startCol, moveRow, moveCol);
		Assert.assertEquals(2, longest);
		System.out.println("Example 1 Sucess");
	}
	
	public static void testExample2() {
		String[] maze = {"X.X",
			 "...",
			 "XXX",
			 "X.X"};
		int startRow = 0;
		int startCol = 1;
		int[] moveRow = {1, 0, -1, 0};
		int[] moveCol = {0, 1, 0, -1};
		
		MazeMaker mazeMaker = new MazeMaker();
		int longest = mazeMaker.longestPath(maze, startRow, startCol, moveRow, moveCol);
		Assert.assertEquals(-1, longest);
		System.out.println("Example 2 Sucess");
	}
	
	public static void testExample3() {
		String[] maze = {".......",
				 "X.X.X..",
				 "XXX...X",
				 "....X..",
				 "X....X.",
				 "......."};

		int startRow = 5;
		int startCol = 0;
		int[] moveRow = {1, 0, -1, 0,-2, 1};
		int[] moveCol = {0, -1, 0, 1, 3, 0};
		
		MazeMaker mazeMaker = new MazeMaker();
		int longest = mazeMaker.longestPath(maze, startRow, startCol, moveRow, moveCol);
		Assert.assertEquals(7, longest);
		System.out.println("Example 3 Sucess");
	}
	
	public static void testExample4() {
		String[] maze = {"......."};
		int startRow = 0;
		int startCol = 0;
		int[] moveRow = {1, 0, 1, 0, 1, 0};
		int[] moveCol = {0, 1, 0, 1, 0, 1};
		
		MazeMaker mazeMaker = new MazeMaker();
		int longest = mazeMaker.longestPath(maze, startRow, startCol, moveRow, moveCol);
		Assert.assertEquals(6, longest);
		System.out.println("Example 4 Sucess");
	}
	
	public static void testExample5() {
		String[] maze = {"..X.X.X.X.X.X."};
		int startRow = 0;
		int startCol = 0;
		int[] moveRow = {2,0,-2,0};
		int[] moveCol = {0,2,0,-2};
		
		MazeMaker mazeMaker = new MazeMaker();
		int longest = mazeMaker.longestPath(maze, startRow, startCol, moveRow, moveCol);
		Assert.assertEquals(-1, longest);
		System.out.println("Example 5 Sucess");
	}
}
