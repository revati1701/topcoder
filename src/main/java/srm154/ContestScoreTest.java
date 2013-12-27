package main.java.srm154;

import org.junit.Assert;
import org.junit.Test;

public class ContestScoreTest {
	
	@Test
	public void testExample0() {
		ContestScore contestScore = new ContestScore();
		String[] data = {"A 90.7 92.9 87.4",
				 "B 90.5 96.6 88.0",
		 "C 92.2 91.0 95.3"};
		String[] actuals = contestScore.sortResults(data);
		String[] expecteds = { "C 5 278.5",  "B 6 275.1",  "A 7 271.0" };
		Assert.assertArrayEquals(expecteds, actuals);		
	}

	@Test
	public void testExample1() {
		ContestScore contestScore = new ContestScore();
		String[] data = {"STANFORD 85.3 90.1 82.6 84.6 96.6 94.5 87.3 90.3",
				 "MIT 95.5 83.9 80.4 85.5 98.7 98.3 96.7 82.7",
				 "PRINCETON 99.2 79.1 87.6 85.1 93.6 96.4 86.0 90.6",
				 "HARVARD 83.6 92.0 85.5 94.3 97.5 91.5 92.5 83.0",
				 "YALE 99.5 92.6 86.2 82.0 96.4 92.6 84.5 78.6",
				 "COLUMBIA 97.2 87.6 81.7 93.7 88.0 86.3 95.9 89.6",
				 "BROWN 92.2 95.8 92.1 81.5 89.5 87.0 95.5 86.4",
				 "PENN 96.3 80.7 81.2 91.6 85.8 92.2 83.9 87.8",
				 "CORNELL 88.0 83.7 85.0 83.8 99.8 92.1 91.0 88.9"};
		String[] actuals = contestScore.sortResults(data);
		String[] expecteds = { "PRINCETON 34 717.6",
				  "MIT 36 721.7",
				  "HARVARD 38 719.9",
				  "COLUMBIA 39 720.0",
				  "STANFORD 39 711.3",
				  "YALE 40 712.4",
				  "BROWN 41 720.0",
				  "CORNELL 42 712.3",
				  "PENN 51 699.5" };
		Assert.assertArrayEquals(expecteds, actuals);		
	}
	
	@Test
	public void testExample2() {
		ContestScore contestScore = new ContestScore();
		String[] data = {};
		String[] actuals = contestScore.sortResults(data);
		String[] expecteds = {};
		Assert.assertArrayEquals(expecteds, actuals);		
	}
	
	@Test
	public void testExample3() {
		ContestScore contestScore = new ContestScore();
		String[] data = {"AA 90.0 80.0 70.0 60.0 50.0 40.0",
				 "BBB 80.0 70.0 60.0 50.0 40.0 90.0",
				 "EEE 70.0 60.0 50.0 40.0 90.0 80.0",
				 "AAA 60.0 50.0 40.0 90.0 80.0 70.0",
				 "DDD 50.0 40.0 90.0 80.0 70.0 60.0",
				 "CCC 40.0 90.0 80.0 70.0 60.0 50.0"};
		String[] actuals = contestScore.sortResults(data);
		String[] expecteds = { "AA 21 390.0",
				  "AAA 21 390.0",
				  "BBB 21 390.0",
				  "CCC 21 390.0",
				  "DDD 21 390.0",
				  "EEE 21 390.0" };
		Assert.assertArrayEquals(expecteds, actuals);		
	}
	
	@Test
	public void testExample4() {
		ContestScore contestScore = new ContestScore();
		String[] data = {"A 00.1", "B 05.2", "C 29.0","D 00.0"};
		String[] actuals = contestScore.sortResults(data);
		String[] expecteds = { "C 1 29.0",  "B 2 5.2",  "A 3 0.1",  "D 4 0.0" };
		Assert.assertArrayEquals(expecteds, actuals);		
	}
}
