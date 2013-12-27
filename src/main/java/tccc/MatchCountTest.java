package main.java.tccc;

import junit.framework.Assert;

import org.junit.Test;

public class MatchCountTest {
	@Test
	public void testExample0() {
		MatchCounts matchCounts = new MatchCounts();
		String[] ability = {"045"};
		int actual = matchCounts.howMany(ability);
		int expected = 3;
		Assert.assertEquals(expected, actual);	
	}
	
	@Test
	public void testExample1() {
		MatchCounts matchCounts = new MatchCounts();
		String[] ability = {"01","23"};
		int actual = matchCounts.howMany(ability);
		int expected = 4;
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testExample2() {
		MatchCounts matchCounts = new MatchCounts();
		String[] ability = {"01","01"};
		int actual = matchCounts.howMany(ability);
		int expected = 2;
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testExample3() {
		MatchCounts matchCounts = new MatchCounts();
		String[] ability = {"0","0"};
		int actual = matchCounts.howMany(ability);
		int expected = 0;
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void testExample4() {
		MatchCounts matchCounts = new MatchCounts();
		String[] ability = {"012345","012345","012345","012345","012345","012345"};
		int actual = matchCounts.howMany(ability);
		int expected = 720;
		Assert.assertEquals(expected, actual);		
	}
}
