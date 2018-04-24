package com.doganilbars.main;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Islem {

	public static void main(String[] args) {

		try {
			String path = "C:/ilbars/java8/myfile.txt";
			String content = new String(Files.readAllBytes(Paths.get(path)));
			System.out.println(content);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
