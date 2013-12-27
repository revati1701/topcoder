package main.java.srm144;


import junit.framework.Assert;

import org.junit.Test;

public class TimeTest {
	@Test
	public void Example0() {
		Time time = new Time();
		String actual = time.whatTime(0);
		String expected = "0:0:0";
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void Example1() {
		Time time = new Time();
		String actual = time.whatTime(3661);
		String expected = "1:1:1";
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void Example2() {
		Time time = new Time();
		String actual = time.whatTime(5436);
		String expected = "1:30:36";
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void Example3() {
		Time time = new Time();
		String actual = time.whatTime(86399);
		String expected = "23:59:59";
		Assert.assertEquals("Does not match", expected, actual);
	}
}
