package main.java.srm149;

import org.junit.Assert;
import org.junit.Test;

public class PricingTest {
	
	@Test
	public void example0() {
		int[] price = {9,1,5,5,5,5,4,8,80};
		Pricing p  = new Pricing();
		int actual = p.maxSales(price);
		int expected = 120;
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void example1() {
		int[] price = {17,50,2};
		Pricing p  = new Pricing();
		int actual = p.maxSales(price);
		int expected = 69;
		Assert.assertEquals("Does not match", expected, actual);
	}

	
	@Test
	public void example2() {
		int[] price = {130,110,90,13,6,5,4,3,0};
		Pricing p  = new Pricing();
		int actual = p.maxSales(price);
		int expected = 346;
		Assert.assertEquals("Does not match", expected, actual);
	}


}
