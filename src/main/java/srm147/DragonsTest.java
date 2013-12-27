package main.java.srm147;

import org.junit.Test;

import junit.framework.Assert;

public class DragonsTest {
	
	@Test
	public void testExample0() {
		Dragons dragons = new Dragons();
		int[] initialFood = {0, 0, 4, 0, 0, 0};
		int rounds = 2;
		String actual = dragons.snaug(initialFood, rounds);
		String expected = "1";
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample1() {
		Dragons dragons = new Dragons();
		int[] initialFood = {0, 0, 4, 0, 0, 0};
		int rounds = 3;
		String actual = dragons.snaug(initialFood, rounds);
		String expected = "1/2";
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample2() {
		Dragons dragons = new Dragons();
		int[] initialFood = {1000, 1000, 1000, 1000, 1000, 1000};
		int rounds = 45;
		String actual = dragons.snaug(initialFood, rounds);
		String expected = "1000";
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample3() {
		Dragons dragons = new Dragons();
		int[] initialFood = {1, 2, 3, 4, 5, 6};
		int rounds = 45;
		String actual = dragons.snaug(initialFood, rounds);
		String expected = "7/2";
		Assert.assertEquals("Does not match", expected, actual);
	}

}
