package main.java.srm149;

import junit.framework.Assert;

import org.junit.Test;

public class MessageMessTest {
	
	@Test
	public void testExample0() {
		String[] dictionary = {"HI", "YOU", "SAY"};
		String message = "HIYOUSAYHI";
		MessageMess messageMess = new MessageMess();
		String actual = messageMess.restore(dictionary, message);
		String expected = "HI YOU SAY HI";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample1() {
		String[] dictionary = {"ABC", "BCD", "CD", "ABCB"};
		String message = "ABCBCD";
		MessageMess messageMess = new MessageMess();
		String actual = messageMess.restore(dictionary, message);
		String expected = "AMBIGUOUS!";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		String[] dictionary = {"IMPOSS", "SIBLE", "S"};
		String message = "IMPOSSIBLE";
		MessageMess messageMess = new MessageMess();
		String actual = messageMess.restore(dictionary, message);
		String expected = "IMPOSSIBLE!";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		String[] dictionary = {"IMPOSS", "SIBLE", "S", "IMPOSSIBLE"};
		String message = "IMPOSSIBLE";
		MessageMess messageMess = new MessageMess();
		String actual = messageMess.restore(dictionary, message);
		String expected = "IMPOSSIBLE";
		Assert.assertEquals(expected, actual);
	}

}
