package main.java.srm144;

import org.junit.Assert;
import org.junit.Test;

public class LotteryTest {
	
	@Test
	public void testExample0() {
		String[] rules = {"PICK ANY TWO: 10 2 F F"
				,"PICK TWO IN ORDER: 10 2 T F"
				,"PICK TWO DIFFERENT: 10 2 F T"
				,"PICK TWO LIMITED: 10 2 T T"};
		
		String[] expected = { "PICK TWO LIMITED",
				  "PICK TWO IN ORDER",
				  "PICK TWO DIFFERENT",
				  "PICK ANY TWO" };
		
		Lottery lottery = new Lottery();
		String[] actual = lottery.sortByOdds(rules);
		
		Assert.assertEquals("Size of arrays is not equal", expected.length, actual.length);
		
		for(int i = 0; i < actual.length; i++) {
			Assert.assertEquals("Does not match", expected[i], actual[i]);
		}
	}
	
	@Test
	public void testExample1() {
		String[] rules = {"INDIGO: 93 8 T F",
				 "ORANGE: 29 8 F T",
				 "VIOLET: 76 6 F F",
				 "BLUE: 100 8 T T",
				 "RED: 99 8 T T",
				 "GREEN: 78 6 F T",
				 "YELLOW: 75 6 F F"};
		
		String[] expected =  { "RED",  "ORANGE",  "YELLOW",  "GREEN",  "BLUE",  "INDIGO",  "VIOLET" };
		
		Lottery lottery = new Lottery();
		String[] actual = lottery.sortByOdds(rules);
		
		Assert.assertEquals("Size of arrays is not equal", expected.length, actual.length);
		
		for(int i = 0; i < actual.length; i++) {
			Assert.assertEquals("Does not match", expected[i], actual[i]);
		}
	}
	
	@Test
	public void testExample2() {
		String[] rules = {};
		
		String[] expected =  {};
		
		Lottery lottery = new Lottery();
		String[] actual = lottery.sortByOdds(rules);
		
		Assert.assertEquals("Size of arrays is not equal", expected.length, actual.length);
		
		for(int i = 0; i < actual.length; i++) {
			Assert.assertEquals("Does not match", expected[i], actual[i]);
		}
	}
}
