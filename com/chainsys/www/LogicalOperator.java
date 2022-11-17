package com.chainsys.www;
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your accounNumber");
		long accountNumber=sc.nextLong(); 
		System.out.println("Enter your aadharNumber");
		int aadharNumber=sc.nextInt();
		String password = "1234";
		System.out.println("Enter password");
		password = sc.next();
		if(password.equals("1234")||(password.equals("4568")))
		{
			System.out.println("valid account");
		}
		
		else
		{
		System.out.println("Not valid account");

	}

	}
}
