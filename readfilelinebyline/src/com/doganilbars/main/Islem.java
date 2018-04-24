package com.doganilbars.main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/*
 * myfile.txt dosyas�nda
 * Line 1
 * Line 2
 * Line 3
 * Line 4 yaz�l� ve dosya yolunu belirtiyoruz.
 * 
 *txt belgesini sat�r sat�r okuyup okunalar� birListe'ye at�p konsola yazd�r�yoruz
 * 
 * 
 */
public class Islem {

	public static void main(String[] args) {

		try {
			String path = "C:/ilbars/java8/myfile.txt";
			List<String> lines = Files.readAllLines(Paths.get(path));
			for (Object line : lines) {
				System.out.println(line);
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
