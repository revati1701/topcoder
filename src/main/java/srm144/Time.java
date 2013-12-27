package main.java.srm144;
/*
 * SRM 144 DIV 2 Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1708
 */
public class Time {

	public String whatTime(int seconds) {
		
		int hours = seconds / 3600;
		int remainingMin = seconds - hours * 3600;
		int min = remainingMin / 60;
		int sec = remainingMin - min * 60;
		
		return hours + ":" + min + ":" + sec;
	}
}
