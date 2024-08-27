package com.LucencyPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CommonFunctions.GenericFunctions;
import com.CommonFunctions.ObjectManager;
import com.Utility.AutomationLogs;
import com.Utility.baseClass;

public class LucencyHomePage extends baseClass {
		
	
		WebDriver driver;
//	ObjectManager objectManager=new ObjectManager(driver);
	public LucencyHomePage(WebDriver driver) {
		this.driver=driver;
//		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="login")
	public WebElement LoginIcon;
	
	@FindBy (id="user_email")
	public WebElement EmailId; 
	
	@FindBy (id="user_password")
	public WebElement Password; 
	
	@FindBy (xpath="//input[@type='submit']")
	public WebElement LoginButton; 
	
	@FindBy (xpath="//*[@class='active']/descendant::strong")
	public WebElement Home;
	
	@FindBy (xpath="//*[@class='menu-sub'][1]/descendant::strong[1]")
	public WebElement AcountManager; 
	
	@FindBy (xpath="//*[@class='menu-sub'][2]/descendant::strong[1]")
	public WebElement Campaigns; 
	
	@FindBy (xpath="//*[@class='menu-sub'][3]/descendant::strong[1]")
	public WebElement PhoneNumbers; 
	
	@FindBy (xpath="//*[@class='menu-sub'][4]/descendant::strong[1]")
	public WebElement Documentation; 
	
	@FindBy (xpath="//*[@class='menu-sub'][5]/descendant::strong[1]")
	public WebElement ErrorLog; 
	
	@FindBy (xpath="//*[@class='menu-sub'][6]/descendant::strong[1]")
	public WebElement SessionLookup; 
	
	
	public void clickOnHome() {
		
		Home.click();
	}
	
	public void clickOnAcountManager() {
		
		AcountManager.click();
	}
	
	public void clickOnCampaigns() {
		Campaigns.click();
	}
	
	public void clickOnPhoneNumbers() {
		PhoneNumbers.click();
		}

	public void clickOnDocumentation() {
		Documentation.click();
	}

	public void clickOnErrorLog() {
		ErrorLog.click();
	}

	public void clickOnSessionLookup() {
		SessionLookup.click();
	}
	
	
	
}
