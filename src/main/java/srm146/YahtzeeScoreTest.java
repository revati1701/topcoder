package main.java.srm146;

import static org.junit.Assert.*;

import org.junit.Test;

public class YahtzeeScoreTest {
	
	@Test
	public void testExample0() {
		int[] toss = {2, 2, 3, 5, 4 };
		YahtzeeScore yahtzeeScore = new YahtzeeScore();
		int actual = yahtzeeScore.maxPoints(toss);
		int expected = 5;
		assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample1() {
		int[] toss = { 6, 4, 1, 1, 3 };
		YahtzeeScore yahtzeeScore = new YahtzeeScore();
		int actual = yahtzeeScore.maxPoints(toss);
		int expected = 6;
		assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample2() {
		int[] toss = { 5, 3, 5, 3, 3 };
		YahtzeeScore yahtzeeScore = new YahtzeeScore();
		int actual = yahtzeeScore.maxPoints(toss);
		int expected = 10;
		assertEquals("Does not macth", expected, actual);
	}
}
