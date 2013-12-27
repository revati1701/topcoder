package main.java.srm145;

import org.junit.Test;

import junit.framework.Assert;

public class VendingMachineTest {
	
	@Test
	public void testExample0() {
		String[] prices = {"100 100 100"};
		String[] purchases = {"0,0:0", "0,2:5", "0,1:10"};
		VendingMachine machine = new VendingMachine();
		int actual = machine.motorUse(prices, purchases);
		int expected = 4;
		Assert.assertEquals("Did not match", expected, actual);
	}
	
	@Test
	public void testExample1() {
		String[] prices = {"100 200 300 400 500 600"};
		String[] purchases = {"0,2:0", "0,3:5", "0,1:10", "0,4:15"};
		VendingMachine machine = new VendingMachine();
		int actual = machine.motorUse(prices, purchases);
		int expected = 17;
		Assert.assertEquals("Did not match", expected, actual);
	}
	

	
	@Test
	public void testExample2() {
		String[] prices = {"100 200 300 400 500 600"};
		String[] purchases = {"0,2:0", "0,3:4", "0,1:8", "0,4:12"};
		VendingMachine machine = new VendingMachine();
		int actual = machine.motorUse(prices, purchases);
		int expected = 11;
		Assert.assertEquals("Did not match", expected, actual);
	}
	
	@Test
	public void testExample3() {
		String[] prices = {"100 100 100"};
		String[] purchases = {"0,0:10", "0,0:11"};
		VendingMachine machine = new VendingMachine();
		int actual = machine.motorUse(prices, purchases);
		int expected = -1;
		Assert.assertEquals("Did not match", expected, actual);
	}
	
	@Test
	public void testExample4() {
		String[] prices = {"100 200 300",
		 "600 500 400"};
		String[] purchases = {"0,0:0", "1,1:10", "1,2:20",
				 "0,1:21", "1,0:22", "0,2:35"};
		VendingMachine machine = new VendingMachine();
		int actual = machine.motorUse(prices, purchases);
		int expected = 6;
		Assert.assertEquals("Did not match", expected, actual);
	}

}
