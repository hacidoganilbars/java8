package com.doganilbars.main;

import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entity.Urun;

//�r�n s�n�f�m�zdaki de�erleri doldurup foreach ile yazd�r�yoruz
public class Islem {

	public static void main(String[] args) {

		List<Urun> urunler = new ArrayList<Urun>();

		urunler.add(new Urun("u1", "cep telefonu 1", 1000, 2, "�retici 1"));
		urunler.add(new Urun("u2", "cep telefonu 2", 700, 4, "�retici 1"));
		urunler.add(new Urun("u3", "laptop 1", 1200, 5, "�retici 2"));
		urunler.add(new Urun("u4", "laptop 2", 5000, 8, "�retici 2"));
		urunler.add(new Urun("u5", "laptop 3", 5000, 8, "�retici 2"));

		System.out.println("�R�N L�STES�");
		urunler.forEach(urun -> {
			System.out.println(urun.toString());
			System.out.println("===================================");
		});
	}

}
