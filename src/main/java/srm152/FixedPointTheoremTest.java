package main.java.srm152;

import junit.framework.Assert;

import org.junit.Test;

public class FixedPointTheoremTest {

	@Test
	public void testExample0() {
		FixedPointTheorem fixedPointTheorem = new FixedPointTheorem();
		double R = 0.1;
		double actual = fixedPointTheorem.cycleRange(R);
		double expected = 0.0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		FixedPointTheorem fixedPointTheorem = new FixedPointTheorem();
		double R = 3.05;
		double actual = fixedPointTheorem.cycleRange(R);
		double expected = 0.14754098360655865;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		FixedPointTheorem fixedPointTheorem = new FixedPointTheorem();
		double R = 3.4499;
		double actual = fixedPointTheorem.cycleRange(R);
		double expected = 0.4175631735867292;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		FixedPointTheorem fixedPointTheorem = new FixedPointTheorem();
		double R = 3.55;
		double actual = fixedPointTheorem.cycleRange(R);
		double expected = 0.5325704489850351;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		FixedPointTheorem fixedPointTheorem = new FixedPointTheorem();
		double R = 3.565;
		double actual = fixedPointTheorem.cycleRange(R);
		double expected = 0.5454276003030636;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample5() {
		FixedPointTheorem fixedPointTheorem = new FixedPointTheorem();
		double R = 3.5689;
		double actual = fixedPointTheorem.cycleRange(R);
		double expected = 0.5489996297493569;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample6() {
		FixedPointTheorem fixedPointTheorem = new FixedPointTheorem();
		double R = 3.00005;
		double actual = fixedPointTheorem.cycleRange(R);
		double expected = 0.004713996108955176;
		Assert.assertEquals(expected, actual);
	}
}
