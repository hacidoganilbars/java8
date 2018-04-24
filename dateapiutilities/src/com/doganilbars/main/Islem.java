package com.doganilbars.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Islem {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Year(y�l): " + today.getYear() + " is Leap Year (art�k y�l m�)? " + today.isLeapYear());

		// Bu g�n�n tarihi belirtilen bu tarihten �nceki tarih mi?
		System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015, 1, 1)));

		System.out.println("Current time(saatli tarih): " + today.atTime(LocalTime.now()));

		System.out.println("10 days after today will be (Bu g�nden 10 g�n sonra): " + today.plusDays(10));
		System.out.println("3 weeks after today will be (Bu g�nden 3 hafta sonra): " + today.plusWeeks(3));
		System.out.println("20 months after today will be (Bu g�nden 20 ay sonra): " + today.plusMonths(20));

		System.out.println("10 days before today will be (Bu g�nden 10 g�n �nce): " + today.minusDays(10));
		System.out.println("3 weeks before today will be (Bu g�nden 3 hafta �nce): " + today.minusWeeks(3));
		System.out.println("20 months before today will be (Bu g�nden 20 ay �nce): " + today.minusMonths(20));

		System.out.println(
				"First date of this month (Bu ay�n ilk tarihi): " + today.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year (Bu y�l�n son tarihi): " + lastDayOfYear);

		Period period = today.until(lastDayOfYear);
		System.out.println("Period Format (D�nem Format�): " + period);
		System.out.println("Months remaining in the year (Y�lda Kalan Aylar�n say�s�): " + period.getMonths());

	}
}
