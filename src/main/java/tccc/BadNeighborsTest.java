package main.java.tccc;

import junit.framework.Assert;


import org.junit.Test;

public class BadNeighborsTest {
	
	@Test
	public void test0() {
		BadNeighbors neighbors = new BadNeighbors();
		int[] donations = { 10, 3, 2, 5, 7, 8 };
		int actual = neighbors.maxDonations(donations);
		int expected = 19;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		BadNeighbors neighbors = new BadNeighbors();
		int[] donations = { 11, 15 };
		int actual = neighbors.maxDonations(donations);
		int expected = 15;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		BadNeighbors neighbors = new BadNeighbors();
		int[] donations = { 7, 7, 7, 7, 7, 7, 7 };
		int actual = neighbors.maxDonations(donations);
		int expected = 21;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		BadNeighbors neighbors = new BadNeighbors();
		int[] donations = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
		int actual = neighbors.maxDonations(donations);
		int expected = 16;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		BadNeighbors neighbors = new BadNeighbors();
		int[] donations = { 94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61,  
				  6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397,
				  52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72 };
		int actual = neighbors.maxDonations(donations);
		int expected = 2926;
		Assert.assertEquals(expected, actual);
	}
}
