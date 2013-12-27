package main.java.srm151;

import java.util.Arrays;

/*
 * SRM 151 DIV II Level 2
 * http://community.topcoder.com/stat?c=problem_statement&pm=1739
 */
public class Birthday {
	public String getNext(String date, String[] birthdays) {
		Arrays.sort(birthdays);
		String dateMonth = getMonth(date);
		for(String birthday: birthdays) {
			String month = getMonth(birthday);
			if (dateMonth.compareTo(month) <= 0) {
				return getDate(birthday);
			}
		}
		return getDate(birthdays[0]);
	}


	private String getMonth(String birthday) {
		String[] dateArray = getDate(birthday).split("/");
		return dateArray[0];
	}
	
	private String getDate(String birthday) {
		String[] birthdayArray = birthday.split(" ");
		return birthdayArray[0];
	}

}


