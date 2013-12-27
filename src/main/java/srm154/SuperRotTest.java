package main.java.srm154;

import junit.framework.Assert;

import org.junit.Test;

public class SuperRotTest {

	@Test
	public void testExample0() {
		SuperRot superRot = new SuperRot();
		String message = "Uryyb 28";
		String actual = superRot.decoder(message);
		String expected = "Hello 73";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		SuperRot superRot = new SuperRot();
		String message = "GbcPbqre";
		String actual = superRot.decoder(message);
		String expected = "TopCoder";
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testExample2() {
		SuperRot superRot = new SuperRot();
		String message = "";
		String actual = superRot.decoder(message);
		String expected = "";
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testExample3() {
		SuperRot superRot = new SuperRot();
		String message = "5678901234";
		String actual = superRot.decoder(message);
		String expected = "0123456789";
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testExample4() {
		SuperRot superRot = new SuperRot();
		String message = "NnOoPpQqRr AaBbCcDdEe";
		String actual = superRot.decoder(message);
		String expected = "AaBbCcDdEe NnOoPpQqRr";
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testExample5() {
		SuperRot superRot = new SuperRot();
		String message = "Gvzr vf 54 71 CZ ba Whyl 4gu bs gur lrne 7558 NQ";
		String actual = superRot.decoder(message);
		String expected = "Time is 09 26 PM on July 9th of the year 2003 AD";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample6() {
		SuperRot superRot = new SuperRot();
		String message = "Gur dhvpx oebja sbk whzcf bire n ynml qbt";
		String actual = superRot.decoder(message);
		String expected = "The quick brown fox jumps over a lazy dog";
		Assert.assertEquals(expected, actual);
	}
}
