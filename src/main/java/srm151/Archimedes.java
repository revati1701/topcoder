package main.java.srm151;

/*
 * SRM 151 DIV I Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1693
 */
public class Archimedes {
	public double approximatePi(int numSides) {
		double angle = 180 - 360 / numSides;
		double radius = Math.cos(angle)/2;
		return numSides / (2 * radius);
	}
}
