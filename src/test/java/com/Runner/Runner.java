package com.Runner;

import org.junit.runner.RunWith;
import com.Utility.AutomationLog;
import com.Utility.baseClass;

import cucumber.api.CucumberOptions;

	
	@ExtendedCucumberOptions(
		jsonReport = "target/cucumber.json",
		retryCount = 3,
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		toPDF = true,
		outputFolder = "target"
		)
	@CucumberOptions(
			features="Features",	
			plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json","junit:target/cucumber.xml",
		/* "com.cucumber.listener.ExtentCucumberFormatter:" */},
			glue= {"com.StepDefination"},
			monochrome = true
			
			)
	@RunWith(ExtendedCucumberRunner.class)
	public class Runner  extends baseClass{
	
		 @BeforeSuite
		    public static void setUp() {
//			 com.Utility.AutomationLog.info("");
			 baseClass.createReportFolder();
			 System.out.println("this is before suite");
			 AutomationLog.info("In Before Suite");
		    }
		 
		 @AfterSuite
		 	public static void after() {
			 
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


