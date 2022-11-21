package com.day17.www;

import java.util.Scanner;

public class AvgNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int count;
		float average=0f;
		int number,sum=0;
		System.out.println("Enter the count of numbers");
		count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
		number=sc.nextInt();
		sum=sum+number;
		
	}
	average=sum/count;
 {
	
	System.out.println("sum of entered numbers"+sum);
	System.out.println("average of entered numbers"+average);
	}
	

}
}
