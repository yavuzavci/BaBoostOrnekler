package com.bilgeadam.lesson027;
/*
 * id değeri tutacağız
 * daha sonra kirli olup olmadığını tutan bir değişken tutacağız
 * 
 * rastgele 10 tane tabak üreteceğiz(tabak nesnesi oluşurken kirli veya temiz olması rastgele olacak)
 * 
 * daha sonra temizleri bir stack kirlileri başka bir stack içine alalım
 * 
 * metot işlemlerini tabak sınıfında değil de manager sınıfında yapabiliriz.
 */
public class Tabak {
	private int id;
	private boolean kirliMi;
	
	public Tabak() {
		
	}
	
	public Tabak(int id, boolean kirliMi) {
		this.id = id;
		this.kirliMi = kirliMi;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	public boolean isKirliMi() {
		return kirliMi;
	}

	public void setKirliMi(boolean kirliMi) {
		this.kirliMi = kirliMi;
	}

	@Override
	public String toString() {
		return (kirliMi ? "Kirli Tabak " : "Temiz Tabak ") + "- ID: " + id;
	}
	
}
