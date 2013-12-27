package main.java.srm152;

import java.util.Stack;

/*
 * SRM 152 DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1764
 */
public class QuiningTopCoder {
	private Stack<Integer> _stack = new Stack<Integer>();
	
	private StringBuilder _print =  new StringBuilder();
	
	private int _length = 0;
	
	private String _source;
	
	private int _delta = 1;
	
	private int _ip = 0;
	
	private int _multiplier = 1;
	
	private boolean _isOverflow = false;
	
	private boolean _isEnd = false;
	
	private boolean _isNotIncrement = false;
	
	private static final String TIMEOUT = "TIMEOUT";
	
	private static final String OVERFLOW = "OVERFLOW";
	
	private static final String BADEND = "BADEND";
	
	private static final String MISMATCH = "MISMATCH";
	
	private static final String QUINES = "QUINES";
	
	public String testCode(String source) {
		_length = source.length();
		_source = source;
		int count = 0;
		while(count < 80000) {
			processInstruction(source.charAt(_ip));
			if (_isOverflow) {
				return formatOutput(OVERFLOW,count);
			}
			String printString = _print.toString();
			if (_source.equals(printString)) {
				return formatOutput(QUINES, count);
			} else if (_isEnd) {
				return formatOutput(BADEND,count);
			}
			if (printString.length() > 0 && !_source.startsWith(printString)) {
				return formatOutput(MISMATCH,count);
			}
			if (_isNotIncrement) {
				_isNotIncrement = false;
			} else {
				_ip =  (3 *_length + _ip + _delta * _multiplier) % _length;
			}
			if (_multiplier == 2) {
				_multiplier = 1;
			}
			count++;
		}
		return TIMEOUT;
	}
	
	private void processInstruction(char c) {
		if(Character.isDigit(c)) {
			_stack.push(Integer.valueOf(c - '0'));
		}
		switch(c) {
		case '$':
			processDollarSign();
			break;
		case ':':
			processColon();
			break;
		case 'W':
			processW();
			break;
		case ',':
			processComma();
			break;
		case '+':
			processAdd();
			break;
		case '-':
			processSubtract();
			break;
		case '#':
			processHash();
			break;
		case 'R':
			processR();
			break;
		case 'S':
			processS();
			break;
		case '_':
			processUnderScore();
			break;
		case 'J':
			processJ();
			break;
		case '@':
			processAmpersand();
			break;
		}	
	}
	
	private int popStack() {
		if(_stack.isEmpty()) {
			return 0;
		} else {
			return _stack.pop();
		}
	}
	
	private void pushStack(int value) {
		if (value < -1000000000  || value > 1000000000) {
			_isOverflow = true;
		}
		_stack.push(value);
	}
	
	private void processDollarSign() {
		popStack();
	}
	
	private void processColon() {
		int value = popStack();
		pushStack(value);
		pushStack(value);
	}
	
	private void processW() {
		int valueA = popStack();
		int valueB = popStack();
		pushStack(valueA);
		pushStack(valueB);
	}
	
	private void processComma() {
		int value = Math.abs(popStack()) % _length;
		_print.append(_source.charAt(value));
	}
	
	private void processAdd() {
		pushStack(popStack() + popStack());
	}
	
	private void processSubtract() {
		pushStack(popStack() - popStack());
	}
	
	private void processHash() {
		_multiplier = 2;
	}
	
	private void processR() {
		_delta = _delta * -1;
	}
	
	private void processS() {
		int value = popStack();
		if (value > 0) {
			pushStack(1);
		} else {
			pushStack(-1);
		}
	}
	
	private void processUnderScore() {
		int value = popStack();
		_delta = value % _length;
	}
	
	private void processJ() {
		int value = Math.abs(popStack()) % _length;
		_ip = value;	
		_isNotIncrement = true;
	}
	
	private void processAmpersand() {
		_isEnd = true;
	}
	
	private String formatOutput(String output1, int output2) {
		return output1 + " " + output2;
	}
}
