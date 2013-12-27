package main.java.srm435;

import org.junit.Test;

import junit.framework.Assert;


public class CellRemovalTest {
	
	@Test
	public void test0() {
		int[] parent = {-1,0,0,1,1};
		int deletedCell = 2;
		CellRemoval cellRemoval = new CellRemoval();
		int actual = cellRemoval.cellsLeft(parent, deletedCell);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		int[] parent = {-1,0,0,1,1};
		int deletedCell = 1;
		CellRemoval cellRemoval = new CellRemoval();
		int actual = cellRemoval.cellsLeft(parent, deletedCell);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		int[] parent = {-1,0,0,1,1};
		int deletedCell = 0;
		CellRemoval cellRemoval = new CellRemoval();
		int actual = cellRemoval.cellsLeft(parent, deletedCell);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		int[] parent = {-1,0,0,2,2,4,4,6,6};
		int deletedCell = 4;
		CellRemoval cellRemoval = new CellRemoval();
		int actual = cellRemoval.cellsLeft(parent, deletedCell);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		int[] parent = {26,2,32,36,40,19,43,24,30,13,21,14,24,21,19,4,30,10,44,12,7,32,17,43,
				 35,18,7,36,10,16,5,38,35,4,13,-1,16,26,1,12,2,5,18,40,1,17,38,44,14};
		int deletedCell = 24;
		CellRemoval cellRemoval = new CellRemoval();
		int actual = cellRemoval.cellsLeft(parent, deletedCell);
		int expected = 14;
		Assert.assertEquals(expected, actual);
	}

}

