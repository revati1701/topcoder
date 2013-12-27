package main.java.srm152;

/*
 * SRM 152 DIV II Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=1765
 */
public class FixedPointTheorem {

	public double cycleRange(double R) {
		double X = 0.25;
		int count = 0;
		while(count < 200000) {
			X = R * X * (1-X);
			count++;
		}
		count = 0;
		double min = 1.0;
		double max = 0.0;
		while(count < 1000) {
			X = R * X * (1 - X);
			if (min > X) {
				min = X;
			} else if (max < X) {
				max = X;
			}
			count++;
		}
		return max - min;
	}
}
