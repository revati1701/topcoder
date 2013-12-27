package main.java.srm153;

import junit.framework.Assert;

import org.junit.Test;

public class MostProfitableTest {
	
	@Test
	public void testExample0() {
		int[] costs = {100,120,150,1000};
		int[] prices = {110,110,200,2000};
		int[] sales = {20,100,50,3};
		String[] items = {"Video Card","256M Mem","CPU/Mobo combo","Complete machine"};
		MostProfitable mostProfitable = new MostProfitable();
		String actual = mostProfitable.bestItem(costs, prices, sales, items);
		String expected = "Complete machine";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		int[] costs = {100};
		int[] prices = {100};
		int[] sales = {134};
		String[] items = {"Service, at cost"};
		MostProfitable mostProfitable = new MostProfitable();
		String actual = mostProfitable.bestItem(costs, prices, sales, items);
		String expected = "";
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testExample2() {
		int[] costs = {38,24};
		int[] prices = {37,23};
		int[] sales = {1000,643};
		String[] items = {"Letter","Postcard"};
		MostProfitable mostProfitable = new MostProfitable();
		String actual = mostProfitable.bestItem(costs, prices, sales, items);
		String expected = "";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		int[] costs = {10,10};
		int[] prices = {11,12};
		int[] sales = {2,1};
		String[] items = {"A","B"};
		MostProfitable mostProfitable = new MostProfitable();
		String actual = mostProfitable.bestItem(costs, prices, sales, items);
		String expected = "A";
		Assert.assertEquals(expected, actual);
	}
}
