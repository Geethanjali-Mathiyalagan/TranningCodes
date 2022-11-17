package com.chainsys.www;

import java.util.Scanner;

public class AtmTransactions {

	public static void main(String[] args) {
		System.out.println("welcome to our xxx Bank");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number");
		long accountNumber = sc.nextLong();
		System.out.println("Enter your phone number");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter your Pin");
		int pin = sc.nextInt();
		if((pin==2345)||(phoneNumber==987654321))
		{
			System.out.println("Enter your withdrawal amount");
			int amount = sc.nextInt();
			System.out.println("Successfully withdrawaled");
			
		}else
				
		{
			System.out.println("Pin not valid");
		}
		
		
		
			}

}
