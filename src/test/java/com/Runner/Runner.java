package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Utility.baseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
/*@ExtendedCucumberOptions(
	jsonReport = "target/cucumber.json",
	retryCount = 0,
	detailedReport = true,
	detailedAggregatedReport = true,
	overviewReport = true,
	toPDF = true,
	outputFolder = "target"
	)*/
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="Features",	
			plugin = { 	"pretty", 
						"html:target/site/cucumber-pretty",
						"json:target/cucumber.json",
						"junit:target/cucumber.xml",
					/*  "com.cucumber.listener.ExtentCucumberFormatter:" */
						},
			glue= {"com.StepDefination"},
			monochrome = true
			
			)
//	@RunWith(ExtendedCucumberOptions.class)
	public class Runner  extends baseClass{
//		static baseClass base=new baseClass();
		@BeforeClass
		public static void beforeTest() {
			System.out.println("test case is about start execution");
			baseClass.createReportFolder();
						
		}
		

		 @AfterClass
		 public static void tearDown() {
//			 base.takescreenshot("TestMethod");
			 driver.close();
		 }
		/*
		@Beforepublic void before() {
		baseClass.createReportFolder();
		ExtentProperties extentProperties=ExtentProperties.INSTANCE;
		extentProperties.setReportPath(baseClass.path+"/AutomationResult.html");
		}

		@After
		public void after() {

			baseClass.driver.close();
			baseClass.driver.quit();
			
		}
		@After		
		public void aftersuite() {
			Reporter.loadXMLConfig(new File("/home/harshad/Documents/Automation/Cucumber_TestNG/src/main/java/configurations\\extent-config.xml"));			
			Reporter.setSystemInfo("Environment", "Testing");
			Reporter.setSystemInfo("Browser", baseClass.properties.getProperty("browser"));
//			reports.flush();
		}

		*/
	}


