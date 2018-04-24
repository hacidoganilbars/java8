package com.doganilbars.main;

import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entity.Urun;

public class Islem {
	public static void main(String[] args) {

		List<Urun> urunler = new ArrayList<Urun>();

		urunler.add(new Urun("u1", "ceptelefonu 1", 1000, 2, "firma 1"));
		urunler.add(new Urun("u2", "ceptelefonu 2", 700, 4, "firma 1"));
		urunler.add(new Urun("u3", "laptop 1", 1200, 6, "firma 2"));
		urunler.add(new Urun("u4", "laptop 2", 7000, 9, "firma 2"));
		urunler.add(new Urun("u5", "laptop 3", 7000, 9, "firma 2"));

		System.out.println("Veya Þartý - or condition");
		urunler.stream().filter(urun -> urun.getId().equalsIgnoreCase("u1") || urun.getId().equalsIgnoreCase("u3"))
				.forEach(urun -> {
					System.out.println(urun.toString());
					System.out.println("========================");
				});

		System.out.println("\n\nVe Þartý - and condition");
		urunler.stream().filter(urun -> urun.getFiyat() > 700 && urun.getFiyat() < 7000).forEach(urun -> {
			System.out.println(urun.toString());
			System.out.println("##########################");
		});
	}

}
