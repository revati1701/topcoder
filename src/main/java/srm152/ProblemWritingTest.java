package main.java.srm152;

import junit.framework.Assert;

import org.junit.Test;

public class ProblemWritingTest {
	
	@Test
	public void testExample0() {
		ProblemWriting problemWriting = new ProblemWriting();
		String dotForm = "3+5";
		String actual = problemWriting.myCheckData(dotForm);
		String expected = "";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		ProblemWriting problemWriting = new ProblemWriting();
		String dotForm = "9..+.5...*....3";
		String actual = problemWriting.myCheckData(dotForm);
		String expected = "";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		ProblemWriting problemWriting = new ProblemWriting();
		String dotForm = "5.3+4";
		String actual = problemWriting.myCheckData(dotForm);
		String expected = "dotForm is not in dot notation, check character 2.";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		ProblemWriting problemWriting = new ProblemWriting();
		String dotForm = "9*9*9*9*9*9*9*9*9*9*9*9*9*9";
		String actual = problemWriting.myCheckData(dotForm);
		String expected = "dotForm must contain between 1 and 25 characters, inclusive.";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		ProblemWriting problemWriting = new ProblemWriting();
		String dotForm = "3.........../...........4";
		String actual = problemWriting.myCheckData(dotForm);
		String expected = "";
		Assert.assertEquals(expected, actual);
	}

}
