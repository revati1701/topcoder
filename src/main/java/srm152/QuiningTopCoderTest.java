package main.java.srm152;

import junit.framework.Assert;

import org.junit.Test;

public class QuiningTopCoderTest {

	@Test
	public void testExample0() {
		QuiningTopCoder quining = new QuiningTopCoder();
		String source = ",";
		String actual = quining.testCode(source);
		String expected = "QUINES 0";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		QuiningTopCoder quining = new QuiningTopCoder();
		String source = "_";
		String actual = quining.testCode(source);
		String expected = "TIMEOUT";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		QuiningTopCoder quining = new QuiningTopCoder();
		String source = "1:+:1J";
		String actual = quining.testCode(source);
		String expected = "OVERFLOW 147";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		QuiningTopCoder quining = new QuiningTopCoder();
		String source = "0,1+:#@:$1J";
		String actual = quining.testCode(source);
		String expected =  "QUINES 91";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		QuiningTopCoder quining = new QuiningTopCoder();
		String source = "0,1+::9W-9W-S1W1W:+2_J_@_@";
		String actual = quining.testCode(source);
		String expected =  "BADEND 437";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample5() {
		QuiningTopCoder quining = new QuiningTopCoder();
		String source = "#R,#:+1+:#,R#";
		String actual = quining.testCode(source);
		String expected =  "QUINES 97";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample6() {
		QuiningTopCoder quining = new QuiningTopCoder();
		String source = "R,#1+1:";
		String actual = quining.testCode(source);
		String expected =  "MISMATCH 7";
		Assert.assertEquals(expected, actual);
	}
}
