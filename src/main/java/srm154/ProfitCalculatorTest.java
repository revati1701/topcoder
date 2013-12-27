package main.java.srm154;

import junit.framework.Assert;

import org.junit.Test;

public class ProfitCalculatorTest {
	
	@Test
	public void testExample0() {
		ProfitCalculator profitCalculator = new ProfitCalculator();
		String[] items = {"012.99 008.73","099.99 050.00","123.45 101.07"};
		int actual = profitCalculator.percent(items);
		int expected = 32;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		ProfitCalculator profitCalculator = new ProfitCalculator();
		String[] items = {"000.00 049.99","999.99 936.22","033.99 025.64","249.99 211.87"};
		int actual = profitCalculator.percent(items);
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		ProfitCalculator profitCalculator = new ProfitCalculator();
		String[] items = {"822.77 704.86","829.42 355.45","887.18 949.38"};
		int actual = profitCalculator.percent(items);
		int expected = 20;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		ProfitCalculator profitCalculator = new ProfitCalculator();
		String[] items = {"612.72 941.34","576.46 182.66","787.41 524.70","637.96 333.23","345.01 219.69",
				 "567.22 104.77","673.02 885.77"};
		int actual = profitCalculator.percent(items);
		int expected = 23;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testExample4() {
		ProfitCalculator profitCalculator = new ProfitCalculator();
		String[] items = {"811.22 275.32","433.89 006.48","141.28 967.41","344.47 786.23","897.47 860.61",
				 "007.42 559.29","255.72 460.00","419.35 931.19","419.25 490.52","199.78 114.44",
				 "505.63 276.58","720.96 735.00","719.90 824.46","816.58 195.94","498.68 453.05",
				 "399.48 921.39","930.88 017.63","422.20 075.39","380.22 917.27","630.83 995.87",
				 "821.07 126.87","715.73 985.62","246.23 134.64","168.28 550.33","707.28 046.72",
				 "117.76 281.87","595.43 410.45","345.28 532.42","554.24 264.34","195.73 814.87",
				 "131.98 041.28","595.13 939.47","576.04 107.70","716.00 404.75","524.24 029.96",
				 "673.49 070.97","288.09 849.43","616.34 236.34","401.96 316.33","371.18 014.27",
				 "809.63 508.33","375.68 290.84","334.66 477.89","689.54 526.35","084.77 316.51",
				 "304.76 015.91","460.63 636.56","357.84 436.20","752.24 047.64","922.10 573.12"};
		int actual = profitCalculator.percent(items);
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}
}
