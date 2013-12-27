package main.java.srm154;

/*
 * SRM 154 DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1625
 */
public class SuperRot {
	public String decoder(String message) {
		StringBuilder decoded = new StringBuilder();
		for(int i = 0; i < message.length(); i++) {
			decoded.append(getDecoded(message.charAt(i)));
		}
		return decoded.toString();
	}
	
	private char getDecoded(char encrypt) {
		if (encrypt == ' ') {
			return encrypt;
		}
		if (Character.isDigit(encrypt)) {
			if (encrypt <= 52) {
				encrypt = (char) (encrypt + 5);
			} else {
				encrypt = (char) (encrypt - 5);
			}
		} else {
			if (encrypt <= 77) {
				encrypt = (char) (encrypt + 13);
			} else if (encrypt <= 90) {
				encrypt = (char) (encrypt - 13);
			} else if (encrypt <= 109) {
				encrypt = (char) (encrypt + 13);
			} else {
				encrypt = (char) (encrypt - 13);
			}
		}
		return encrypt;
	}
}
