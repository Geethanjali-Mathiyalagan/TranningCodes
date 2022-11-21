package com.day17.www;

import java.util.Scanner;

public class GenderAndAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Gender 'male' or 'female':");
		String gender=sc.next();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(gender.equals("male")&&age>=25)
		{
			System.out.println("Man");
			
		}
		else if(gender.equals("male")&&age<25)
		{
			System.out.println("Boy");
		}
	
		else if(gender.equals("female")&&age>=20)
		{
			System.out.println("women");
		}
		else if(gender.equals("female")&&age>=20);
				{
			System.out.println("Girl");
					
		}
	
	else	
	{
			System.out.println("Enter valid data!");
		}
	}
}

