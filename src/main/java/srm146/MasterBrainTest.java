package main.java.srm146;

import org.junit.Test;

import junit.framework.Assert;

public class MasterBrainTest {
	
	@Test
	public void testExample0() {
		MasterBrain masterBrain = new MasterBrain();
		String[] guesses = {"1575"};
		String[] results = {"4b 0w"};
		int actual = masterBrain.possibleSecrets(guesses, results);
		int expected =  2400;
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample1() {
		MasterBrain masterBrain = new MasterBrain();
		String[] guesses = {"1234"};
		String[] results = {"0b 4w"};
		int actual = masterBrain.possibleSecrets(guesses, results);
		int expected =  2392;
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample2() {
		MasterBrain masterBrain = new MasterBrain();
		String[] guesses = {"6172","6162","3617"};
		String[] results = {"3b 0w","2b 1w","0b 3w"};
		int actual = masterBrain.possibleSecrets(guesses, results);
		int expected =  14;
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample3() {
		MasterBrain masterBrain = new MasterBrain();
		String[] guesses = {"1513","5654","4564","1377","1671","1342"};
		String[] results = {"1b 0w","0b 1w","1b 0w","1b 0w","0b 1w","0b 1w"};
		int actual = masterBrain.possibleSecrets(guesses, results);
		int expected =  6;
		Assert.assertEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample4() {
		MasterBrain masterBrain = new MasterBrain();
		String[] guesses = {"2611", "1371", "7417", "2647", "3735", "4272", "2442", "3443", "1252", "3353"};
		String[] results = {"0b 2w","0b 2w","0b 1w","0b 2w","1b 0w","1b 0w","1b 0w","0b 1w","1b 1w","0b 1w"};
		int actual = masterBrain.possibleSecrets(guesses, results);
		int expected =  1;
		Assert.assertEquals("Does not match", expected, actual);
	}

}
