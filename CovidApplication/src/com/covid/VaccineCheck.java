package com.covid;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class VaccineCheck extends SelfRegistration{
	String city;									// to get code of city
	LinkedHashMap<Integer,String> Chennai;						//Chennai vaccine list
	LinkedHashMap<Integer,String> Coimbatore;					//Coimbatore Vaccine list
	LinkedHashMap<Integer,String> Trichy;						//Trichy Vaccine list
	
	void Check() {
	Chennai = new LinkedHashMap<>();
	
	Chennai.put(1,"Chennai \tAmbattur \t70 dose");
	Chennai.put(2,"Chennai \tAnna Nagar \t100 dose");
	Chennai.put(3,"Chennai \tChrompet \t30 dose");
	Chennai.put(4,"Chennai \tGuindy \t\t60 dose");
	Chennai.put(5,"Chennai \tKodambakkam \t90 dose");
	Chennai.put(6,"Chennai \tPallavaram \t50 dose");
	Chennai.put(7,"Chennai \tPorur  \t\t80 dose");
	
	Coimbatore = new LinkedHashMap<>();
	
	Coimbatore.put(1,"Coimbatore \tGandhipuram \t75 dose");
	Coimbatore.put(2,"Coimbatore \tKovaipudur \t90 dose");
	Coimbatore.put(3,"Coimbatore \tSaibaba colony \t35 dose");
	Coimbatore.put(4,"Coimbatore \tThondamuthur \t80 dose");
	Coimbatore.put(5,"Coimbatore \tSinganallur \t110 dose");
	Coimbatore.put(6,"Coimbatore \tKottaimedu \t50 dose");
	Coimbatore.put(7,"Coimbatore \tRamnagar \t60 dose");
	
	Trichy = new LinkedHashMap<>();
	
	Trichy.put(1,"Trichy \t\tThuraiyur \t80 dose");
	Trichy.put(2,"Trichy \t\tManapparai \t95 dose");
	Trichy.put(3,"Trichy \t\tSrirangam \t55 dose");
	Trichy.put(4,"Trichy \t\tLalgudi \t130 dose");
	Trichy.put(5,"Trichy \t\tThiruverumbur \t70 dose");
	Trichy.put(6,"Trichy \t\tPullambadi \t80 dose");
	Trichy.put(7,"Trichy \t\tAndanallur \t100 dose");
													//Location with code
	System.out.println("---------------------------------------------------------");
	System.out.println("location \t\tCode ");
	System.out.println("---------------------------------------------------------");
	System.out.println("Chennai \t:\t  1"); 
	System.out.println("Coimbatore \t: \t  2"); 
	System.out.println("Trichy \t\t: \t  3");
	System.out.println("---------------------------------------------------------");
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Location Code \t: \t");
	city = scan.nextLine();
													//user city selection OP
	if(city.equals("1")) {
		System.out.println("---------------------------------------------------------");
		System.out.println("Code \tCity \t\tArea \t\tAvailability");
		System.out.println("---------------------------------------------------------");

		Chennai.forEach((k,v) -> System.out.println( k + "\t" + v));
		System.out.println("---------------------------------------------------------");
	}else if(city.equals("2")){
		System.out.println("---------------------------------------------------------");
		System.out.println("Code \tCity \t\tArea \t\tAvailability");
		System.out.println("---------------------------------------------------------");

		Coimbatore.forEach((k,v) -> System.out.println( k + "\t" + v));
		System.out.println("---------------------------------------------------------");
	}else if(city.equals("3")){
		System.out.println("---------------------------------------------------------");
		System.out.println("Code \tCity \t\tArea \t\tAvailability");
		System.out.println("---------------------------------------------------------");
		Trichy.forEach((k,v) -> System.out.println( k + "\t" + v));
		System.out.println("---------------------------------------------------------");
	}else{
		System.out.println("Invalid !");
	}
	}
	void Slot() {
		Scanner place = new Scanner(System.in);
		System.out.print("Enter valid Code \t\t: ");
		int area = place.nextInt();
		
		String Chennai = this.Chennai.get(area);				//to get user key data from Chennai 
		String Coimbatore = this.Coimbatore.get(area);				//to get user key data from Coimbatore
		String Trichy = this.Trichy.get(area);					//to get user key data from Trichy
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Successfully registered !");
		System.out.print("Booked : ");
		if(city.equals("1")) {								//if user enter 1 it show list of chennai
			System.out.println(Chennai);						//to show and get key value for users
		}else if(city.equals("2")) {
			System.out.println(Coimbatore);
		}else if(city.equals("3")) {
			System.out.println(Trichy);
		}else {
			System.out.println("Invalid !");
		}
		System.out.println("---------------------------------------------------------");
	}
}
