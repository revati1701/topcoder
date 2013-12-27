package main.java.tccc;

import junit.framework.Assert;

import org.junit.Test;

public class ZigZagTest {
	@Test
	public void test0() {
		ZigZag zigzag = new ZigZag();
		int[] sequence = { 1, 7, 4, 9, 2, 5 };
		int actual = zigzag.longestZigZag(sequence);
		int expected = 6;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test1() {
		ZigZag zigzag = new ZigZag();
		int[] sequence = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
		int actual = zigzag.longestZigZag(sequence);
		int expected = 7;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		ZigZag zigzag = new ZigZag();
		int[] sequence = { 44 };
		int actual = zigzag.longestZigZag(sequence);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		ZigZag zigzag = new ZigZag();
		int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int actual = zigzag.longestZigZag(sequence);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		ZigZag zigzag = new ZigZag();
		int[] sequence = { 70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19, 7, 5, 5, 5, 1000, 32, 32 };
		int actual = zigzag.longestZigZag(sequence);
		int expected = 8;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test5() {
		ZigZag zigzag = new ZigZag();
		int[] sequence = { 374, 40, 854, 203, 203, 156, 362, 279, 812, 955, 
				600, 947, 978, 46, 100, 953, 670, 862, 568, 188, 
				67, 669, 810, 704, 52, 861, 49, 640, 370, 908, 
				477, 245, 413, 109, 659, 401, 483, 308, 609, 120, 
				249, 22, 176, 279, 23, 22, 617, 462, 459, 244 };
		int actual = zigzag.longestZigZag(sequence);
		int expected = 36;
		Assert.assertEquals(expected, actual);
	}
}

