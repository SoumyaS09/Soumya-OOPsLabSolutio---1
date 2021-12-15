package com.learning.driver;
import java.util.Scanner;
import com.learning.CredentialService.*;
import com.learning.model.*;

public class IdCreation {
	public static void main (String[]args){
		Employee employee  = new Employee(Soumya, Shetty);
		
		Scanner scanner= new Scanner(System.in);
		String firstName;
		String lastName;
		
		System.out.println("Welcome to ABC Global Service!");
		System.out.println();
		
		System.out.println("Please Enter your First Name : ");
		firstName = scanner.nextLine();
		
		System.out.println("Please Enter your last Name : ");
		lastName = scanner.nextLine();
		
		int option;
		System.out.println("Please select your department ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		System.out.println("5. Logout");
		int option = scanner.nextInt();
		


	}
	

}
