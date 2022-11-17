package com.chainsys.www;

import java.util.Scanner;

public class Medical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Classes");
		System.out.println("Enter number of Classes held");
		int classes = sc.nextInt();
		int classesheld = sc.nextInt();
		System.out.println("Percentage of class attended");
		int percentage = sc.nextInt();
		System.out.println("Have a medical certificate");
		String medicalcertificate = sc.next();
		if(percentage>=75)
				{
		System.out.println("Student is allowed to sit in Exam");
				}
		else if(medicalcertificate.equals("Yes"))
		
		{
        System.out.println("Student is allowed to sit in Exam");
	    }
		else if(percentage<75)
		{
			System.out.println("Student is not allowed to sit in Exam");
		}
		else
		{
			System.out.println("Not valid");
		}
		
}
}
