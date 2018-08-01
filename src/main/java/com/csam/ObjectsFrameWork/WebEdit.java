package com.csam.ObjectsFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebEdit {

    public static void SetText(WebDriver driver,By by, String str)  {
		WebElement ele = driver.findElement(by);
		if(IsPresent(driver,by)){
			if(IsEnabled(driver,by)){
				ele.clear();
				ele.sendKeys(str);	
			}
		  }
		}
	
	public static boolean IsPresent(WebDriver driver,By by){
		WebElement ele = driver.findElement(by);
		if(ele.isDisplayed()){
			return true;
		}
		return false;
	}
	
	public static boolean IsEnabled(WebDriver driver,By by){
		WebElement ele = driver.findElement(by);
		if(ele.isEnabled()){
			return true;
		}
		return false;
	}
	
	public static String GetText(WebDriver driver,By by){
		WebElement ele = driver.findElement(by);
		if(IsPresent(driver, by)){
			if(IsEnabled(driver,by)){
				return ele.getText();
			}
		}
		return "";
	}
}
