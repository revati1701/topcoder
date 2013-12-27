package main.java.srm148;

import junit.framework.Assert;

import org.junit.Test;

public class CeyKapsTest {
	
	@Test
	public void testExample0() {
		CeyKaps ceyKaps = new CeyKaps();
		String typed = "AAAAA";
		String[] switches = {"A:B","B:C","A:D"};
		String actual = ceyKaps.decipher(typed, switches);
		String expected = "CCCCC";
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample1() {
		CeyKaps ceyKaps = new CeyKaps();
		String typed = "ABCDE";
		String[] switches = {"A:B","B:C","C:D","D:E","E:A"};
		String actual = ceyKaps.decipher(typed, switches);
		String expected = "AEBCD";
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample2() {
		CeyKaps ceyKaps = new CeyKaps();
		String typed = "IHWSIOTCHEDMYKEYCAPSARWUND";
		String[] switches = {"W:O","W:I"};
		String actual = ceyKaps.decipher(typed, switches);
		String expected = "WHOSWITCHEDMYKEYCAPSAROUND";
		Assert.assertEquals("Does not match", expected, actual);
	}

}
