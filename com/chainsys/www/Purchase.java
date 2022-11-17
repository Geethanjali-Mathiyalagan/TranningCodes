package com.chainsys.www;

import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your purchased quantity");
		double purQuantity = sc.nextDouble();

	if(purQuantity>1000)
	{
		System.out.println("The total cost="+(purQuantity-(purQuantity/100*10)));
	}
	else
	{
		System.out.println("The total cost="+purQuantity);

}
	}
}
