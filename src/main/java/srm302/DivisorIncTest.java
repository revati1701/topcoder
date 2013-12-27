package main.java.srm302;

import junit.framework.Assert;

import org.junit.Test;

public class DivisorIncTest {
	
	@Test
	public void testExample0() {
		DivisorInc divisorInc = new DivisorInc();
		int N = 4;
		int M = 24;
		int actual = divisorInc.countOperations(N, M);
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		DivisorInc divisorInc = new DivisorInc();
		int N = 4;
		int M = 576;
		int actual = divisorInc.countOperations(N, M);
		int expected = 14;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		DivisorInc divisorInc = new DivisorInc();
		int N = 8748;
		int M = 83462;
		int actual = divisorInc.countOperations(N, M);
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		DivisorInc divisorInc = new DivisorInc();
		int N = 235;
		int M = 98234;
		int actual = divisorInc.countOperations(N, M);
		int expected = 21;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		DivisorInc divisorInc = new DivisorInc();
		int N = 4;
		int M = 99991;
		int actual = divisorInc.countOperations(N, M);
		int expected = -1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample5() {
		DivisorInc divisorInc = new DivisorInc();
		int N = 82736;
		int M = 82736;
		int actual = divisorInc.countOperations(N, M);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

}
