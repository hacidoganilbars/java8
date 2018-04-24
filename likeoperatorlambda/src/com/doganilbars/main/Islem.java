package com.doganilbars.main;

import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entity.Urun;

public class Islem {
	public static void main(String[] args) {

		List<Urun> urunler = new ArrayList<Urun>();

		urunler.add(new Urun("u1", "ceptelefonu A", 1000, 2, "Firma A"));
		urunler.add(new Urun("u2", "ceptelefonu B", 700, 4, "Firma A"));
		urunler.add(new Urun("u3", "laptop A", 1200, 6, "Firma B"));
		urunler.add(new Urun("u4", "laptop B", 7000, 9, "Firma B"));
		urunler.add(new Urun("u5", "laptop C", 7000, 9, "Firma B"));

		System.out.println("Search Starts with: ce");
		System.out.println("ismi ce ile baþlayan Urunleri bulup deðerlerini (ceptelefonu) yazdýracaðýz");
		urunler.stream().filter(urun -> urun.getIsim().startsWith("ce")).forEach(urun -> {
			System.out.println(urun.toString());
			System.out.println("======================");
		});

		System.out.println("\n\nSeach Ends with: top A");
		System.out.println("ismi top A ile biten Urunleri bulup deðerlerini (laptop A) yazdýracaðýz");
		urunler.stream().filter(urun -> urun.getIsim().endsWith("top A")).forEach(urun -> {
			System.out.println(urun.toString());
			System.out.println("#######################");
		});

		System.out.println("\n\nSearch contains: top");
		System.out.println("ismi içerisinde top geçen urunleri bulup deðerlerini (laptop) yazdýracaðýz");
		urunler.stream().filter(urun -> urun.getIsim().contains("top")).forEach(urun -> {
			System.out.println(urun.toString());
			System.out.println("***********************");
		});
	}

}
