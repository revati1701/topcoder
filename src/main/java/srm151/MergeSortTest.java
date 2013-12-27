package main.java.srm151;

import junit.framework.Assert;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testExample0() {
		MergeSort mergeSort = new MergeSort();
		int[] numbers = {1, 2, 3, 4};
		int actual = mergeSort.howManyComparisons(numbers);
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		MergeSort mergeSort = new MergeSort();
		int[] numbers = {2, 3, 2};
		int actual = mergeSort.howManyComparisons(numbers);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		MergeSort mergeSort = new MergeSort();
		int[] numbers = {-17};
		int actual = mergeSort.howManyComparisons(numbers);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		MergeSort mergeSort = new MergeSort();
		int[] numbers = {};
		int actual = mergeSort.howManyComparisons(numbers);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		MergeSort mergeSort = new MergeSort();
		int[] numbers = {-2000000000,2000000000,0,0,0,-2000000000,2000000000,0,0,0};
		int actual = mergeSort.howManyComparisons(numbers);
		int expected = 19;
		Assert.assertEquals(expected, actual);
	}
}
