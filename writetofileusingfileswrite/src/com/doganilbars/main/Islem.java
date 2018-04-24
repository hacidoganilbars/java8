package com.doganilbars.main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Islem {

	public static void main(String[] args) {
		try {
			String path = "C:/ilbars/java8/myfile.txt";
			String content = "Hac� Do�an �lbars";
			Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.CREATE);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
