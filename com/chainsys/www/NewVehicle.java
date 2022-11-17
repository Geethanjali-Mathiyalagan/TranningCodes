package com.chainsys.www;

import java.util.Scanner;


public class NewVehicle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle vehicle20 = new Vehicle();
		System.out.println("Enter brand name:");
		System.out.println("Cost of the bike:");
		String name = sc.next();
		float cost = sc.nextFloat();
		System.out.println("Founder of the Honda company:");
		String founder = sc.next();
		System.out.println("Mileage given by the bike:");
		int mileage = sc.nextInt();
		vehicle20.name = name;
		vehicle20.cost = cost;
		vehicle20.founder = founder;
		vehicle20.mileage = mileage;
		System.out.println(vehicle20.name);
		System.out.println(vehicle20.cost);
		System.out.println(vehicle20.founder);
		System.out.println(vehicle20.mileage);
		
		

}
}
