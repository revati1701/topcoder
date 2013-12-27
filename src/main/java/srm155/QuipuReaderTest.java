package main.java.srm155;

import org.junit.Assert;
import org.junit.Test;

public class QuipuReaderTest {

	@Test
	public void testExample0() {
		QuipuReader quipuReader = new QuipuReader();
		String[] knots = { "-XXXXXXX--XX-----XXXXX---",
				  "---XX----XXX-----XXXX----",
		  "-XXXXX---XXXXX--XXXXXXXX-" };
		int[] actuals = quipuReader.readKnots(knots);
		int[] expecteds = { 725,  234,  558 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample1() {
		QuipuReader quipuReader = new QuipuReader();
		String[] knots = { "XX---XXXX",
		  "XXX-----X" };
		int[] actuals = quipuReader.readKnots(knots);
		int[] expecteds = { 24,  31 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample2() {
		QuipuReader quipuReader = new QuipuReader();
		String[] knots = 
			{ "-XXX---XX----X",
			  "--X----X-XXXXX",
		      "-XX--XXXX---XX" };
		int[] actuals = quipuReader.readKnots(knots);
		int[] expecteds = { 321,  115,  242 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample3() {
		QuipuReader quipuReader = new QuipuReader();
		String[] knots = { "-------X--------",
				  "--XXX----XXXX---",
		  "--------------XX" };
		int[] actuals = quipuReader.readKnots(knots);
		int[] expecteds = { 100,  3040,  2 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample4() {
		QuipuReader quipuReader = new QuipuReader();
		String[] knots = { "--XXX-XXXXXXXX----------XXXXXXXXX--XXXXXXXX-",
				  "--XX----XXXX-----XXXXXX---XXX------XXXXXXXX-",
				  "--------------------X----XXXXXXXX--XXXXXXXX-",
				  "--XX-------X------XXXX----XXX-------XXXXXX--",
				  "--XXX---XXXXX-------X------XX--------X------",
				  "-XXXX--XXXXXXX-----------XXXXXXX----XXXXX---",
				  "-----------X---XXXXXXXX----XX--------XXX----",
				  "-----------X---XXXXXXXX----X----------------",
				  "---X--XXXXXXXX--XXXXXXX---XXX---------------",
				  "--XX---XXXXXXX--XXXXXXX----XX-------XXXXX---" };
		int[] actuals = quipuReader.readKnots(knots);
		int[] expecteds = { 38098,  24638,  188,  21436,  35121,  47075,  1823,  1810,  18730,  27725 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
}
