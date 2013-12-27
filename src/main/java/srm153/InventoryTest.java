package main.java.srm153;

import junit.framework.Assert;

import org.junit.Test;

public class InventoryTest {

	@Test
	public void example0() {
		Inventory inventory = new Inventory();
		int[] sales = {5};
		int[] daysAvailable = {15};
		int actual = inventory.monthlyOrder(sales, daysAvailable);
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void example1() {
		Inventory inventory = new Inventory();
		int[] sales = {75,120,0,93};
		int[] daysAvailable = {24,30,0,30};
		int actual = inventory.monthlyOrder(sales, daysAvailable);
		int expected = 103;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void example2() {
		Inventory inventory = new Inventory();
		int[] sales = {8773};
		int[] daysAvailable = {16};
		int actual = inventory.monthlyOrder(sales, daysAvailable);
		int expected = 16450;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void example3() {
		Inventory inventory = new Inventory();
		int[] sales = {1115,7264,3206,6868,7301};
		int[] daysAvailable = {1,3,9,4,18};
		int actual = inventory.monthlyOrder(sales, daysAvailable);
		int expected = 36091;
		Assert.assertEquals(expected, actual);
	}
}
