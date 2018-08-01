package com.csam.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.csam.Runner.TRunner;

public class DirectDeposit extends TRunner {
	
	private WebDriver driver;

	@BeforeClass
	public void setDriver() {
		driver=getDriver();
	  }
	   

	  @Test (priority=1)
	  public void direct_Login() throws Exception{
	  try{
           //context.driver.findElement("")
		  System.out.println("TestCase2");
		  System.out.println(driver);
	   }catch(Exception e){
	    	  System.out.println(e.getMessage());
	      }
    } 

}
