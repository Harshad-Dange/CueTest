package com.StepDefination;

import com.CommonFunctions.ObjectManager;
import com.LucencyPages.APIKeysPage;
import com.LucencyPages.LucencyHomePage;
import com.Utility.baseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApiKeysStepDefination extends baseClass{
	
	ObjectManager objManager;
	LucencyHomePage homepage;
	APIKeysPage apiKeypage;
    
    @Given("^I should navigate to login page and clicks on login$")
    public void i_should_navigate_to_login_page_and_clicks_on_login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
		
		objManager=new ObjectManager(driver);
		apiKeypage=objManager.getAPIkeys();
    	getBrowser();
//		driver.get(baseClass.getUrl());
		apiKeypage.LogintoApplication();
    }
    
    @When("^I Clicks on account manager menu$")
    public void i_Clicks_on_account_manager_menu() throws Throwable {
        
    	
    }
    

	@When("^User clicks on API keys submenu$")
	public void user_clicks_on_API_keys_submenu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}
    
    @When("^I click add api key button$")
    public void add_api() throws Exception 
	   {
		/*
		 * try {
		 * 
		 * api.btn_addapi(d).click(); d.manage().timeouts().implicitlyWait(40,
		 * TimeUnit.SECONDS); System.out.println("Clicked on add api key button"); }
		 * catch(Exception e) { throw e; }
		 */
	   }  
    
    @When("^I enter apikey details$")
    public void add_session() throws Exception 
	{/*
		 * try {
		 * 
		 * api.session_name(d).click(); Add.csvsessionname(d);
		 * System.out.println("Entered session name"); } catch(Exception e) { throw e; }
		 */
	   }  
    
    @When("^I click on add apikey button on pop up$")
    public void add_apikey_btn() throws Exception 
	{/*
		 * try {
		 * 
		 * api.addapi_btn(d).click(); JavascriptExecutor js = (JavascriptExecutor) d;
		 * js.executeScript("window.scrollBy(0,-250)", "");
		 * d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 * System.out.println("Clicked on api key button on pop up"); } catch(Exception
		 * e) { throw e; }
		 */
	   }  
    
    
    @Then("^I should see page with message API key was successfully created$")
    public void add_api_success() throws Exception 
	{/*
		 * try {
		 * 
		 * if(msg.api_create_msgs(d).getText().
		 * contains("Api key was successfully created.")) {
		 * System.out.println("Api key was successfully created."); d.close(); }
		 * 
		 * else { System.out.println("Api key creation failed."); }
		 * 
		 * } catch(Exception e) { throw e; }
		 */
	   }  
    

    @When("^I click edit button$")
    public void edit_session() throws Exception 
	{/*
		 * try {
		 * 
		 * api.editapi_btn(d).click(); d.manage().timeouts().implicitlyWait(40,
		 * TimeUnit.SECONDS); System.out.println("Clicked on edit button"); }
		 * catch(Exception e) { throw e; }
		 */
	   }
    
    @When("^I enter session name details$")
    public void edit_session_name() throws Exception 
	   {
		/*
		 * try {
		 * 
		 * api.editsession_name(d).click(); api.editsession_name(d).clear();
		 * System.out.println("Clicked on session name"); Add.csveditsession(d);
		 * System.out.println("Entered session name"); } catch(Exception e) { throw e; }
		 */
	   }
    
    
    
    @When("^I click on generate apikey button$")
    public void generate_apikey() throws Exception 
	   {
//		    try
//		    {
//		    	
//		    	api.generateapi_key(d).click();
//		    	System.out.println("Clicked on generate api key button");
//		    	
//		    }
//		    catch(Exception e)
//		    {
//		    	throw e;
//		    }
//		
	   }
    
    
    @When("^I click on save button$")
    public void btn_save() throws Exception 
	   {
//		    try
//		    {
//		    	
//		    	api.save_btn(d).click();
//		    	System.out.println("Clicked onsave button");
//		    	
//		    }
//		    catch(Exception e)
//		    {
//		    	throw e;
//		    }
//		
	   }
    
    @Then("^I should see page with message API key was successfully edited$")
    public void api_edit_success()throws Exception 
	{/*
		 * try { if
		 * (msg.api_edit_msgs(d).getText().contains("Api key was successfully updated."
		 * ))
		 * 
		 * { System.out.println("API successfully updated"); d.close();
		 * 
		 * }
		 * 
		 * }
		 * 
		 * catch(Exception e) { System.out.println("API Updation failed"); throw e; }
		 */
    }
    
    @When("^I click on deactivate button$")
    public void click_deactivate() throws Exception 
	{/*
		 * try {
		 * 
		 * api.deactivate_btn(d).click();
		 * System.out.println("Clicked on deactivate button");
		 * 
		 * } catch(Exception e) { throw e; }
		 */
	   }
    
    @When("^I click on deactivate button on pop up$")
    public void popup_deactivate() throws Exception 
	{/*
		 * try {
		 * 
		 * api.btn_deactivate(d).click();
		 * System.out.println("Clicked on deactivate button on pop up");
		 * 
		 * } catch(Exception e) { throw e; }
		 */
	   }
    
    @Then("^I should see page with message Api key deactivated successfully$")
    public void update_success() throws Exception 
	{/*
		 * try {
		 * 
		 * if(msg.api_edit_msgs(d).getText().
		 * contains("Api key deactivated successfully.")); {
		 * System.out.println("Api key deactivated successfully"); d.close(); }
		 * 
		 * }
		 * 
		 * catch(Exception e) { throw e; }
		 */
		
	   }
    
    @When("^I click on activate button$")
    public void activate_btn() throws Exception 
	{/*
		 * try {
		 * 
		 * api.activate_btn(d).click();
		 * System.out.println("Clicked on activate button");
		 * 
		 * } catch(Exception e) { throw e; }
		 */
		
	   }
    
    @When("^I click on got it button on pop up$")
    public void popup_btn() throws Exception 
	{/*
		 * try {
		 * 
		 * api.btn_activate(d).click(); System.out.println("Clicked on got it button");
		 * 
		 * } catch(Exception e) { throw e; }
		 */
	   }
    
    @Then("^I should see page with message Api key activated successfully$")
    public void activate_msg() throws Exception 
	{/*
		 * try {
		 * 
		 * if(msg.api_activate_msgs(d).getText().
		 * contains("Api key activated successfully.")) {
		 * 
		 * System.out.println("Api key activated successfully"); d.close(); } }
		 * 
		 * catch(Exception e) { throw e; }
		 */
	   }

}
