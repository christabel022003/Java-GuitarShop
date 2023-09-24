package com.java;

public class Electric extends Guitar{
	

	boolean amp;
	int price;
	public Electric(String type, String model, String brand, int strings, int basePrice, boolean amp, int price) {
		super(type, model, brand, strings, basePrice);
		this.amp = amp;
		this.price = price;
	}
	public boolean getAmp() {
		return amp;
	}
	public void setAmp(boolean amp) {
		this.amp = amp;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void detail() {
		System.out.println("Guitar Type" + getType());
		System.out.println("Guitar Model" + getModel());
		System.out.println("Guitar Brand" + getBrand());
		System.out.println("Guitar Strings" + getStrings());
		System.out.println("Guitar Price" + getPrice());
		System.out.println("Guitar Amp" + getAmp());
		
		
	}
	@Override
	public int calculatePrice() {
		int totalprice;
		if (amp) {
			totalprice = getBasePrice() + (150000 * getStrings()) + 1000000;
			} else { 
				totalprice = getBasePrice() + (150000 * getStrings()) ;
			}
			
		
		
			return totalprice;
	}
}
	


