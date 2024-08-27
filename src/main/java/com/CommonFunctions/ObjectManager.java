package com.CommonFunctions;

import org.openqa.selenium.WebDriver;

import com.LucencyPages.APIKeysPage;
import com.LucencyPages.LucencyHomePage;
import com.Utility.AutomationLogs;
import com.Utility.BrowserDetails;

public class ObjectManager {
	
		WebDriver driver;
		
		private AutomationLogs log;
		private BrowserDetails browserDetails;
		private APIKeysPage apiKeys;
		private LucencyHomePage homepage;
		private GenericFunctions genericFunction;
	
	public ObjectManager(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public BrowserDetails getBrowserDetails() {
		
		return (browserDetails==null)?browserDetails=new BrowserDetails():browserDetails;
	}
	
	public AutomationLogs getLogs() {
		return (log==null)?log= new AutomationLogs():log;
	}
	
	public APIKeysPage getAPIkeys() {
		return (apiKeys==null)?apiKeys=new APIKeysPage(driver):apiKeys;
	}
	
	public LucencyHomePage getHomePage() {
		return (homepage==null)?homepage=new LucencyHomePage(driver):homepage;
	}
	
	/*
	 * public GenericFunctions getGenericFunctions() { return
	 * (genericFunction==null)?genericFunction=new
	 * GenericFunctions(driver):genericFunction; }
	 */
}
