package com.userregistrationday_23;

import java.util.*;
import java.util.regex.Pattern;


public class UserRegistration {
	
	public void validateName(String Name) throws UserRegistrationInvalidException{
			
		if(Character.isUpperCase(Name.charAt(0))) {
			
			if(Name.length() < 3) {
				
				throw new UserRegistrationInvalidException("First name should have minimum 3 letters");
			}
		}
		else {
			throw new UserRegistrationInvalidException( "first letter must be caps");
		}
	}
	
	public void validateEmail(String email) throws UserRegistrationInvalidException{
			
		String regex = "^(.+)@bl.co(.+)$"; 
		Pattern pattern = Pattern.compile(regex); 
		if(!pattern.matcher(email).matches()) {
			
			throw new UserRegistrationInvalidException( "Invalid Email id");
		}
	}
	
	public void validateMobileNo(String mobNo) throws UserRegistrationInvalidException{
		
		Pattern pattern = Pattern.compile("91[0-9]{10}");
		if(!pattern.matcher(mobNo).matches()) {
			throw new UserRegistrationInvalidException( "Invalid Mobile number");
		}
	}
	
	public void validatePassword(String password) throws UserRegistrationInvalidException{
		
		Pattern UpperCasePatten = Pattern.compile("[A-Z]");
		Pattern numericNumberPatten = Pattern.compile("[0-9 ]");
		Pattern specialCharacterPatten = Pattern.compile("[^a-zA-Z0-9]");
		if(password.length() < 8) {
			
			throw new UserRegistrationInvalidException( "Password should have minimum 8 characters");
		}
		else if (!UpperCasePatten.matcher(password).find()){
		
			throw new UserRegistrationInvalidException("Password must have atleast one uppercase character");
		}
		else if (!numericNumberPatten.matcher(password).find()){
			
			throw new UserRegistrationInvalidException("Password must have atleast one numeric number");
		}
		else if (!specialCharacterPatten.matcher(password).find()){
			
			throw new UserRegistrationInvalidException("Password must have exactly one special character");
		}
	}
	
    public static void main( String[] args ) {
        
    	try {
    		
	    	UserRegistration user = new UserRegistration();
	    	Scanner sc = new Scanner(System.in);	
	    	System.out.print( "Enter your first name : ");
	    	String firstName = sc.nextLine(); 
	    	user.validateName(firstName);
			System.out.print( "Enter your last name : ");
			String lastName = sc.nextLine();
			user.validateName(lastName);
			System.out.print( "Enter your email id : ");
			String email = sc.nextLine();
			user.validateEmail(email);
			System.out.print( "Enter your Mobile Number : ");
			String mobNo = sc.nextLine(); 
			user.validateMobileNo(mobNo);
			System.out.print( "Enter your Password : ");
			String password = sc.nextLine(); 
			user.validatePassword(password);
			
    	}catch(UserRegistrationInvalidException e) {
    		
    		System.out.println(e.getMessage());
    	}
    }
}

