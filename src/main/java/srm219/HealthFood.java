package main.java.srm219;

import java.util.ArrayList;
import java.util.List;

/*
 * SRM 219 DIV I Level 1, DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=3118
 */
public class HealthFood {	
	private class Meal {
		int _protein;
		int _carbs;
		int _fat;
		int _index;
		
		public Meal(int protein, int carbs, int fat, int index) {
			_protein = protein;
			_carbs = carbs;
			_fat = fat;
			_index = index;
		}
	}
	
	int[] selectMeals(int[] protein, int[] carbs, int[] fat, String[] dietPlans) {
		int[] selectMeals = new int[dietPlans.length];
		int index = 0;
		List<Meal> mealList = getMealList(protein, carbs, fat);
		for(String dietPlan : dietPlans) {
			selectMeals[index++] = selectBestMeal(mealList, new StringBuilder(dietPlan));
		}
		return selectMeals;
	}
	
	private int selectBestMeal(List<Meal> mealList, StringBuilder dietPlan) {
		if (mealList.size()  == 1 || dietPlan.length() == 0) {
			return mealList.get(0)._index;
		}
		List<Meal> selected = getBestMeal(mealList, dietPlan.charAt(0));
		return selectBestMeal(selected, dietPlan.deleteCharAt(0));
	}
	
	private List<Meal> getBestMeal(List<Meal> mealList, char plan) {
		List<Meal> bestMealList = new ArrayList<Meal>();
		Meal bestMeal = mealList.get(0);
		for(Meal meal : mealList) {
			int mealValue = getValueForPlan(meal, plan);
			int bestMealValue = getValueForPlan(bestMeal, plan);
			if (bestMealValue == mealValue) {
				bestMealList.add(meal);
			} else if (Character.isLowerCase(plan) && mealValue < bestMealValue) {
				bestMealList.clear();
				bestMealList.add(meal);
			} else if (mealValue > bestMealValue) {
				bestMealList.clear();
				bestMealList.add(meal);
			}
		}
		return bestMealList;
	}
	
	

	private int getValueForPlan(Meal meal, char plan) {
		switch(plan) {
			case 'P':
			case 'p':
				return meal._protein;
			case 'F':
			case 'f':
				return meal._fat;
			case 'C':
			case 'c':
				return meal._fat;
			case 't':
			case 'T':
				return meal._fat * 9 + meal._carbs * 5 + meal._fat * 5;
		}
		return 0;
	}
	
	
	private List<Meal> getMealList(int[] protein, int[] carbs, int[] fat) {
		List<Meal> mealList = new ArrayList<Meal>();
		for(int i = 0; i < protein.length; i++) {
			Meal meal = new Meal(protein[i], carbs[i], fat[i], i);
			mealList.add(meal);
		}
		return mealList;
	}
}
