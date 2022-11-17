package com.chainsys.www;

import java.util.Scanner;

public class HotelNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel20 = new Hotel();
		System.out.println("Enter name:");
		System.out.println("Enter foodTypes:");
		System.out.println("Enter southIndian:");
		String name = sc.next();
		int foodTypes = sc.nextInt();
		hotel20.name = name;
		hotel20.foodTypes = foodTypes;
		boolean southIndian = sc.hasNextBoolean();
		hotel20.southIndian = southIndian;
		System.out.println(hotel20.name);
		System.out.println(hotel20.foodTypes);
		System.out.println(hotel20.southIndian);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
