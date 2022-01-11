package com.covid;

import java.util.Scanner;

class Execute{
	void ExecuteMethod() {
	SelfRegistration reg = new SelfRegistration();				
	VaccineCheck vc = new VaccineCheck();						
	Scanner val = new Scanner(System.in);								
	System.out.println("\t\tWelcome to Covid Application");
	System.out.println("---------------------------------------------------------");
	System.out.println("\t\t\tRegister");
	System.out.println("---------------------------------------------------------");
	reg.UserDetails();										//self reg class 
	reg.MobileNo();											//vaccine class
	
	while(true) {
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Enter 1 to Register 'New User' ");
		System.out.println("Enter 2 to Check Vaccine availability ");
		System.out.println("Enter 3 to Book Your Slot ");
		System.out.println("Enter 4 to Exit ");
		System.out.println("---------------------------------------------------------");
		
		int value;
		value = val.nextInt();
		
		switch(value){
		case 1: reg.UserDetails();								//user details method calling
				reg.MobileNo();								//mobile no method calling
		break;
		
		case 2: vc.Check();									//check method calling for availability
		break;
		
		case 3: vc.Check();									//check method calling for availability
				vc.Slot();								//slot method calling to select slot
			 	reg.Book();								//book method to book slot
		break;
		
		case 4: System.out.println("*************************");
				System.out.println("*\t ThankYou! \t*");
				System.out.println("*************************");
				System.exit(4);
		}
	}
	}
}

public class Covid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execute cov = new Execute();
		cov.ExecuteMethod();
		}
	}
