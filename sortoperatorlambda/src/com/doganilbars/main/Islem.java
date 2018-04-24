package com.doganilbars.main;

import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entity.Urun;

public class Islem {
	public static void main(String[] args) {

		List<Urun> urunler = new ArrayList<Urun>();

		urunler.add(new Urun("u1", "ceptelefonu A", 1000, 2, "Firma A"));
		urunler.add(new Urun("u2", "ceptelefonu B", 700, 4, "Firma A"));
		urunler.add(new Urun("u3", "ceptelefonu A", 1200, 6, "Firma B"));
		urunler.add(new Urun("u4", "ceptelefonu B", 7000, 9, "Firma B"));
		urunler.add(new Urun("u5", "ceptelefonu C", 2300, 9, "Firma B"));

		System.out.println("Asceding Order");
		System.out.println("Ürün fiyatý azdan çoða sýralanmasý");
		urunler.stream().sorted((urun1, urun2) -> (int) (urun1.getFiyat() - urun2.getFiyat())).forEach(urun -> {
			System.out.println(urun.toString());
			System.out.println("==========================");
		});

		System.out.println("\n\nDesceding Order");
		System.out.println("Ürün fiyatý çoktan aza sýralamasý");
		urunler.stream().sorted((urun1, urun2) -> (int) (urun2.getFiyat() - urun1.getFiyat())).forEach(urun -> {
			System.out.println(urun.toString());
			System.out.println("#########################");
		});

	}

}
