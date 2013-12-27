package main.java.srm152;

import org.junit.Assert;
import org.junit.Test;

public class LeaguePicksTest {
	
	@Test
	public void testExample0() {
		LeaguePicks leaguePicks = new LeaguePicks();
		int position = 3;
		int friends = 6;
		int picks = 15;
		int[] actuals = leaguePicks.returnPicks(position, friends, picks);
		int[] expecteds = { 3,  10,  15 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample1() {
		LeaguePicks leaguePicks = new LeaguePicks();
		int position = 1;
		int friends = 1;
		int picks = 10;
		int[] actuals = leaguePicks.returnPicks(position, friends, picks);
		int[] expecteds = { 1,  2,  3,  4,  5,  6,  7,  8,  9,  10 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample2() {
		LeaguePicks leaguePicks = new LeaguePicks();
		int position = 1;
		int friends = 2;
		int picks = 39;
		int[] actuals = leaguePicks.returnPicks(position, friends, picks);
		int[] expecteds = { 1,  4,  5,  8,  9,  12,  13,  16,  17,  20,  21,  24,  25,  28,  29,
				  32,  33,  36,  37 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample3() {
		LeaguePicks leaguePicks = new LeaguePicks();
		int position = 5;
		int friends = 11;
		int picks = 100;
		int[] actuals = leaguePicks.returnPicks(position, friends, picks);
		int[] expecteds = { 5,  18,  27,  40,  49,  62,  71,  84,  93 };
		Assert.assertArrayEquals(expecteds, actuals);
	}

}
