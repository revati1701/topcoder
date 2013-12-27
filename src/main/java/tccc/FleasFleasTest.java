package main.java.tccc;

import junit.framework.Assert;

import org.junit.Test;

public class FleasFleasTest {
	@Test
	public void testExample0() {
		FleasFleas fleas = new FleasFleas();
		int n = 30;
		int k = 7;
		int actual = fleas.population(n, k);
		int expected = 660;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		FleasFleas fleas = new FleasFleas();
		int n = 100;
		int k = 3;
		int actual = fleas.population(n, k);
		int expected = 400;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		FleasFleas fleas = new FleasFleas();
		int n = 100;
		int k = 100;
		int actual = fleas.population(n, k);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		FleasFleas fleas = new FleasFleas();
		int n = 50;
		int k = 15;
		int actual = fleas.population(n, k);
		int expected = 45800;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		FleasFleas fleas = new FleasFleas();
		int n = 100;
		int k = 0;
		int actual = fleas.population(n, k);
		int expected = 100;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample5() {
		FleasFleas fleas = new FleasFleas();
		int n = 56;
		int k = 23;
		int actual = fleas.population(n, k);
		int expected = 9970464;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample6() {
		FleasFleas fleas = new FleasFleas();
		int n = 2;
		int k = 2;
		int actual = fleas.population(n, k);
		int expected = 6;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample7() {
		FleasFleas fleas = new FleasFleas();
		int n = 5;
		int k = 5;
		int actual = fleas.population(n, k);
		int expected = 30;
		Assert.assertEquals(expected, actual);
	}
}
