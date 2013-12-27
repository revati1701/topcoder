package main.java.srm151;

import junit.framework.Assert;

import org.junit.Test;

public class BirthdayTest {
	
	@Test
	public void testExample0() {
		Birthday birthday = new Birthday();
		String date = "06/17";
		String[] birthdays = {"02/17 Wernie", "10/12 Stefan"};
		String actual = birthday.getNext(date, birthdays);
		String expected = "10/12";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testExample1() {
		Birthday birthday = new Birthday();
		String date = "06/17";
		String[] birthdays = {"10/12 Stefan"};
		String actual = birthday.getNext(date, birthdays);
		String expected = "10/12";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample2() {
		Birthday birthday = new Birthday();
		String date = "02/17";
		String[] birthdays = {"02/17 Wernie", "10/12 Stefan"};
		String actual = birthday.getNext(date, birthdays);
		String expected = "02/17";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample3() {
		Birthday birthday = new Birthday();
		String date = "12/24";
		String[] birthdays = {"10/12 Stefan"};
		String actual = birthday.getNext(date, birthdays);
		String expected = "10/12";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testExample4() {
		Birthday birthday = new Birthday();
		String date = "01/02";
		String[] birthdays = {"02/17 Wernie",
				 "10/12 Stefan",
				 "02/17 MichaelJordan",
				 "10/12 LucianoPavarotti",
				 "05/18 WilhelmSteinitz"};
		String actual = birthday.getNext(date, birthdays);
		String expected = "02/17";
		Assert.assertEquals(expected, actual);
	}
}
