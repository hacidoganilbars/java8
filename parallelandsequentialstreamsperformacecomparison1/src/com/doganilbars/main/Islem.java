package com.doganilbars.main;

import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entity.Calisan;

public class Islem {
	public static void main(String[] args) {

		List<Calisan> calisanList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			calisanList.add(new Calisan(20000, "A"));
			calisanList.add(new Calisan(3000, "B"));
			calisanList.add(new Calisan(15002, "C"));
			calisanList.add(new Calisan(7856, "D"));
			calisanList.add(new Calisan(200, "E"));
			calisanList.add(new Calisan(50000, "F"));
		}

		long t1 = System.currentTimeMillis();
		System.out.println("Sequential Stream count(sýralý akýþ sayýsý) "
				+ calisanList.stream().filter(calisan -> calisan.getUcret() > 15000).count());
		System.out.println("ucreti 15000 den fazla olan çalýþan sayýsý "
				+ calisanList.stream().filter(calisan -> calisan.getUcret() > 15000).count());

		long t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream time taken(sýralý akýþ zamaný alýndý) " + (t2 - t1));

		t1 = System.currentTimeMillis();
		System.out.println("Paralel Stream Count(Paralel akýþ sayýmý) "
				+ calisanList.parallelStream().filter(calisan -> calisan.getUcret() > 15000).count());

		t2 = System.currentTimeMillis();
		System.out.println("Pallel Stream Time Taken (Paralel akýþ zamaný alýndý) " + (t2 - t1));

	}

}
