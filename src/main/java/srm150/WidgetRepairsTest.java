package main.java.srm150;

import org.junit.Assert;
import org.junit.Test;

public class WidgetRepairsTest {
	
	@Test
	public void testExample0() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();
		int[] arrivals = {10, 0, 0, 4, 20 };
		int numPerDay = 8;
		int actual = widgetRepairs.days(arrivals, numPerDay);
		int expected = 6;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();
		int[] arrivals = {0, 0, 0};
		int numPerDay = 10;
		int actual = widgetRepairs.days(arrivals, numPerDay);
		int expected = 0;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testExample2() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();
		int[] arrivals = { 100, 100 };
		int numPerDay = 10;
		int actual = widgetRepairs.days(arrivals, numPerDay);
		int expected = 20;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();
		int[] arrivals = { 27, 0, 0, 0, 0, 9 };
		int numPerDay = 9;
		int actual = widgetRepairs.days(arrivals, numPerDay);
		int expected = 4;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		WidgetRepairs widgetRepairs = new WidgetRepairs();
		int[] arrivals = { 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 };
		int numPerDay = 3;
		int actual = widgetRepairs.days(arrivals, numPerDay);
		int expected = 15;
		Assert.assertEquals(expected, actual);
	}
}
