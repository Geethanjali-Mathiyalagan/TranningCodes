package com.chainsys.www;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		if (number % 2==0)
		{
			System.out.println("Given number is even");
		}
		
		else
		{
			System.out.println("Given number is not even");
		}
	}

}
