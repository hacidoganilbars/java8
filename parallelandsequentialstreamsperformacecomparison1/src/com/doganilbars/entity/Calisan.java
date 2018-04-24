package com.doganilbars.entity;

public class Calisan {

	private int ucret;

	private String isim;

	public Calisan() {
		super();
	}

	public Calisan(int ucret, String isim) {
		super();
		this.ucret = ucret;
		this.isim = isim;
	}

	public int getUcret() {
		return ucret;
	}

	public void setUcret(int ucret) {
		this.ucret = ucret;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

}
