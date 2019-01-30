package com.StepDefination;

import com.Utility.AutomationLog;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LogintoLucency {
	
	
	@Given("^User should navigate to login page and login to application$")
	public void Login_to_Application(){
		AutomationLog.info("This is login method");
		System.out.println("This is login method");
		
	}
	
	@Then ("^verify that user has successful logged to application$")
	public void Verify_successful_login() {
		
		System.out.println("Verify Login");
	}

}
