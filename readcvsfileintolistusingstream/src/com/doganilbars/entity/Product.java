package com.doganilbars.entity;

public class Product {

	private String id;

	private String isim;

	private double ucret;

	public Product() {
		super();
	}

	public Product(String id, String isim, double ucret) {
		super();
		this.id = id;
		this.isim = isim;
		this.ucret = ucret;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getUcret() {
		return ucret;
	}

	public void setUcret(double ucret) {
		this.ucret = ucret;
	}

}
