package main.java.srm146;

/*
 * SRm 146 DIV 1 Level 1, DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1589
 */
public class RectangularGrid {
	//Do i need to specify size?
	public long countRectangles(int width, int height) {
		long count = 0;
		int curr = 0;
		int[] x = new int[width * height];
		int[] y = new int[width * height];
		for(int i = 1; i <= width; i++) {
			for(int j = 1; j <= height; j++) {
				if(i != j) {
					x[curr] = i;
					y[curr] = j;
					curr++;
				}
			}
		}
		x[curr] = -1;
		y[curr] = -1;
		System.out.println(curr);
		for(int i = 0; i <= width; i++) {
			for(int j = 0; j <= height; j++) {
				//System.out.println("Startting with" + i + " " + j);
				for(int index = 0; x[index] != -1; index++) {
					if(i + x[index] <= width && j + y[index] <= height) {
						//System.out.println("combination" + (i + x[index]) + " " + (j + y[index]));
						count++;
					}
				}
			}
		}
		return count;
		
	}
}
