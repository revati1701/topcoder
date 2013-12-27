package main.java.srm150;

import junit.framework.Assert;

import org.junit.Test;

public class BrickByBrickTest {

	@Test
	public void testExample0() {
		BrickByBrick brickByBrick = new BrickByBrick();
		String[] map = { ".B",
		  "BB" };
		int actual = brickByBrick.timeToClear(map);
		int expected = 6;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		BrickByBrick brickByBrick = new BrickByBrick();
		String[] map = { ".BB",
				  "BBB",
		  "BBB" };
		int actual = brickByBrick.timeToClear(map);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		BrickByBrick brickByBrick = new BrickByBrick();
		String[] map = { "......B",
				  "###.###",
		  "B.....B" };
		int actual = brickByBrick.timeToClear(map);
		int expected = 35;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		BrickByBrick brickByBrick = new BrickByBrick();
		String[] map = { "..BBB...",
				  ".#BB..#.",
				  "B.#B.B..",
				  "B.B.....",
				  "##.B.B#.",
				  "#BB.#.B.",
				  "B..B.BB.",
				  "#..BB..B",
				  ".B....#." };
		int actual = brickByBrick.timeToClear(map);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		BrickByBrick brickByBrick = new BrickByBrick();
		String[] map = { ".BB..BBB.B...",
				  "B.B...B..BB..",
				  "#B...B#B.....",
				  "B#B.B##...##B",
				  "BB.B#.B##B.B#",
				  "B.B#.BBB.BB#B",
				  "B#BBB##.#B#B.",
				  "B#BB.BBB#BB.#" };
		int actual = brickByBrick.timeToClear(map);
		int expected = 3912;
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testExample5() {
		BrickByBrick brickByBrick = new BrickByBrick();
		String[] map = { ".BBBBBBBBBBBBBB",
				  "##############B",
				  "BBBBBBBBBBBBBBB",
				  "B##############",
				  "BBBBBBBBBBBBBBB",
				  "##############B",
				  "BBBBBBBBBBBBBBB",
				  "B##############",
				  "BBBBBBBBBBBBBBB",
				  "##############B",
				  "BBBBBBBBBBBBBBB",
				  "B##############",
				  "BBBBBBBBBBBBBBB",
				  "##############B",
				  "BBBBBBBBBBBBBBB" };
		int actual = brickByBrick.timeToClear(map);
		int expected = 31753;
		Assert.assertEquals(expected, actual);
	}
}
