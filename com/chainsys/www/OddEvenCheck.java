package com.day17.www;
import java.util.Scanner;

public class OddEvenCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array;
		System.out.println("Enter the size of array:");
		array=sc.nextInt();
		int ar[]=new int[array];
		System.out.println("Enter array elements");
		for(int i=0;i<array;i++)
		{
		ar[i]=sc.nextInt();
		
		}
		System.out.println("The even elements are");
		for(int i=0;i<array;i++);
		{
			
			if(ar[array]%2==0)
			{
			System.out.println(ar[array]+"");	
			}
		}
		System.out.println("The odd elements are");
		for(int i=0;i<array;i++)
		{
			if(ar[i]%2!=0)
			{
			System.out.println(ar[i]+"");	

			}
		}

}
}
