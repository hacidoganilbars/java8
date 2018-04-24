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

		urunler.add(new Urun("u5", "ceptelefonu C", 2300, 7, "Firma B"));

		Urun max = urunler.stream().max((urun1, urun2) -> (int) (urun1.getFiyat() - urun2.getFiyat())).get();

		System.out.println("Listedeki En Pahalý Ürün\n" + max);
		System.out.println("==========================\n");

		Urun min = urunler.stream().min((u1, u2) -> (int) (u1.getFiyat() - u2.getFiyat())).get();
		System.out.println("Listedeki En Ucuz Ürün\n" + min);
	}

}
