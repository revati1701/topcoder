package main.java.srm275;

/*
 * SRM 275 DIV I Level 1
 * http://community.topcoder.com/stat?c=problem_statement&pm=5896
 */
public class InverseHaar1D {
	public int[] transform(int[] transformedData, int L) {
		if (L == 0) {
			return transformedData;
		}
		int resultIndex = 0;
		int[] newSequence = new int[transformedData.length];
		int numTransformed =(int) (transformedData.length / Math.pow(2,  L -1));
		
		for(int i = 0; i < numTransformed /2 ; i++) {
			int[] inverse = transformPair(transformedData[i], transformedData[i + numTransformed /2]);
			 newSequence[resultIndex++] = inverse[0];
			 newSequence[resultIndex++] = inverse[1];
		}
		
		for(int i = numTransformed; i < transformedData.length; i++) {
			newSequence[resultIndex++] = transformedData[i];
		}
		
		return transform(newSequence, L - 1);
	}
	
	private int[] transformPair(int sum, int diff) {
		int[] resultPair = new int[2];
		resultPair[0] = (sum + diff) / 2;
		resultPair[1] = sum - resultPair[0];
		return resultPair;
	}
}
