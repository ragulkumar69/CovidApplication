package com.covid;

import java.util.Random;
import java.util.regex.*; 
import java.util.Scanner;

class SelfRegistration{
	private String name;				//to name
	private String age;				//to age
	private String Aadhar;  			//to Aadhar
	private String Email;				//to Email
	private int num;				//to get random number for verification
	private String Mobile;				//to mobile number
	private int verify;				//to verify
	int num1;
	
	void UserDetails() {					//User Login Details and validation
		String age="^(([1-9][0-9])|(1[0][0-9]))$";				//regex age 
		String Aadhar="^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$";			//regex Aadhar
		String Email="^[A-Za-z0-9+-._]+@(.+)$";					//regex Email
		
		try {
			Scanner user = new Scanner(System.in);
			System.out.print("Enter Your Name \t\t: ");			//getting name
			this.name = user.next();
			
			do {
			System.out.print("Enter Your Age \t\t\t: ");			//getting age
			this.age = user.next();
				if(!Pattern.matches(age, this.age)) {			//regex validation age
					System.out.println("\n-----Sorry, Please Enter Valid Age-----");
				}
			}while(!Pattern.matches(age, this.age));
			
			do {
			System.out.print("Enter Your Aadhar No. \t\t: ");		//getting aadhar
			this.Aadhar = user.next();
				if(!Pattern.matches(Aadhar, this.Aadhar)) {		//regex validation aadhar
					System.out.println("\n-----Sorry, Please Enter Valid Aadhar-----");
				}
			}while(!Pattern.matches(Aadhar, this.Aadhar));
			
			do {
			System.out.print("Enter Your Email \t\t: ");			//getting email
			this.Email = user.next();
				if(!Pattern.matches(Email, this.Email)) {		//regex validation email
					System.out.println("\n-----Sorry, Please Enter Valid Email-----");
				}
			}while(!Pattern.matches(Email, this.Email));
			
			}catch(Exception e) {
				System.out.println("Invalid !");
		}
		
	}

	void MobileNo() {								//Mobile num and verification
		String Mobile="^[6-9][0-9]{9}$";					//regex mobile
		
		try{
			
			Scanner Mob = new Scanner(System.in);
			do {
			System.out.print("\nEnter Your Mobile No \t\t: ");		//getting Mobile no.
			this.Mobile = Mob.nextLine();
			if(!Pattern.matches(Mobile, this.Mobile)) {			//regex validation mobile no.
				System.out.println("\n-----Sorry, Please Enter Valid Mobile Number!-----");
			}
			}while(!Pattern.matches(Mobile, this.Mobile));
		
		}catch(Exception e) {
			System.out.println("Invalid Number");
		}
		
		System.out.println();
		Random R = new Random();						//Random Number generator
		System.out.print("Verification \t\t\t: ");
		for (int count = 1; count <=2; count++) {
			num = R.nextInt(9);
			num1 = num+8;
		}
		
		System.out.println("What is "+num+"+8 ?");
		
		do{
			System.out.print("Enter Correct Value \t\t: ");		//Verification
			Scanner Mob = new Scanner(System.in);
			verify = Mob.nextInt();
		}while(num1 != verify);
		System.out.println("Registered Succesfully!");
	}
	void Book() {								//user data output
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Registration Details!");
		System.out.println("Name \t\t: \t"+name);
		System.out.println("Age \t\t: \t"+age);
		System.out.println("Aadhar No. \t: \t"+Aadhar);
		System.out.println("Email \t\t: \t"+Email);
		System.out.println("Mobile \t\t: \t"+Mobile);
		System.out.println();
		System.out.println("Note : You have to be come and collect token in center\nfrom 8 o clock to 9.30 on 21/01/2022");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}
}
