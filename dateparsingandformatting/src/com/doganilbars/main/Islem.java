package com.doganilbars.main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Islem {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println("Default Format of LocalDate (LocalDate varsay�lan format� yani bi�imi): " + date);

		System.out.println(date.format(DateTimeFormatter.ofPattern("dd::MM::uuuu")));

		System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

		LocalDateTime dateTime = LocalDateTime.now();

		System.out
				.println("Default format of LocalDateTime (LocalDateTime varsay�lan format� yani bi�imi): " + dateTime);

		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss")));

		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

		Instant timestamp = Instant.now();
		System.out.println("Default format of Instant (An�nda varsay�lan format yani bi�im): " + timestamp);

		LocalDateTime dt = LocalDateTime.parse("27::Nis::2014 21::39::48",
				DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		
		System.out.println("Default format after parsing: "+dt);
	}

}
