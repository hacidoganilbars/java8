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
		urunler.add(new Urun("u5", "laptop C", 2300, 7, "Firma B"));

		long urunToplami = urunler.stream().filter(urun -> urun.getFiyat() > 700).count();
		System.out.println("fiyatý 700'den fazla olan kayýt sayýsý: " + urunToplami);
	}
}
