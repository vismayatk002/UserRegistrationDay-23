package com.userregistrationday_23;

import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;

import org.junit.Test;

public class UserRegistrationTest {
    
	@Test
    public void givenValidFirstNameShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertTrue(user.validateName("Vismaya"));
    }
	
	@Test
    public void givenValidLastNameShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertTrue(user.validateName("Deepak"));
    }
	
	@Test
    public void givenFirstNameWithLessThan3ShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertFalse(user.validateName("A"));
    }
	
	@Test
    public void givenFirstNameStartingWithLowercaseCharacterShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertFalse(user.validateName("vismaya"));
    }
	
	@Test
    public void givenValidEmailShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertTrue(user.validateEmail("abc.xyz@bl.co.in"));
    }
	
	@Test
    public void givenInValidEmailShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertFalse(user.validateEmail("abc.xyz@gmail.com"));
    }
	
	@Test
    public void givenValidPhoneNumberShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertTrue(user.validateMobileNo("918653201420"));
    }
	
	@Test
    public void givenInValidPhoneNumberShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertFalse(user.validateMobileNo("8621304512"));
    }
	
	@Test
    public void givenValidPasswordShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertTrue(user.validatePassword("Vismayadeepak123@"));
    }
	
	@Test
    public void givenWithInValidPasswordWithLessthan8CharactersShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertFalse(user.validatePassword("Vis123@"));
    }
	
	@Test
    public void givenWithInValidPasswordWithAllLowerCaseShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertFalse(user.validatePassword("vismayadeepak123@"));
    }
	
	@Test
    public void givenWithInValidPasswordWithoutAnyNumericCharactersShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertFalse(user.validatePassword("Vismayadeepak@"));
    }
	
	@Test
    public void givenWithInValidPasswordWithoutAnySpecialCharactersShouldTrue() {
        
		UserRegistration user = new UserRegistration();
		Assertions.assertFalse(user.validatePassword("Vismayadeepak123"));
    }
	
	@Test
    public void givenInvalidNameShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
    		UserRegistration user = new UserRegistration();
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(UserRegistrationInvalidException.class);
	    	user.validateName("vismaya");
	        
    	}catch(UserRegistrationInvalidException e) {
    		System.out.println(e.getMessage());
    	}
    }
	
	@Test
    public void givenInvalidEmailShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
    		UserRegistration user = new UserRegistration();
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(UserRegistrationInvalidException.class);
	    	user.validateEmail("abc.xyz@gmail.com");
	        
    	}catch(UserRegistrationInvalidException e) {
    		System.out.println(e.getMessage());
    	}
    }
	
	@Test
    public void givenInvalidMobileNoShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
    		UserRegistration user = new UserRegistration();
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(UserRegistrationInvalidException.class);
	    	user.validateMobileNo("8621304512");
	        
    	}catch(UserRegistrationInvalidException e) {
    		System.out.println(e.getMessage());
    	}
    }
	
	@Test
    public void givenInvalidPasswordShouldGetThrowsExceptionMessage() {
    	
    	try {
    		
    		UserRegistration user = new UserRegistration();
	    	ExpectedException exceptionRule = ExpectedException.none();
	    	exceptionRule.expect(UserRegistrationInvalidException.class);
	    	user.validatePassword("Vis123@");
	        
    	}catch(UserRegistrationInvalidException e) {
    		System.out.println(e.getMessage());
    	}
    }
}

