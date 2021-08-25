package com.userregistrationday_23;

import java.util.*;

public class UserRegistration { 
	
	@FunctionalInterface
    public interface Validate {
		
        public boolean validateDetails(String name);
    }
	
	 public static Validate validateName() {
		 
        return data -> data.matches("^[A-Z].*{3,}");
    }
	
	 public static Validate validateEmail() {
			
		return data -> data.matches("^(.+)@bl.co(.+)$");
	}
	 
	 public static Validate validateMobileNo() {
			
			return data -> data.matches("91[0-9]{10}");
	}
	 
	 public static Validate validatePassword() {
			
			return data -> data.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}");
	}
	 
    public static void main( String[] args ) {
    	
    	Scanner sc = new Scanner(System.in);	
    	
    	System.out.print( "Enter your first name : ");
    	String firstName = sc.nextLine(); 
    	boolean isValidName = UserRegistration.validateName().validateDetails(firstName);
        System.out.println((isValidName == false) ? "Invalid First name" : "");
    	
		System.out.print( "Enter your last name : ");
		String lastName = sc.nextLine();
		isValidName = UserRegistration.validateName().validateDetails(lastName);
        System.out.println((isValidName == false) ? "Invalid Last name" : "");
        
		System.out.print( "Enter your email id : ");
		String email = sc.nextLine();
		boolean isValidEmail = UserRegistration.validateEmail().validateDetails(email);
        System.out.println((isValidEmail == false) ? "Invalid Email id" : "");
        
		System.out.print( "Enter your Mobile Number : ");
		String mobNo = sc.nextLine(); 
		boolean isValidMobileNo = UserRegistration.validateMobileNo().validateDetails(mobNo);
        System.out.println((isValidMobileNo == false) ? "Invalid Mobile number" : "");
        
		System.out.print( "Enter your Password : ");
		String password = sc.nextLine(); 
		boolean isValidatePassword = UserRegistration.validatePassword().validateDetails(password);
        System.out.println((isValidatePassword == false) ? "Invalid Password" : ""); 
    }
}

