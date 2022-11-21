package com.day17.www;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
	
		public static void main (String[] args)
		{

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of elements");
 int elements=sc.nextInt();
 int arr1[]=new int[10];
 arr1[0]= 1;
 arr1[1]=2;
 arr1[2]=3;
 arr1[3]=4;
 arr1[4]=5;
 arr1[5]=6;
 arr1[6]=7;
 arr1[7]=8;
 
 int arr2[]=Arrays.copyOf(arr1, elements);
 for(int i=0;i<elements;i++) {
	 arr2[i]=arr1[i];
 }{
	 System.out.println("Elements the original array:");
	 for(int i=0;i<arr1.length;i++)
	 {
		 System.out.println(arr1[i]+"");
	 }
 }
 {
	 System.out.println("Elements of new array:");
	 for(int i=arr2.length-1;i>=0;i--)
	 {
		 System.out.println(arr2[i]+"");
	 }
 }
		}
	}
