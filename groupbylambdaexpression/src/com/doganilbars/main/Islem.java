package com.doganilbars.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.doganilbars.entity.Urun;

public class Islem {

	public static void main(String[] args) {

		List<Urun> urunler = new ArrayList<Urun>();

		urunler.add(new Urun("u1", "ceptelefonu A", 1000, 2, "Firma A"));

		urunler.add(new Urun("u2", "ceptelefonu B", 700, 4, "Firma A"));

		urunler.add(new Urun("u3", "laptop A", 1200, 6, "Firma B"));

		urunler.add(new Urun("u4", "laptop B", 7000, 9, "Firma B"));

		urunler.add(new Urun("u5", "laptop C", 2300, 7, "Firma B"));

		Map<?, ?> grup = urunler.stream().collect(Collectors.groupingBy(Urun::getUreticiFirma, Collectors.counting()));
		for (Object grupIsim : grup.keySet()) {
			System.out.println("Grup Ýsmi(Firma Grubu): " + grupIsim.toString());
			System.out.println("Ürün Sayýsý: " + grup.get(grupIsim).toString() + "\n");
		}

		Map<?, ?> grupHesapla = urunler.stream()
				.collect(Collectors.groupingBy(Urun::getUreticiFirma, Collectors.summingInt(Urun::getMiktar)));
		for (Object grupIsim : grupHesapla.keySet()) {
			System.out.println("Grup Ýsmi(Firma Grubu): " + grupIsim.toString());
			System.out.println("Toplam Ürün Sayýsý(Adet-Miktar): " + grupHesapla.get(grupIsim).toString() + "\n");
		}

	}

}
