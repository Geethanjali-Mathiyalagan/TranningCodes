package com.chainsys.www;

import java.util.Scanner;

public class DesignCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.println("Choose the operations to perform:+,*,/,-");
		char operator = sc.next().charAt(0);
		if(operator == '+')
		{
		
		System.out.println("The answer is :"+(number1+number2));
		

	}
		else if(operator == '-')
		{
		System.out.println("The answer is:"+(number1-number2));
		
		}
		else if (operator == '*')
		{
			System.out.println("The answer is:"+(number1*number2));
			}
		else if (operator == '/')
		{
			System.out.println("The answer is:"+(number1/number2));
			}
		else
		{
			System.out.println("The operator invalid");
		}
		
}
	}