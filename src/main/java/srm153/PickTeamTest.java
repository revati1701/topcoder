package main.java.srm153;

import org.junit.Assert;
import org.junit.Test;

public class PickTeamTest {
	
	@Test
	public void testExample0() {
		PickTeam pickTeam = new PickTeam();
		int teamSize = 3;
		String[] people = {"ALICE 0 1 -1 3",
				 "BOB 1 0 2 -4",
				 "CAROL -1 2 0 2",
				 "DAVID 3 -4 2 0"};
		String[] actuals = pickTeam.pickPeople(teamSize, people);
		String[] expecteds = { "ALICE",  "CAROL",  "DAVID" };
		Assert.assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testExample1() {
		PickTeam pickTeam = new PickTeam();
		int teamSize = 2;
		String[] people = {"ALICE 0 1 -1 3",
				 "BOB 1 0 2 -4",
				 "CAROL -1 2 0 2",
				 "DAVID 3 -4 2 0"};
		String[] actuals = pickTeam.pickPeople(teamSize, people);
		String[] expecteds = { "ALICE",  "DAVID" };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample2() {
		PickTeam pickTeam = new PickTeam();
		int teamSize = 2;
		String[] people = {"A 0 -2 -2","B -2 0 -1","C -2 -1 0"};
		String[] actuals = pickTeam.pickPeople(teamSize, people);
		String[] expecteds = { "B",  "C" };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testExample3() {
		PickTeam pickTeam = new PickTeam();
		int teamSize = 13;
		String[] people = {"A 0 2 8 7 1 -4 -3 1 8 2 8 2 1 -3 7 1 3 9 -6 -5",
				 "A 2 0 0 7 -7 -5 8 -8 -9 -9 6 -9 -4 -8 8 1 7 0 3 3",
				 "A 8 0 0 -5 -5 -7 1 -3 1 9 -6 6 1 5 6 -9 8 6 -8 -8",
				 "A 7 7 -5 0 7 -5 3 9 8 3 -6 -5 -5 2 -6 2 -2 -1 -2 8",
				 "B 1 -7 -5 7 0 7 -2 -9 3 7 0 -2 1 1 -9 -3 -2 2 1 -2",
				 "B -4 -5 -7 -5 7 0 4 8 6 0 -1 4 1 -2 -9 4 0 -7 6 -2",
				 "B -3 8 1 3 -2 4 0 8 -1 1 -2 -7 5 0 -6 9 0 -3 1 3",
				 "B 1 -8 -3 9 -9 8 8 0 0 -2 5 0 5 8 3 5 2 4 5 4",
				 "C 8 -9 1 8 3 6 -1 0 0 8 -3 8 -6 -4 7 -4 1 -5 5 4",
				 "C 2 -9 9 3 7 0 1 -2 8 0 -9 -6 6 5 -8 -3 -8 2 2 4",
				 "C 8 6 -6 -6 0 -1 -2 5 -3 -9 0 2 7 8 2 -6 -4 -6 4 4",
				 "C 2 -9 6 -5 -2 4 -7 0 8 -6 2 0 0 -3 6 7 -1 2 -4 -2",
				 "D 1 -4 1 -5 1 1 5 5 -6 6 7 0 0 -7 -4 8 -6 -3 4 -6",
				 "D -3 -8 5 2 1 -2 0 8 -4 5 8 -3 -7 0 7 -3 5 -8 5 1",
				 "D 7 8 6 -6 -9 -9 -6 3 7 -8 2 6 -4 7 0 9 -5 -5 -8 3",
				 "D 1 1 -9 2 -3 4 9 5 -4 -3 -6 7 8 -3 9 0 -2 -7 8 -7",
				 "E 3 7 8 -2 -2 0 0 2 1 -8 -4 -1 -6 5 -5 -2 0 6 0 5",
				 "E 9 0 6 -1 2 -7 -3 4 -5 2 -6 2 -3 -8 -5 -7 6 0 4 8",
				 "E -6 3 -8 -2 1 6 1 5 5 2 4 -4 4 5 -8 8 0 4 0 1",
				 "E -5 3 -8 8 -2 -2 3 4 4 4 4 -2 -6 1 3 -7 5 8 1 0"};
		String[] actuals = pickTeam.pickPeople(teamSize, people);
		String[] expecteds = { "A",  "A",  "B",  "B",  "B",  "B",  "C",  "C",  "C",  "D",  "D",  "D",  "E" };
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
}
