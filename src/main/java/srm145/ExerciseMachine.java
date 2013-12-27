package main.java.srm145;

/*
 * SRM 145 DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1675
 */
public class ExerciseMachine {
	public int getPercentages(String time) {
		int count = 0;
		
		String[] timeSegments = time.split(":");
		
		// Use parseInt instead of Integer.valueOf when you want int from String
		int hours = Integer.parseInt(timeSegments[0]);
		int minutes = Integer.parseInt(timeSegments[1]);
		int seconds = Integer.parseInt(timeSegments[2]);
		
		int totalSeconds = hours * 60 * 60 + minutes * 60 + seconds;
		Double currSeconds;
		for (int i = 1; i < 100; i++) {
			// Need 100.00 so as to get Double since all the variables involved are int
			currSeconds = i * totalSeconds / 100.00;
			//Nice usage of methods of Double class to check whether currSeconds has fractional part
			if (currSeconds.equals(Double.valueOf(currSeconds.intValue()))) {
				count++;
			}
		}
		return count;
	}
}
