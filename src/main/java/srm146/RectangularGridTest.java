package main.java.srm146;

import junit.framework.Assert;

import org.junit.Test;

public class RectangularGridTest {

	@Test
	public void testExample0() {
		RectangularGrid rectangularGrid = new RectangularGrid();
		long actual = rectangularGrid.countRectangles(3, 3);
		long expected = 22;
		Assert.assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample1() {
		RectangularGrid rectangularGrid = new RectangularGrid();
		long actual = rectangularGrid.countRectangles(5, 2);
		long expected = 31;
		Assert.assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample2() {
		RectangularGrid rectangularGrid = new RectangularGrid();
		long actual = rectangularGrid.countRectangles(10, 10);
		long expected = 2640;
		Assert.assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample3() {
		RectangularGrid rectangularGrid = new RectangularGrid();
		long actual = rectangularGrid.countRectangles(1, 1);
		long expected = 0;
		Assert.assertEquals("Does not macth", expected, actual);
	}
	
	@Test
	public void testExample4() {
		RectangularGrid rectangularGrid = new RectangularGrid();
		long actual = rectangularGrid.countRectangles(592, 964);
		long expected = 81508708664L;
		Assert.assertEquals("Does not macth", expected, actual);
	}
}
