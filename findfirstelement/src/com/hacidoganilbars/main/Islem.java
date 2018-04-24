package com.hacidoganilbars.main;

import java.util.ArrayList;
import java.util.List;

import com.hacidoganilbars.entity.Urun;

public class Islem {

	public static void main(String[] args) {

		List<Urun> urunler = new ArrayList<Urun>();

		urunler.add(new Urun("u1", "ceptelefonu A", 1000, 2, "Firma A"));
		urunler.add(new Urun("u2", "ceptelefonu B", 700, 4, "Firma A"));
		urunler.add(new Urun("u3", "laptop A", 1200, 6, "Firma B"));
		urunler.add(new Urun("u4", "laptop B", 7000, 9, "Firma B"));
		urunler.add(new Urun("u5", "laptop C", 7000, 9, "Firma B"));

		Urun urunum = urunler.stream().filter(urun -> urun.getId().equalsIgnoreCase("u2")).findFirst().get();
		System.out.println(urunum.toString());
	}
}
