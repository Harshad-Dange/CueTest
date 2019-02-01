package com.LucencyPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.AutomationLogs;
import com.Utility.baseClass;

public class APIKeysPage  {
	
	WebDriver driver;
//	baseClass base=new baseClass();
	
	public APIKeysPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy (id="login")
	public WebElement LoginIcon;
	
	@FindBy (id="user_email")
	public WebElement EmailId; 
	
	@FindBy (id="user_password")
	public WebElement Password; 
	
	@FindBy (xpath="//input[@type='submit']")
	public WebElement LoginButton; 

public void LogintoApplication() {
	System.out.println("This is driver value-----------------"+driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			
//		genericFunctions=objectManager.getGenericFunctions();
//		genericFunctions.waitElementToBeClicable(driver.findElement(By.id("login")));
		driver.findElement(By.id("login")).click();	
		EmailId.sendKeys(baseClass.getUsername());
		Password.sendKeys(baseClass.getPassword());
		LoginButton.click();
		AutomationLogs.info("Successful logged to Applciation");
		}
		catch(Exception e) {
			e.printStackTrace();
			AutomationLogs.error("Failed to login to application");
		}
	}
}
