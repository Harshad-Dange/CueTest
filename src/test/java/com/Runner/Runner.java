package com.Runner;

import java.io.File;

import org.junit.runner.RunWith;

import com.Utility.baseClass;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
	
	@CucumberOptions(
			features="Features",	
			plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json","junit:target/cucumber.xml",
					 "com.cucumber.listener.ExtentCucumberFormatter:"},
			glue= {"stepDefination"},
			monochrome = true
			
			)
	@RunWith(Cucumber.class)
	public class Runner  {
	@Before
		public void before() {
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

		
	}


