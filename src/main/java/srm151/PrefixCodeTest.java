package main.java.srm151;

import junit.framework.Assert;

import org.junit.Test;

public class PrefixCodeTest {
	
	@Test
	public void testExample0() {
		PrefixCode prefixCode = new PrefixCode();
		String[] words = {"trivial"};
		String actual = prefixCode.isOne(words);
		String expected = "Yes";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		PrefixCode prefixCode = new PrefixCode();
		String[] words = {"10001", "011", "100", "001", "10"};
		String actual = prefixCode.isOne(words);
		String expected = "No, 2";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		PrefixCode prefixCode = new PrefixCode();
		String[] words = {"no", "nosy", "neighbors", "needed"};
		String actual = prefixCode.isOne(words);
		String expected = "No, 0";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		PrefixCode prefixCode = new PrefixCode();
		String[] words = {"1010", "11", "100", "0", "1011"};
		String actual = prefixCode.isOne(words);
		String expected = "Yes";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		PrefixCode prefixCode = new PrefixCode();
		String[] words = {"1010", "11", "100", "0", "1011"};
		String actual = prefixCode.isOne(words);
		String expected = "Yes";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample5() {
		PrefixCode prefixCode = new PrefixCode();
		String[] words = {"No", "not"};
		String actual = prefixCode.isOne(words);
		String expected = "Yes";
		Assert.assertEquals(expected, actual);
	}

}
