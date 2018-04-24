package com.doganilbars.main;

import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entity.Urun;

public class Islem {
	public static void main(String[] args) {

		List<Urun> urunler = new ArrayList<Urun>();

		urunler.add(new Urun("u1", "ceptelefonu A", 1000, 2, "firma A"));
		urunler.add(new Urun("u2", "ceptelefonu B", 700, 4, "firma A"));
		urunler.add(new Urun("u3", "laptop A", 1200, 6, "firma B"));
		urunler.add(new Urun("u4", "laptop B", 7000, 9, "firma B"));
		urunler.add(new Urun("u5", "laptop C", 2300, 9, "firma B"));

		System.out.println("Desceding Order and Limit");
		System.out.println("Ürün Fiyatýný çoktan aza sýralama ve belirtilen miktarda Urun bilgisini yazdýrmak");

		urunler.stream().sorted((urun1, urun2) -> (int) (urun2.getFiyat() - urun1.getFiyat())).limit(2)
				.forEach(urun -> {
					System.out.println(urun.toString());
					System.out.println("============================");
				});

	}
}
