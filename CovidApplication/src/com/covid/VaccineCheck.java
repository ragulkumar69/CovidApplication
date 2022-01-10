package com.covid;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class VaccineCheck extends SelfRegistration{
	String city;											// to get code of city
	LinkedHashMap<Integer,String> Che;						//Chennai vaccine list
	LinkedHashMap<Integer,String> Coim;						//Coimbatore Vaccine list
	LinkedHashMap<Integer,String> Tric;						//Trichy Vaccine list
	
	void Check() {
	Che = new LinkedHashMap<>();
	
	Che.put(1,"Chennai \tAmbattur \t70 dose");
	Che.put(2,"Chennai \tAnna Nagar \t100 dose");
	Che.put(3,"Chennai \tChrompet \t30 dose");
	Che.put(4,"Chennai \tGuindy \t\t60 dose");
	Che.put(5,"Chennai \tKodambakkam \t90 dose");
	Che.put(6,"Chennai \tPallavaram \t50 dose");
	Che.put(7,"Chennai \tPorur  \t\t80 dose");
	
	Coim = new LinkedHashMap<>();
	
	Coim.put(1,"Coimbatore \tGandhipuram \t75 dose");
	Coim.put(2,"Coimbatore \tKovaipudur \t90 dose");
	Coim.put(3,"Coimbatore \tSaibaba colony \t35 dose");
	Coim.put(4,"Coimbatore \tThondamuthur \t80 dose");
	Coim.put(5,"Coimbatore \tSinganallur \t110 dose");
	Coim.put(6,"Coimbatore \tKottaimedu \t50 dose");
	Coim.put(7,"Coimbatore \tRamnagar \t60 dose");
	
	Tric = new LinkedHashMap<>();
	
	Tric.put(1,"Trichy \t\tThuraiyur \t80 dose");
	Tric.put(2,"Trichy \t\tManapparai \t95 dose");
	Tric.put(3,"Trichy \t\tSrirangam \t55 dose");
	Tric.put(4,"Trichy \t\tLalgudi \t130 dose");
	Tric.put(5,"Trichy \t\tThiruverumbur \t70 dose");
	Tric.put(6,"Trichy \t\tPullambadi \t80 dose");
	Tric.put(7,"Trichy \t\tAndanallur \t100 dose");
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

		Che.forEach((k,v) -> System.out.println( k + "\t" + v));
		System.out.println("---------------------------------------------------------");
	}else if(city.equals("2")){
		System.out.println("---------------------------------------------------------");
		System.out.println("Code \tCity \t\tArea \t\tAvailability");
		System.out.println("---------------------------------------------------------");

		Coim.forEach((k,v) -> System.out.println( k + "\t" + v));
		System.out.println("---------------------------------------------------------");
	}else if(city.equals("3")){
		System.out.println("---------------------------------------------------------");
		System.out.println("Code \tCity \t\tArea \t\tAvailability");
		System.out.println("---------------------------------------------------------");
		Tric.forEach((k,v) -> System.out.println( k + "\t" + v));
		System.out.println("---------------------------------------------------------");
	}else{
		System.out.println("Invalid !");
	}
	}
	void Slot() {
		Scanner place = new Scanner(System.in);
		System.out.print("Enter valid Code \t\t: ");
		int area = place.nextInt();
		
		String Chennai = Che.get(area);				//to get user data from Chennai 
		String Coimbatore = Coim.get(area);			//to get user data from Coimbatore
		String Trichy = Tric.get(area);				//to get user data from Trichy
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Successfully registered !");
		System.out.print("Booked : ");
		if(city.equals("1")) {
			System.out.println(Chennai);
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
