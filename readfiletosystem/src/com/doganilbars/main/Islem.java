package com.doganilbars.main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Islem {

	public static void main(String[] args) {
		try {
			String path = "C:/ilbars/java8/myfile.txt";
			Stream<String> stream = Files.lines(Paths.get(path));
			stream.forEach(line -> {
				System.out.println(line);
			});
			stream.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
