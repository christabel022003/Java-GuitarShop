package com.java;

public class Accoustic extends Guitar{
	boolean hybrid;
	int price;
	public Accoustic(String type, String model, String brand, int strings, int basePrice, boolean hybrid, int price) {
		super(type, model, brand, strings, basePrice);
		this.hybrid = hybrid;
		this.price = price;
	}
	public boolean getHybrid() {
		return hybrid;
	}
	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void detail() {
		System.out.println("Guitar Type" + getType());
		System.out.println("Guitar Model" + getModel());
		System.out.println("Guitar Brand" + getBrand());
		System.out.println("Guitar Strings" + getStrings());
		System.out.println("Guitar Price" + getPrice());
		System.out.println("Guitar Hybrid" + getHybrid());
		
		
	}
	@Override
	public int calculatePrice() {
		int totalprice;
		if (hybrid) {
			totalprice = getBasePrice() + (150000 * getStrings()) + 500000;
			} else { 
				totalprice = getBasePrice() + (150000 * getStrings()) ;
			}
			
		
		
			return totalprice;
	}
}
