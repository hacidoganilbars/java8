package com.doganilbars.main;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Islem {
	public static void main(String[] args) {

		try {
			String path = "C:/ilbars/java8/myfile.txt";
			String content = "Seni seviyorum";
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(path));
			writer.write(content);
			writer.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
