package com.chainsys.www;

import java.util.Scanner;

public class Attendness {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Classes");
		System.out.println("Enter number of Classes held");
		int classes = sc.nextInt();
		int classesheld = sc.nextInt();
		System.out.println("Percentage of class attended");
		int percentage = sc.nextInt();
		//System.out.println("Enter your Attendance");
		//int Attendance=sc.nextInt();
		if(percentage>=75)
		{
		
        System.out.println("Student is allowed to sit in exam");
	    }
		else if(percentage<=75)
		{
			System.out.println("Your Attendence percentage is low so you not Atten the Exam");
		}
		else {
			System.out.println("your not in student");
		}
}
}
