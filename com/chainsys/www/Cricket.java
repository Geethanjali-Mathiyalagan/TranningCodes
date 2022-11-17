package com.chainsys.www;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two team: ");
		String teamA = sc.next();
		String teamB = sc.next();
		System.out.println("Enter  team score");
		int score = sc.nextInt();
		if(score>234) 
		{
			System.out.println("Team A is Winner");
		}
	
	    else if(score<234) {
		
		System.out.println("Team B is Winner");	
	    }
		
	    else if(score==234)
	    {
	    		System.out.println("Match will be Draw");
	    }


	    else {
	    	System.out.println("No Match");
	    }
	   
}
}