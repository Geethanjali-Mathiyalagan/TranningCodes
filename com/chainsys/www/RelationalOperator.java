package com.chainsys.www;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		String state="Karnataka";
		System.out.println("Enter your age :");
		Scanner sc=new Scanner(System.in);
		int userAge=sc.nextInt();
		if(userAge>=18)
		{
			System.out.println("Enter Nationality:");
			String nationality=sc.next();
		
	
	if (nationality.equals("Indian"))
	{
		System.out.println("Enter our state:");
		 state = sc.next();
		 if(state.equals("Tamilnadu")||state.equals("Pondy"))
			 System.out.println("User is eligible to vote");
	}
	else if(state.equals("Andhra"))
	System.out.println("No election to your state now");
	}
		else {
			System.out.println("No election");
		}

}
}

