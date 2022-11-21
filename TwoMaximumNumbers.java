package com.day17.www;
import java.util.Arrays;
import java.util.Scanner;

public class TwoMaximumNumbers {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the numbers:");
		 number=sc.nextInt();
		 
		int num[]=new int[number];
		{
		System.out.println("Enter the numbers");
		for(int i=0;i<number;i++)
		{
			num[i]=sc.nextInt();
		
	}
	Arrays.sort(num);
	
			for( int i=0;i<number;i++)
	{
	   
	System.out.println(num[i]);
	   
   }
	for(int i=number-1;i>1;i--)
	{
		if(num[i]!=num[i-1])
		{
		System.out.println(num[i]+"and"+num[i-1]+"is two maximum nmbers");
		break;
		}
	}

}
	}
}
