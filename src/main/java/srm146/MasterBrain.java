package main.java.srm146;

/*
 * SRM 146 DIV 1 Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1541
 */
public class MasterBrain {
	
	public int possibleSecrets(String[] guesses, String[] results) {
		int count = 0;
		String guess;
		for(int i = 1;  i <= 7; i++) {
			for (int j = 1; j <=7; j++) {
				for (int k = 1; k <= 7; k++) {
					for(int l = 1; l <= 7; l++) {
						guess = String.valueOf(i) + j + k + l;
						if (isValidGuess(guess, guesses, results)) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}
	
	private boolean isValidGuess(String guess, String[] guesses, String[] results) {
		int numResults = results.length;
		StringBuilder inputGuess = new StringBuilder();
		StringBuilder sampleGuess = new StringBuilder();
		String[] result;
		int numBlackPegs = 0;
		int numWhitePegs = 0;
		int numMatched = 0;
		int matchedBlackPegs = 0;
		int matchedWhitePegs = 0;
		for(int i = 0; i < numResults; i++) {
			matchedBlackPegs = 0;
			matchedWhitePegs = 0;
			inputGuess.replace(0, 4, guesses[i]);
			sampleGuess.replace(0, 4, guess);
			result = results[i].split(" ");
			numBlackPegs = Character.getNumericValue(result[0].charAt(0));
			numWhitePegs = Character.getNumericValue(result[1].charAt(0));		
			matchedBlackPegs = processBlackPegs(sampleGuess, inputGuess);
			if (numBlackPegs == matchedBlackPegs) {
				matchedWhitePegs = processWhitePegs(sampleGuess, inputGuess);
				if (numWhitePegs + numBlackPegs == matchedWhitePegs + matchedBlackPegs) {
					numMatched++;
				}
			}
			
		}
		
		if (numMatched + 1 == numResults) {
			return true;
		}
		return false;
	}
	
	private int processBlackPegs(StringBuilder sampleGuess, StringBuilder inputGuess) {
		int matchedBlackPegs = 0;
		for(int i = 0; i < sampleGuess.length(); i++) {
			if (sampleGuess.charAt(i) == inputGuess.charAt(i)) {
				matchedBlackPegs++;
				sampleGuess.replace(i, i + 1, "X");
				inputGuess.replace(i, i + 1, "X");
			}
		}
		return matchedBlackPegs;
	}
	
	private int processWhitePegs(StringBuilder sampleGuess, StringBuilder inputGuess) {
		int matchedWhitePegs = 0;
		for(int i = 0; i < sampleGuess.length(); i++) {
			if (sampleGuess.charAt(i) != 'X') {
				int index = inputGuess.indexOf(String.valueOf(sampleGuess.charAt(i)));
				// Edge Case Condition sampleGuess.charAt(index) != inputGuess.charAt(index)
				// Sample = "6177"
				//Input = 3617
				// result is 0B 3W 
				if(index != -1 && index != i && sampleGuess.charAt(index) != inputGuess.charAt(index)) {
					matchedWhitePegs++;
					sampleGuess.replace(i, i + 1, "X");
					inputGuess.replace(index, index + 1, "X");
				}
			}
		}
		return matchedWhitePegs;
	}

}
 