package com.day17.www;

public class SumProduct {

	public static void main(String[] args) {
		int arr[]=new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[3]=3;
		arr[4]=4;
		arr[5]=5;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		{
			System.out.println("Sum of all the elements"+sum);
		} 
		int product=1;
		for(int i=1;i<arr.length;i++)
		{
			product=product*arr.length;
		}
		{
		System.out.println("Product of all the elements"+product);
		
	}

}
}