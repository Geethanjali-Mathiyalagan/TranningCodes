package com.chainsys.www;

import java.util.Scanner;

public class LoanFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your loan amount");
		int amount = sc.nextInt();
		System.out.println("Enter your Interest");
		int interest = sc.nextInt();
		System.out.println("Enter the time");
		int time = sc.nextInt();
		int rate=(amount/interest)*time;
		System.out.println("Rate of Interest,"+rate);
		int total=amount+rate;
		System.out.println("Total amount to be paid:"+total);
		int emi=total/(time*12);
		System.out.println("Paid per month:"+emi);
		for(int i=total;i>0;)

		{
		 System.out.println(""+i);
		 i=i-emi;
			
		}	
		}
		
		
		
		
	}


