package main.java.srm147;

/*
 * SRM 147 DIV I LEVEL 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1520
 */
//SRM 147 DIV 1 Level 2


public class Dragons {
	
	private enum Side {
		FRONT(0),
		BACK(1),
		UP(2),
		DOWN(3),
		LEFT(4),
		RIGHT(5);
		
		private int _index;
		private Side(int i) {
			_index = i;
		}
		
		private int getIndex() {
			return _index;
		}
	}
	
	public String snaug(int[] initialFood, int rounds) {
		
		double[] portionTaken = new double[6];
		
		double[] currentPortion  = { initialFood[Side.FRONT.getIndex()], initialFood[Side.BACK.getIndex()], 
				initialFood[Side.UP.getIndex()], initialFood[Side.DOWN.getIndex()], initialFood[Side.LEFT.getIndex()],
				 initialFood[Side.RIGHT.getIndex()]	};
		
		
		for(int i =  0; i < rounds; i++) {
			populatePortionTake(portionTaken, currentPortion);
			
			//process Front
			currentPortion[Side.FRONT.getIndex()] += portionTaken[Side.UP.getIndex()] + portionTaken[Side.DOWN.getIndex()] + 
					portionTaken[Side.LEFT.getIndex()] + portionTaken[Side.RIGHT.getIndex()];
			currentPortion[Side.UP.getIndex()] -=  portionTaken[Side.UP.getIndex()];
			currentPortion[Side.DOWN.getIndex()] -=  portionTaken[Side.DOWN.getIndex()];
			currentPortion[Side.LEFT.getIndex()] -=  portionTaken[Side.LEFT.getIndex()];
			currentPortion[Side.RIGHT.getIndex()] -=  portionTaken[Side.RIGHT.getIndex()];
			
			//process Back
			currentPortion[Side.BACK.getIndex()] += portionTaken[Side.UP.getIndex()] + portionTaken[Side.DOWN.getIndex()] + 
					portionTaken[Side.LEFT.getIndex()] + portionTaken[Side.RIGHT.getIndex()];
			currentPortion[Side.UP.getIndex()] -=  portionTaken[Side.UP.getIndex()];
			currentPortion[Side.DOWN.getIndex()] -=  portionTaken[Side.DOWN.getIndex()];
			currentPortion[Side.LEFT.getIndex()] -=  portionTaken[Side.LEFT.getIndex()];
			currentPortion[Side.RIGHT.getIndex()] -=  portionTaken[Side.RIGHT.getIndex()];
			
			//process UP
			currentPortion[Side.UP.getIndex()] += portionTaken[Side.FRONT.getIndex()] + portionTaken[Side.BACK.getIndex()] + 
					portionTaken[Side.LEFT.getIndex()] + portionTaken[Side.RIGHT.getIndex()];
			currentPortion[Side.FRONT.getIndex()] -=  portionTaken[Side.FRONT.getIndex()];
			currentPortion[Side.BACK.getIndex()] -=  portionTaken[Side.BACK.getIndex()];
			currentPortion[Side.LEFT.getIndex()] -=  portionTaken[Side.LEFT.getIndex()];
			currentPortion[Side.RIGHT.getIndex()] -=  portionTaken[Side.RIGHT.getIndex()];
			
			//process DOWN
			currentPortion[Side.DOWN.getIndex()] += portionTaken[Side.FRONT.getIndex()] + portionTaken[Side.BACK.getIndex()] + 
					portionTaken[Side.LEFT.getIndex()] + portionTaken[Side.RIGHT.getIndex()];
			currentPortion[Side.FRONT.getIndex()] -=  portionTaken[Side.FRONT.getIndex()];
			currentPortion[Side.BACK.getIndex()] -=  portionTaken[Side.BACK.getIndex()];
			currentPortion[Side.LEFT.getIndex()] -=  portionTaken[Side.LEFT.getIndex()];
			currentPortion[Side.RIGHT.getIndex()] -=  portionTaken[Side.RIGHT.getIndex()];
			
			//process LEFT
			currentPortion[Side.LEFT.getIndex()] += portionTaken[Side.FRONT.getIndex()] + portionTaken[Side.BACK.getIndex()] + 
					portionTaken[Side.UP.getIndex()] + portionTaken[Side.DOWN.getIndex()];
			currentPortion[Side.FRONT.getIndex()] -=  portionTaken[Side.FRONT.getIndex()];
			currentPortion[Side.BACK.getIndex()] -=  portionTaken[Side.BACK.getIndex()];
			currentPortion[Side.UP.getIndex()] -=  portionTaken[Side.UP.getIndex()];
			currentPortion[Side.DOWN.getIndex()] -=  portionTaken[Side.DOWN.getIndex()];
			
			//process Right
			currentPortion[Side.RIGHT.getIndex()] += portionTaken[Side.FRONT.getIndex()] + portionTaken[Side.BACK.getIndex()] + 
					portionTaken[Side.UP.getIndex()] + portionTaken[Side.DOWN.getIndex()];
			currentPortion[Side.FRONT.getIndex()] -=  portionTaken[Side.FRONT.getIndex()];
			currentPortion[Side.BACK.getIndex()] -=  portionTaken[Side.BACK.getIndex()];
			currentPortion[Side.UP.getIndex()] -=  portionTaken[Side.UP.getIndex()];
			currentPortion[Side.DOWN.getIndex()] -=  portionTaken[Side.DOWN.getIndex()];
			
			
		}
		
		return getFraction(currentPortion[Side.UP.getIndex()]);
	}
	
	private void populatePortionTake(double[] portionTaken, double[] currentPortion) {
		for(int i = 0; i < portionTaken.length; i++) {
			portionTaken[i] = currentPortion[i]/4;
		}
	}
	
	private String getFraction(Double d) {
		Double num = d;
		int denominator = 1;
		if (num - num.intValue() == 0) {
			return String.valueOf(num.intValue());
		}
		while(num - num.intValue() != 0) {
			num *= 10;
			denominator *= 10;
		}
		int numerator = num.intValue();
		for(int i = 2; i <= numerator; i++) {
			if (numerator % i  == 0 && denominator % i == 0) {
				numerator = numerator / i;
				denominator = denominator / i;
			}
		}
		return numerator + "/" + denominator;
	}

}
