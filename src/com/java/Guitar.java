package com.java;

public abstract class Guitar {
	String type;
	String model;
	String brand;
	int strings; 
	int basePrice;
    String price;
	
	public Guitar(String type, String model, String brand, int strings, int basePrice) {
		super();
		this.type = type;
		this.model = model;
		this.brand = brand;
		this.strings = strings;
		this.basePrice = basePrice;
	}
	public abstract int calculatePrice();{
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getStrings() {
		return strings;
	}
	public void setStrings(int strings) {
		this.strings = strings;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public void detail() {
		System.out.println("Guitar Type" + getType());
		System.out.println("Guitar Model" + getModel());
		System.out.println("Guitar Brand" + getBrand());
		System.out.println("Guitar Strings" + getStrings());
		
		
		
		
	}
}
