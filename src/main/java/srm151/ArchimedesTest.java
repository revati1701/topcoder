package main.java.srm151;

import junit.framework.Assert;

import org.junit.Test;

public class ArchimedesTest {

	@Test
	public void testExample0() {
		Archimedes archimedes = new Archimedes();
		double actual = archimedes.approximatePi(3);
		double expected = 2.598076211353316;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		Archimedes archimedes = new Archimedes();
		double actual = archimedes.approximatePi(3);
		double expected = 2.598076211353316;
		Assert.assertEquals(expected, actual);
	}
}
