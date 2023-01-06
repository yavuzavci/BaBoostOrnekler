package com.bilgeadam.lesson038;

public enum ErrorType {
	DOLU_YER_SECIMI(1001,"Seçtiğiniz yer doludur."),
	SINIRLAR_DISINDA(1002,"Yaptığınız seçim sınırların dışında."),
	ASGARI_AGIRLIK(1003,"Limanımız 100 kilo altı yükleri kabul etmemektedir."),
	GECERSIZ_KABUL_TARIHI(1004,"Girmiş olduğunuz kabul tarihi geçersizdir."),
	MESAI_GUNLERI_DISI(1005,"Limanımız cuma günleri yük kabul etmemektedir.");
	
	private String message;
	private int code;
	
	private ErrorType(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}	
	
}
