package com.csam.TestCaseMethods;

import org.openqa.selenium.WebDriver;

import com.csam.ObjectsFrameWork.Buttons;
import com.csam.ObjectsFrameWork.WebEdit;
import com.csam.PageObjects.AcctSummaryObj;

public class  AccountSummaryMethods {
	
	public AcctSummaryObj acsObj;
	
	public AccountSummaryMethods(){
		acsObj=new AcctSummaryObj();
	}
	
	public  boolean login(WebDriver driver,String strUserName, String strPassword) throws InterruptedException{
			 WebEdit.SetText(driver, acsObj.UserName,strUserName);
			 WebEdit.SetText(driver, acsObj.Password,strPassword);
			 Buttons.Click(driver, acsObj.signButton);
			 Thread.sleep(1000);
	        if(driver.getTitle().equals("Spending Accounts Account Summary"))
	          {
	       	   return true;
	          }else{
	       	   return false;
	          }
	}
        
}
