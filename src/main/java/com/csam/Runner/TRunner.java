package com.csam.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.csam.CommonLib.DateFormats;
import com.csam.CommonLib.ExFunctions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TRunner {

    private static WebDriver  driver;
	public static String strStartTime;
	public static String strEndTime;
	public static String strRunAgainst;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeSuite
	public void before_Suite(){
		try{
			ExFunctions.createOutPutfile();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//@Parameters({"EnvironmentType"})
    @BeforeTest
    public void before_Test() throws Exception {
		try {
			extent= new ExtentReports(System.getProperty("user.dir")+"/Results/TestExecution_Results_"+DateFormats.addDate("MM_dd_YYYY_HH_mm_ss")+".html");
			extent.addSystemInfo("Host Name", "Automation Machine");
			extent.addSystemInfo("User Name", "Kiran");
			extent.addSystemInfo("Browser", "Chrome");
			extent.addSystemInfo("Environment", "Dev");
			System.setProperty("webdriver.chrome.driver", "Lib/chromedriver.exe");
			driver=new ChromeDriver();
	 		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error....." + e.getStackTrace());
		}
	}
    
    public  WebDriver getDriver() {
		return driver;
	}
    
    @AfterTest
    public void closedriver(){
    	extent.flush();
    	extent.close();
        driver.close();
     }
    
    @AfterSuite
    public void afterSuite(){
    	//Duration timeElapsed = Duration.between(strStartTime, strEndTime);
    	//System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
  	  System.out.println("Execution end time: "+ strEndTime);
    }
	
}

