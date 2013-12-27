package main.java.srm149;

import org.junit.Assert;
import org.junit.Test;

public class BigBurgerTest {
	
	@Test
	public void example0() {
		int[] arrival = {3,3,9};
		int[] service = {2,15,14};
		BigBurger b = new BigBurger();
		int actual = b.maxWait(arrival, service);
		int expected = 11;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void example1() {
		int[] arrival = {182};
		int[] service = {11};
		BigBurger b = new BigBurger();
		int actual = b.maxWait(arrival, service);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void example2() {
		int[] arrival = {2,10,11};
		int[] service = {3,4,3};
		BigBurger b = new BigBurger();
		int actual = b.maxWait(arrival, service);
		int expected = 3;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void example3() {
		int[] arrival = {2,10,12};
		int[] service = {15,1,15};
		BigBurger b = new BigBurger();
		int actual = b.maxWait(arrival, service);
		int expected = 7;
		Assert.assertEquals(expected, actual);
	}
}
