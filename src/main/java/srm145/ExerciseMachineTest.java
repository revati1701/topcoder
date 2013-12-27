package main.java.srm145;

import junit.framework.Assert;

import org.junit.Test;

public class ExerciseMachineTest {

	@Test
	public void testExample0() {
		String time = "00:30:00";
		int expected = 99;
		ExerciseMachine exerciseMachine = new ExerciseMachine();
		int actual = exerciseMachine.getPercentages(time);
		Assert.assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample1() {
		String time = "00:28:00";
		int expected = 19;
		ExerciseMachine exerciseMachine = new ExerciseMachine();
		int actual = exerciseMachine.getPercentages(time);
		Assert.assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample2() {
		String time = "23:59:59";
		int expected = 0;
		ExerciseMachine exerciseMachine = new ExerciseMachine();
		int actual = exerciseMachine.getPercentages(time);
		Assert.assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample3() {
		String time = "00:14:10";
		int expected = 49;
		ExerciseMachine exerciseMachine = new ExerciseMachine();
		int actual = exerciseMachine.getPercentages(time);
		Assert.assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample4() {
		String time = "00:19:16";
		int expected = 3;
		ExerciseMachine exerciseMachine = new ExerciseMachine();
		int actual = exerciseMachine.getPercentages(time);
		Assert.assertEquals("Does not macth", expected, actual);
	}
}
