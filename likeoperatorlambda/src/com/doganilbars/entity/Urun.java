package com.doganilbars.entity;

public class Urun {

	private String id;

	private String isim;

	private long fiyat;

	private int miktar;

	private String ureticiFirma;

	public Urun() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Urun(String id, String isim, long fiyat, int miktar, String ureticiFirma) {
		super();
		this.id = id;
		this.isim = isim;
		this.fiyat = fiyat;
		this.miktar = miktar;
		this.ureticiFirma = ureticiFirma;
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

	public long getFiyat() {
		return fiyat;
	}

	public void setFiyat(long fiyat) {
		this.fiyat = fiyat;
	}

	public int getMiktar() {
		return miktar;
	}

	public void setMiktar(int miktar) {
		this.miktar = miktar;
	}

	public String getUreticiFirma() {
		return ureticiFirma;
	}

	public void setUreticiFirma(String ureticiFirma) {
		this.ureticiFirma = ureticiFirma;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\n›sim: " + isim + "\nFiyat: " + fiyat + "\nMiktar: " + miktar + "\n‹retici Firma: "
				+ ureticiFirma;
	}

}
