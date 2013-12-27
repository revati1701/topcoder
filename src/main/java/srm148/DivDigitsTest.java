package main.java.srm148;

import junit.framework.Assert;


import org.junit.Test;

public class DivDigitsTest {
	
	@Test
	public void testExample0() {
		DivDigits divisorDigits = new DivDigits();
		int number = 12345;
		int actual = divisorDigits.howMany(number);
		int expected = 3;
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample1() {
		DivDigits divisorDigits = new DivDigits();
		int number = 661232;
		int actual = divisorDigits.howMany(number);
		int expected = 3;
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample2() {
		DivDigits divisorDigits = new DivDigits();
		int number = 52527;
		int actual = divisorDigits.howMany(number);
		int expected = 0;
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample3() {
		DivDigits divisorDigits = new DivDigits();
		int number = 730000000;
		int actual = divisorDigits.howMany(number);
		int expected = 0;
		Assert.assertEquals("Does not match", expected, actual);
	}

}
