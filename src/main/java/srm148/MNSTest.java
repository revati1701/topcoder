package main.java.srm148;

import junit.framework.Assert;

import org.junit.Test;

public class MNSTest {
	
	@Test
	public void testExample0() {
		MNS mns = new MNS();
		int[] numbers = {1,2,3,3,2,1,2,2,2};
		int actual = mns.combos(numbers);
		int expected = 18;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		MNS mns = new MNS();
		int[] numbers = {4,4,4,4,4,4,4,4,4};
		int actual = mns.combos(numbers);
		int expected = 1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		MNS mns = new MNS();
		int[] numbers = {1,5,1,2,5,6,2,3,2};
		int actual = mns.combos(numbers);
		int expected = 36;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testExample3() {
		MNS mns = new MNS();
		int[] numbers = {1,2,6,6,6,4,2,6,4};
		int actual = mns.combos(numbers);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
}
