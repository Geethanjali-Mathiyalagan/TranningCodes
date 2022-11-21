package com.day17.www;

import java.util.Scanner;

public class LargestSmallestNumber {

	public static void main(String[] args) 
	{
	 int numbers[],size,largest = 0,smallest=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your size of array:");
	  size=sc.nextInt();
	  numbers=new int[size];
	  System.out.println("Enter your Elements:");
	  for(int i=0;i<numbers.length;i++) {
	 numbers[i]=sc.nextInt();
	 largest=numbers[0];
	 smallest=numbers[0];
	 if(numbers[i]>largest)//10>0,10>20,20>30,30>40,40>50,50>60,60>0
	 largest=numbers[i];
	 else if(numbers[i]<smallest)//1
	 smallest=numbers[i];
	  }
	  System.out.println("Largest number:"+largest);
	  System.out.println("smallest number:"+smallest);
	 
	}

	}