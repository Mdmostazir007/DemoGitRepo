package com.qa.tests;

public class LoginTest {

	
	String username;
	String password;
	String emailId;
	int otp;
	long mobileNumber;
	String facebookId;

	public LoginTest(String username, String password, String emailId, int otp, long mobileNumber, String facebookId) {
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.otp = otp;
		this.mobileNumber = mobileNumber;
		this.facebookId = facebookId;
	}

	 
	
	public void doLogin(){
		System.out.println("login with: "+ emailId + " " + otp);
	}

	public static void main(String[] args) {

		 
		int fact = 1;
		for(int i = 1; i<=6; i++){
			fact = fact * i;
		}
		
		System.out.println(fact);
		
	}  	
	
	
	
	
	 

	
	
	
	
	
}
