package com.bilgeadam.lesson038;

public enum ErrorType {
	DOLU_YER_SECIMI(1001,"Seçtiğiniz yer doludur."),
	SINIRLAR_DISINDA(1002,"Yaptığınız seçim sınırların dışında.");
	
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
