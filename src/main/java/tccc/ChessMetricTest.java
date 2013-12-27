package main.java.tccc;

import org.junit.Assert;
import org.junit.Test;

public class ChessMetricTest {
	
	@Test
	public void testExample0() {
		ChessMetric chessMetric = new ChessMetric();
		int size = 3;
		int[] start = {0, 0};
		int[] end = {1, 0};
		int numMoves = 1;
		long actual = chessMetric.howMany(size, start, end, numMoves);
		long  expected = 1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		ChessMetric chessMetric = new ChessMetric();
		int size = 3;
		int[] start = {0, 0};
		int[] end = {1, 2};
		int  numMoves = 1;
		long  actual = chessMetric.howMany(size, start, end, numMoves);
		long  expected = 1;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		ChessMetric chessMetric = new ChessMetric();
		int size = 3;
		int[] start = {0, 0};
		int[] end = {2, 2};
		int numMoves = 1;
		long  actual = chessMetric.howMany(size, start, end, numMoves);
		long  expected = 0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		ChessMetric chessMetric = new ChessMetric();
		int size = 3;
		int[] start = {0, 0};
		int[] end = {0, 0};
		int numMoves = 2;
		long  actual = chessMetric.howMany(size, start, end, numMoves);
		long  expected = 5;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		ChessMetric chessMetric = new ChessMetric();
		int size = 100;
		int[] start = {0, 0};
		int[] end = {0, 99};
		int numMoves = 50;
		long  actual = chessMetric.howMany(size, start, end, numMoves);
		long  expected = 243097320072600L;
		Assert.assertEquals(expected, actual);
	}

}
