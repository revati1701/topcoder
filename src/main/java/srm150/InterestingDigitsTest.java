package main.java.srm150;

import org.junit.Assert;
import org.junit.Test;

public class InterestingDigitsTest {
	
	@Test
	public void testExample0() {
		InterestingDigits interestingDigits = new InterestingDigits();
		int base = 10;
		int[] actual = interestingDigits.digits(base);
		int[] expected = {3, 9};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		InterestingDigits interestingDigits = new InterestingDigits();
		int base = 3;
		int[] actual = interestingDigits.digits(base);
		int[] expected = {2};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		InterestingDigits interestingDigits = new InterestingDigits();
		int base = 9;
		int[] actual = interestingDigits.digits(base);
		int[] expected = { 2,  4,  8 };
		Assert.assertArrayEquals(expected, actual);
	}
	

	@Test
	public void testExample3() {
		InterestingDigits interestingDigits = new InterestingDigits();
		int base = 26;
		int[] actual = interestingDigits.digits(base);
		int[] expected = { 5,  25 };
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		InterestingDigits interestingDigits = new InterestingDigits();
		int base = 30;
		int[] actual = interestingDigits.digits(base);
		int[] expected = {29};
		Assert.assertArrayEquals(expected, actual);
	}
}
