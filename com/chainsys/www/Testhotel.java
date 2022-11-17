package com.chainsys.www;

public class Testhotel {

	public static void main(String[] args) {
		Hotel hotel1 = new Hotel();
		hotel1.name = "Bananlaef";
		hotel1.openingTime = 9;
		hotel1.closingTime = 10;
		hotel1.foodTypes = 50;
		hotel1.southIndian = true;
		System.out.println(hotel1.name);
		System.out.println(hotel1.openingTime+"am");
		System.out.println(hotel1.closingTime+"pm");
		System.out.println(hotel1.southIndian);
		
		
	}

}
