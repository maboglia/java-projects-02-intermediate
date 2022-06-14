package moneychanger2;

public class Money {
	private int value;
	private String singType;
	private String plurType;
	
	Money() {
		
	}
	
	Money(int value, String singName, String plurName) {
		this.value = value;
		this.singType = singName;
		this.plurType = plurName;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getSingType() {
		return singType;
	}
	
	public String getPlurType() {
		return plurType;
	}
}
