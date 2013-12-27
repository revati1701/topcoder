package main.java.srm275;

import org.junit.Assert;
import org.junit.Test;

public class InverseHaar1DTest {
	
	@Test
	public void testExample0() {
		InverseHaar1D inverseHaar = new InverseHaar1D();
		int[] transformedData = {101, -53};
		int L = 1;
		int[] actuals = inverseHaar.transform(transformedData, L);
		int[] expecteds = {24, 77 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample1() {
		InverseHaar1D inverseHaar = new InverseHaar1D();
		int[] transformedData = {3, 8, -1, -2};
		int L = 1;
		int[] actuals = inverseHaar.transform(transformedData, L);
		int[] expecteds = {1, 2, 3, 5 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample2() {
		InverseHaar1D inverseHaar = new InverseHaar1D();
		int[] transformedData = {11, -5, -1, -2};
		int L = 2;
		int[] actuals = inverseHaar.transform(transformedData, L);
		int[] expecteds = {1, 2, 3, 5 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample3() {
		InverseHaar1D inverseHaar = new InverseHaar1D();
		int[] transformedData = {369, 477, 451, 262, 47, 135, 
				 -125, -2, 18, -23, 30, 101, 
				 -5, -18, 54, -20, 11, 45, -5, 
				 70, -24, 2, -50, 15, 55, -62, 
				 -23, -17, 44, -8, -44, -52};
		int L = 3;
		int[] actuals = inverseHaar.transform(transformedData, L);
		int[] expecteds = {62, 51, 70, 25, 32, 37, 81, 11, 72, 96, 70, 68, 43, 93, 25, 10, 67, 12, 11, 73, 56, 79, 68, 85, 68, 24, 15, 23, 6, 50, 12, 64 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
}
