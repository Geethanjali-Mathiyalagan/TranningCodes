package com.chainsys.www;

import java.util.Scanner;

public class Newbook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Books book120 = new Books();
        System.out.println("Enter name:");
        System.out.println("Book cost:");
        System.out.println("Published year:");
        String name = sc.next();
        float cost = sc.nextFloat();
        int year = sc.nextInt();
        book120.name=name;
        book120.cost=cost;
        book120.year=year;
        System.out.println(book120.name);
        System.out.println(book120.cost);
        System.out.println(book120.year);
        


	}

}
