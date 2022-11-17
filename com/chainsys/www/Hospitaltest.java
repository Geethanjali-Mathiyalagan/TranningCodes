package com.chainsys.www;

public class Hospitaltest {

	public static void main(String[] args) {
		Hospital hospital2 =new Hospital();
		hospital2.name = "Apollo";
		hospital2.address = "Ayanambakkam chennai-28";
		hospital2.openTime = 9;
		hospital2.closeTime = 10;
		System.out.println(hospital2.name);
		System.out.println(hospital2.address);
		System.out.println(hospital2.openTime+"am");
		System.out.println(hospital2.closeTime+"pm");
		
		
		
	}

}
