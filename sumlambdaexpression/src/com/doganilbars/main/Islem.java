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
		urunler.add(new Urun("u5", "laptop C", 2300, 7, "firma B"));

		int toplamUrunMiktari = urunler.stream().mapToInt(urun -> urun.getMiktar()).sum();
		System.out.println("Tüm Ürünlerin Toplam Sayýsý: " + toplamUrunMiktari);

		int ismiCepleBaslayanUrunMiktari = urunler.stream().filter(urun -> urun.getIsim().startsWith("cep"))
				.mapToInt(urun -> urun.getMiktar()).sum();
		System.out.println("ismi cep ile baþlayan ürünlerin Toplam Sayýsý: " + ismiCepleBaslayanUrunMiktari);

		long tumUrunlerinDegerleriToplami = urunler.stream().mapToLong(urun -> urun.getMiktar() * urun.getFiyat())
				.sum();
		System.out.println("Tüm Ürünlerin Toplam Deðeri: " + tumUrunlerinDegerleriToplami);
	}

}
