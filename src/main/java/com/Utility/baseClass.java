package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.CommonFunctions.ObjectManager;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author Harshad
 *
 */
public class baseClass {
	
	public static WebDriver driver=null;
	public static Properties properties=new Properties();
	InputStream input;
	
	public static final String reportDirectory = new File(System.getProperty("user.dir")) + "/Reports/";
	public static final String DEFAULT_CONFIG_PATH="src/main/java/com/configurations/config.properties";
	public static String path;
	ObjectManager objManager=new ObjectManager(driver);
//	public static AutomationLogs log = AutomationLogs.getAutomationLog();
	
	public baseClass() {	
		
		
		 try {
//				input=getClass().getClassLoader().getResourceAsStream("");
				input=new FileInputStream(DEFAULT_CONFIG_PATH);
				properties.load(input);
			}
			catch(IOException e) {
				throw new RuntimeException("Could not read the properties file");
			}
			finally {				
				if(input!=null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}				         
			}
}	
	public void getBrowser() {
		
		String browser=properties.getProperty("browser");
		
		
		objManager.getBrowserDetails().setBrowserName(browser);
		
		if(properties.getProperty("executionType").equals("Single")){
			
		
			switch (objManager.getBrowserDetails().getBrowserName()) {
			case "chrome":
//				System.setProperty("webdriver.chrome.driver", "Binaries/chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			
			case "internetExplorer":
//				System.setProperty("webdriver.ie.driver", "Binaries/IEDriverServer.exe");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				break;
				
			case "firefox":
//				System.setProperty("webdriver.gecko.driver", "Binaries/geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;

			default:
//				System.setProperty("webdriver.chrome.driver", "Binaries/chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			}
		}
		
	}
	
	public static String getUrl() {
		return properties.getProperty("url");		
	}
	
	public  static String getUsername() {
		System.out.println(properties.getProperty("username"));
		return properties.getProperty("username");
	}
	
	public static String getPassword() {
		return properties.getProperty("password");
	}
	
	
	public  static void createReportFolder() {
		
//		System.out.println(reportDirectory);
		
		Date date=new Date();
		Timestamp timestamp=new Timestamp(date.getTime());
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		String time=dateFormat.format(timestamp);
		File dir=new File(reportDirectory);
		
		if(!dir.exists()){
			dir.mkdirs();
		}
		
		path=reportDirectory+time;
		dir=new File(path);
		dir.mkdirs();
		System.out.println(path);
		}
	
	
	public void takescreenshot(String methodName) {
	
		try {
//		FileOutputStream outputfile=new FileOutputStream(str);
//		outputfile.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
		
//		System.out.println(path);
//		String path=createReportFolder()+".jpg";
		File  srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File screenshot=new File(path+"/screenShots/"+"/"+methodName+".jpg");
		
		FileUtils.copyFile(srcFile, screenshot );
		}
		catch(WebDriverException e) {
			e.printStackTrace();      
		} catch (IOException e) {
			System.out.println("Fail to generate file : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void generateReport() {
		/*
		 * htmlReporter=new ExtentHtmlReporter(path+"/AutomationReport.html");
		 * htmlReporter.loadXMLConfig("src/main/java/configurations/extent-config.xml");
		 * reports.setSystemInfo("", ""); reports.attachReporter(htmlReporter);
		 */
		
	}

	

}