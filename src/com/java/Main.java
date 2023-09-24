package com.java;
import java.util.*;
public class Main {
	Scanner sc = new Scanner (System.in);
	ArrayList<Guitar> guitarList = new ArrayList<Guitar>(); 
	
	String type;
	String model;
	String brand;
	int strings;
	boolean hybrid;
	boolean amp;
	int price;
	int basePrice;
	String inAmp;
	String inHybrid;
	String tipe;
	
	
	
	
	
public Main() {
	 int menu;
	 do {
		 Menu();
		try { 
		 menu = sc.nextInt();
		 sc.nextLine();
		}catch (Exception e) {
			menu = 0;
			System.out.println("Input must be numeric!");
			sc.nextLine();
		}
		 switch (menu) {
		 
		 case 1: InsertGuitar();
		 break;
		 
		 case 2: ViewGuitarCatalogue();
		 break;
		 
		 case 3: DeleteGuitar();
		 break;
		 
		default:
		break;
		 
		 
		 }
		 
		 
	 }while (menu !=4);
	System.exit(0);
}



	private void ViewGuitarCatalogue() {
		

	if(guitarList.isEmpty()) {
	System.out.println("There are no guitars in the catalogue yet!");
	}
	else {
		
		System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n"
			       , "No", "Type", "Model", "Brand", "Strings", "Hybrid", "Amp", "Price");
			     	
		for(int i = 0; i < guitarList.size(); i++) {
			Guitar guitar = guitarList.get(i);
		      System.out.printf("%-5d %-10s %-10s %-10s %-10d %-10s %-10s %-10d%n"
		        , i+1,guitar.getType(), guitar.getModel(), guitar.getBrand(), guitar.getStrings(),"-" ,"-" , guitar.calculatePrice());
		     }
	}
			
	
	
}


	private void DeleteGuitar() {
		if(guitarList.isEmpty()) {
			System.out.println("There is no data! ");
		} 
		else {
			for(int i = 0; i<guitarList.size(); i++) {
				System.out.println(i + 1 + ". ");
				guitarList.get(i).detail();
			}
			int index = 0;
			do {
				System.out.println("Choose index to delete: ");
				index = sc.nextInt();
			} while (index < 1 || index > guitarList.size());
			
			guitarList.remove(index-1);
			System.out.println("guitar removed");
		}
	}
	


	private void InsertGuitar() {
	 
		int menuLain =0;
		do {
			 Menu2();
			try { 
			 menuLain = sc.nextInt();
			 sc.nextLine();
			}catch (Exception e) {
				menuLain = 0;
				System.out.println("Input must be numeric!");
				sc.nextLine();
			}
			 switch (menuLain) {
			 
			 case 1: Electric();
			 break;
			 
			 case 2: Accoustic();
			 break;
			 
			 default:
				 break;
		
	
}
		}while (menuLain !=3);
		System.out.println("Press enter to continue..");
		sc.nextLine();
		
		
		if (menuLain==1) {
			type = "Electric";
		}else if  (menuLain==2) {
			type = "Accoustic";
		}
	}

	private void Accoustic() {
		type = "Accoustic";
		do {
			System.out.println("Input model [ 5 - 10 characters ]: ");
			model = sc.nextLine();
			} while (model.length() <5 || model.length() >10);
		do {
			System.out.println("Input brand [Yamaha|Fender|Cort]:");
			brand = sc.nextLine();
		}while (!brand.equals("Yamaha") && !brand.equals("Fender") && !brand.equals("Cort"));
		
		do {
			System.out.println("Input number of strings [6 - 8]: ");
			strings = sc.nextInt();
					sc.nextLine();
		}while (strings<6 || strings>8);
		
		do {
			System.out.println("Is the guitar hybrid? [Yes | No]: ");
			inHybrid = sc.nextLine();
		}while(!inHybrid.equalsIgnoreCase("Yes") && !inHybrid.equalsIgnoreCase("No"));
		
		if (brand.equals("Yamaha")) {
			basePrice = 1500000;
		}else if(brand.equals("Fender")) {
			basePrice = 2000000;
		}else if(brand.equals("Cort")) {
			basePrice = 1000000;
		}
		
		if(inHybrid.equalsIgnoreCase("Yes")) {
			price = 500000;
		}else {
			price = 0;
		}if(inHybrid.equalsIgnoreCase("Yes")) {
			hybrid = true;
		}else {
			hybrid = false;
		}
		
		
		
		guitarList.add(new Accoustic (type, model, brand, strings, basePrice, hybrid, price));
		System.out.println("New accoustic guitar added!");
	}		



	private void Electric() {
		type = "Electric";
		do {
			System.out.println("Input model [5 - 10 characters]: ");
			model = sc.nextLine();	
		}while (model.length() <5 || model.length() >10);
		
		do {
			System.out.println("Input brand [ Yamaha|Fender|Cort ]: ");
			brand = sc.nextLine();
		}while(!brand.equals("Yamaha") && !brand.equals("Fender") && !brand.equals("Cort"));
		
		do {
			System.out.println("Input number of strings [6 - 8]");
			strings = sc.nextInt();
			sc.nextLine();
		}while(strings < 6 || strings >8);
		
		do {
			System.out.println("Include Amp? [Yes | No]");
			inAmp = sc.nextLine();
			
		}while (!(inAmp.equalsIgnoreCase("Yes") || inAmp.equalsIgnoreCase("No")));
		
		if (brand.equals("Yamaha")){
			basePrice=1500000;
			}else if (brand.equals("Fender")){
				basePrice=2000000;
			}else if (brand.equals("Cort")) {
				basePrice=1000000;
			}
		if (inAmp.equalsIgnoreCase("Yes")) {
			price=100000;
		}else {
			price=0;
		}
		if(inAmp.equalsIgnoreCase("Yes")) {
			amp=true;
		}else {
			amp=false;
		}
		
		Guitar newelectric = new Electric (type,  model, brand, strings, basePrice, amp, price);
		guitarList.add(newelectric);
		
		System.out.println("New electric guitar added!");
		}

	



	private void Menu2() {
		
		System.out.println("1. Electric");
		System.out.println("2. Accoustic");
		System.out.println("3. Cancel");
	    System.out.println("Input: ");
	
	
	}



	private void Menu() {
	
		System.out.println("1. Insert Guitar: ");
		System.out.println("2. View Guitar Catalogue: ");
		System.out.println("3. Delete Guitar: ");
		System.out.println("4. Exit: ");
		System.out.println("Input menu: ");
	
}

	public static void main(String[] args) {
		new Main();

	}

}
