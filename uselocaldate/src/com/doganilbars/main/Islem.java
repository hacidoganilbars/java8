package com.doganilbars.main;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Islem {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Current Date: " + today);

		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specific Date: " + firstDay_2014);

		LocalDate todayLosAngles = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current Date in IST: " + todayLosAngles);

		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date: " + dateFromBase);

		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
		System.out.println("100th day of 2014: " + hundredDay2014);
	}

}
