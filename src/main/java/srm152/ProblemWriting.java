package main.java.srm152;

/*
 * SRM 152 DIV II Level 3
 * http://community.topcoder.com/stat?c=problem_statement&pm=1763
 */
public class ProblemWriting {
	private int _index = 0;
	public enum Messages  {
		VALID_MESSAGE(""),
		ERROR_LENGHT("dotForm must contain between 1 and 25 characters, inclusive."),
		ERROR_DOTFORM("dotForm is not in dot notation, check character ");
		
		private String _errorMessage;
		
		Messages(String errorMessage) {
			_errorMessage = errorMessage;
		}
		
		public String getMessage() {
			return _errorMessage;
		}
	}

	public String myCheckData(String dotForm) {
		if (dotForm.length() > 25) {
			return Messages.ERROR_LENGHT.getMessage();
		}
		if(isDotNotation(dotForm) == -1) {
			return Messages.VALID_MESSAGE.getMessage();
		} else {
			return Messages.ERROR_DOTFORM.getMessage() + _index + ".";
		}
	}
	
	private int isDotNotation(String dotForm) {
		if(dotForm.length() == 0) {
			return -1;
		}
		
		if(isNumeric(dotForm.charAt(_index))) {
			_index++;
			return isDotNotation(dotForm);
			
		}
		
		processDots(dotForm);
		
		if(!validOperator(dotForm)) {
			return _index;
		}
		
		processDots(dotForm);
		
		if (!validNumber(dotForm)) {
			return _index;
		}

		
		if (_index >= dotForm.length()) {
			return -1;
		}
		
		return isDotNotation(dotForm);
	}
	
	private boolean validNumber(String dotForm) {
		int countNumber = 0;
		while(_index < dotForm.length() && isNumeric(dotForm.charAt(_index))) {
			countNumber++;
			_index++;
		}
		return countNumber == 1;
	}
	
	private boolean validOperator(String dotForm) {
		int countOperator = 0;
		while(_index < dotForm.length() && isOperator(dotForm.charAt(_index))) {
			countOperator++;
			_index++;
		}
		return countOperator == 1;
	}
	
	private void processDots(String dotForm) {
		while (_index < dotForm.length() && isDot(dotForm.charAt(_index))) {
			_index++;
		}
	}
	
	private boolean isNumeric(char ch) {
		return Character.isDigit(ch);
	}
	
	private boolean isDot(char ch) {
		return ch == '.';
	}
	
	private boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}
}
