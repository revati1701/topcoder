package main.java.srm219;

import org.junit.Assert;
import org.junit.Test;

public class HealthFoodTest {
	
	@Test
	public void testExample0() {
		int[] protein = {3, 4};
		int[] carbs = {2, 8};
		int[] fat = {5, 2};
		String[] dietPlans = {"P", "p", "C", "c", "F", "f", "T", "t"};
		HealthFood healthFood = new HealthFood();
		int[] actuals = healthFood.selectMeals(protein, carbs, fat, dietPlans);
		int[] expecteds = { 1,  0,  1,  0,  0,  1,  1,  0 };
		Assert.assertArrayEquals(expecteds, actuals);
	}

}
