package com.chainsys.www;

import java.util.Scanner;

public class NewHospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hospital hospital20 = new Hospital();
		System.out.println("Name of the hospital:");
		System.out.println("Number of Doctors:");
		String name = sc.next();
		int doctors = sc.nextInt();
		System.out.println("Address of the hospital");
		System.out.println("Opening time:");
		String address = sc.next();
		int openTime = sc.nextInt();
		hospital20.name = name;
		hospital20.numberOfDoctors = doctors;
		hospital20.address = address;
		hospital20.openTime = openTime;
		System.out.println(hospital20.name);
		System.out.println(hospital20.address);
		System.out.println(hospital20.numberOfDoctors);
		System.out.println(hospital20.openTime+"am");
		

	}

}
