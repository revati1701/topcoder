package main.java.srm145;

import org.junit.Assert;
import org.junit.Test;


public class BonusesTest {
	@Test
	public void testExample0() {
		int points[] = {1,2,3,4,5};
		
		Bonuses bonuses = new Bonuses();
		int[] actual = bonuses.getDivision(points);
		int[] expected =  { 6,  13,  20,  27,  34 };
		Assert.assertArrayEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample1() {
		int points[] = {5,5,5,5,5,5};
		
		Bonuses bonuses = new Bonuses();
		int[] actual = bonuses.getDivision(points);
		int[] expected =  { 17,  17,  17,  17,  16,  16 };
		Assert.assertArrayEquals("Does not match", expected, actual);
	}
	
	@Test
	public void testExample2() {
		int points[] = {485, 324, 263, 143, 470, 292, 304, 188, 100, 254, 296,
				 255, 360, 231, 311, 275,  93, 463, 115, 366, 197, 470};
		
		Bonuses bonuses = new Bonuses();
		int[] actual = bonuses.getDivision(points);
		int[] expected =  { 8,  6,  4,  2,  8,  5,  5,  3,  1,  4,  5,  4,  6,  3,  5,  4,  1,  8,
				  1,  6,  3,  8 };
		Assert.assertArrayEquals("Does not match", expected, actual);
		
	}
}