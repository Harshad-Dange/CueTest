package com.StepDefination;

import com.Utility.baseClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestStep extends baseClass {
	
	@Given("^User  application$")
	public void user_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		System.out.println("TestStep clas");
		System.out.println(driver.getTitle());
	}
	
	@Then ("^verify application for test$")
	public void login11() {
		
		System.out.println("Verify Login");
	}

}
