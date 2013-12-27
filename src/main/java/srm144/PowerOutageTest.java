package main.java.srm144;

import junit.framework.Assert;

import org.junit.Test;

public class PowerOutageTest {

	@Test
	public void testExample0() {
		int[] fromJunction = {0};
		int [] toJunction = {1};
		int[] ductLength = {10};
		
		PowerOutage powerOutage = new PowerOutage();
		int actual = powerOutage.estimateTimeOut(fromJunction, toJunction, ductLength);
		int expected = 10;
		Assert.assertEquals("Longest time does not match", expected, actual);
	}
	
	@Test
	public void testExample1() {
		int[] fromJunction = {0,1,0};
		int [] toJunction = {1,2,3};
		int[] ductLength = {10,10,10};
		
		PowerOutage powerOutage = new PowerOutage();
		int actual = powerOutage.estimateTimeOut(fromJunction, toJunction, ductLength);
		int expected = 40;
		Assert.assertEquals("Longest time does not match", expected, actual);
	}
	
	@Test
	public void testExample2() {
		int[] fromJunction = {0,0,0,1,4};
		int [] toJunction = {1,3,4,2,5};
		int[] ductLength = {10,10,100,10,5};
		
		PowerOutage powerOutage = new PowerOutage();
		int actual = powerOutage.estimateTimeOut(fromJunction, toJunction, ductLength);
		int expected = 165;
		Assert.assertEquals("Longest time does not match", expected, actual);
	}
	
	@Test
	public void testExample3() {
		int[] fromJunction = {0,0,0,1,4,4,6,7,7,7,20};
		int [] toJunction = {1,3,4,2,5,6,7,20,9,10,31};
		int[] ductLength =  {10,10,100,10,5,1,1,100,1,1,5};
		
		PowerOutage powerOutage = new PowerOutage();
		int actual = powerOutage.estimateTimeOut(fromJunction, toJunction, ductLength);
		int expected = 281;
		Assert.assertEquals("Longest time does not match", expected, actual);
	}
	
	@Test
	public void testExample4() {
		int[] fromJunction = {0,0,0,0,0};
		int [] toJunction = {1,2,3,4,5};
		int[] ductLength = {100,200,300,400,500};
		
		PowerOutage powerOutage = new PowerOutage();
		int actual = powerOutage.estimateTimeOut(fromJunction, toJunction, ductLength);
		int expected = 2500;
		Assert.assertEquals("Longest time does not match", expected, actual);
	}
}
