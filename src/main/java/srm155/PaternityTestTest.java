package main.java.srm155;

import org.junit.Assert;
import org.junit.Test;

public class PaternityTestTest {
	
	@Test
	public void testExample0() {
		PaternityTest paternityTest = new PaternityTest();
		String child = "ABCD";
		String mother = "AXCY";
		String[] men = { "SBTD", "QRCD" };
		int[] actuals = paternityTest.possibleFathers(child, mother, men);
		int[] expecteds = {0};
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample1() {
		PaternityTest paternityTest = new PaternityTest();
		String child = "ABCD";
		String mother = "ABCX";
		String[] men = { "ABCY", "ASTD", "QBCD" } ;
		int[] actuals = paternityTest.possibleFathers(child, mother, men);
		int[] expecteds = { 1,  2 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample2() {
		PaternityTest paternityTest = new PaternityTest();
		String child = "ABABAB";
		String mother = "ABABAB";
		String[] men = { "ABABAB", "ABABCC", "ABCCDD", "CCDDEE" } ;
		int[] actuals = paternityTest.possibleFathers(child, mother, men);
		int[] expecteds = { 0,  1 };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample3() {
		PaternityTest paternityTest = new PaternityTest();
		String child = "YZGLSYQT";
		String mother = "YUQRWYQT";
		String[] men = {"YZQLDPWT", "BZELSWQM", "OZGPSFKT", "GZTKFYQT", "WQJLSMQT"} ;
		int[] actuals = paternityTest.possibleFathers(child, mother, men);
		int[] expecteds = { };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample4() {
		PaternityTest paternityTest = new PaternityTest();
		String child = "WXETPYCHUWSQEMKKYNVP";
		String mother = "AXQTUQVAUOSQEEKCYNVP";
		String[] men = { "WNELPYCHXWXPCMNKDDXD",
				  "WFEEPYCHFWDNPMKKALIW",
				  "WSEFPYCHEWEFGMPKIQCK",
				  "WAEXPYCHAWEQXMSKYARN",
				  "WKEXPYCHYWLLFMGKKFBB" };
		int[] actuals = paternityTest.possibleFathers(child, mother, men);
		int[] expecteds = { 1,  3 };
		Assert.assertArrayEquals(expecteds, actuals);
	}

}
