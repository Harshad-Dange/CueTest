package com.StepDefination;

import com.Utility.baseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LogintoLucency extends baseClass{
	
//	ObjectManager objManager=new ObjectManager(driver);
//	 AutomationLogs log=new AutomationLogs();

	
	/*
	 * public LogintoLucency(){
	 * 
	 * log = AutomationLogs.getAutomationLog();
	 * 
	 * }
	 */
	 
	 @Given("^User should navigate to login page and login to application$")
	public void Login_to_Application(){
		
//		driver.get(Configuration.getConfigurationValueForProperty("url"));
		
		driver.get(baseClass.getUrl());
		
//		AutomationLogs.info("This is given method");
		
	}
	
	@Then ("^verify that user has successful logged to application$")
	public void Verify_successful_login() {
		
		System.out.println("Verify Login");
	}

}
