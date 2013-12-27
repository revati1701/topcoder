package main.java.srm146;

import org.junit.Test;

import junit.framework.Assert;

public class BridgeCrossingTest {
	
	@Test
	public void testExample0() {
		BridgeCrossing bridgeCrossing = new BridgeCrossing();
		int[] times = { 1, 2, 5, 10 };
		int expected = bridgeCrossing.minTime(times);
		int actual = 17;
		Assert.assertEquals("Does not match",expected, actual);
	}
	
	@Test
	public void testExample1() {
		BridgeCrossing bridgeCrossing = new BridgeCrossing();
		int[] times = { 1, 2, 3, 4, 5 };
		int expected = bridgeCrossing.minTime(times);
		int actual = 16;
		Assert.assertEquals("Does not match",expected, actual);
	}
	
	@Test
	public void testExample2() {
		BridgeCrossing bridgeCrossing = new BridgeCrossing();
		int[] times = { 100 };
		int expected = bridgeCrossing.minTime(times);
		int actual = 100;
		Assert.assertEquals("Does not match",expected, actual);
	}
	
	@Test
	public void testExample3() {
		BridgeCrossing bridgeCrossing = new BridgeCrossing();
		int[] times = { 1, 2, 3, 50, 99, 100 };
		int expected = bridgeCrossing.minTime(times);
		int actual = 162;
		Assert.assertEquals("Does not match",expected, actual);
	}

}
