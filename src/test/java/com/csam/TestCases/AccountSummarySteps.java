package com.csam.TestCases;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.csam.CommonLib.ExFunctions;
import com.csam.CommonLib.MisFunctions;
import com.csam.Runner.TRunner;
import com.csam.TestCaseMethods.AccountSummaryMethods;
import com.csam.Utility.PropertiesFile;

public class AccountSummarySteps extends TRunner{
	
	private WebDriver driver;
	private PropertiesFile propFile=new PropertiesFile();
	private AccountSummaryMethods accSummaryMethod=new AccountSummaryMethods();

	@BeforeClass
	 public void setDriver() {
		this.driver=getDriver();
	  }
	   
	  @Test (priority=1)
	  public void open_App(){
	  try{
          this.driver.get("https://dev-myspendingaccount.alphadev.works");
          System.out.println(this.driver.getTitle());
          Thread.sleep(1000);
           if(this.driver.getTitle().equals("Login - Spending Accounts"))
           {
        	   ExFunctions.writeResults("open_App", "Pass","");
           }else{
        	   ExFunctions.writeResults("open_App", "Fail","");
        	   driver.quit();
           }
           //assertEquals("Registration Module",this.driver.getTitle()); 
	   }catch(Exception e){
		   ExFunctions.writeResults("open_App", "Fail","");
	      }
    } 
	  
	  @Test (priority=2)
	  public void login_App() throws IOException, InterruptedException{
		try{
	     if(accSummaryMethod.login(this.driver,propFile.getWebDetails("userName1"),propFile.getWebDetails("password1"))){
	    	 ExFunctions.writeResults("Logged into app", "Pass","");
	     }else{
	    	 ExFunctions.writeResults("Can't Login into App", "Fail","");
	     }
		}catch(Exception e){
			System.out.println(MisFunctions.getStackMsg(e));
		 	//System.out.println(e.getMessage());
			//System.out.println(e.getMessage().substring(16,90).replace("method","").replace("xpath","").replace("selector", "").replace(":",""));
			ExFunctions.writeResults("open_App", "Fail","");
		}
	  }

}
