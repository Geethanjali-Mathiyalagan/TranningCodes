package com.chainsys.www;

import java.util.Scanner;

public class Calculation1 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculation call1 = new Calculation();
		System.out.println("Enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		call1.a = num1;
		call1.b = num2;
		System.out.println("Add:"+(num1+num2));
		System.out.println("Sub:"+(num1-num2));
		System.out.println("Mul:"+(num1*num2));
		System.out.println("Div:"+(num1/num2));
		

	}

}
