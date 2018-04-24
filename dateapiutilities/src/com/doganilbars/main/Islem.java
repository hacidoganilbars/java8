package com.doganilbars.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Islem {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Year(yýl): " + today.getYear() + " is Leap Year (artýk yýl mý)? " + today.isLeapYear());

		// Bu günün tarihi belirtilen bu tarihten önceki tarih mi?
		System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015, 1, 1)));

		System.out.println("Current time(saatli tarih): " + today.atTime(LocalTime.now()));

		System.out.println("10 days after today will be (Bu günden 10 gün sonra): " + today.plusDays(10));
		System.out.println("3 weeks after today will be (Bu günden 3 hafta sonra): " + today.plusWeeks(3));
		System.out.println("20 months after today will be (Bu günden 20 ay sonra): " + today.plusMonths(20));

		System.out.println("10 days before today will be (Bu günden 10 gün önce): " + today.minusDays(10));
		System.out.println("3 weeks before today will be (Bu günden 3 hafta önce): " + today.minusWeeks(3));
		System.out.println("20 months before today will be (Bu günden 20 ay önce): " + today.minusMonths(20));

		System.out.println(
				"First date of this month (Bu ayýn ilk tarihi): " + today.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year (Bu yýlýn son tarihi): " + lastDayOfYear);

		Period period = today.until(lastDayOfYear);
		System.out.println("Period Format (Dönem Formatý): " + period);
		System.out.println("Months remaining in the year (Yýlda Kalan Aylarýn sayýsý): " + period.getMonths());

	}
}
