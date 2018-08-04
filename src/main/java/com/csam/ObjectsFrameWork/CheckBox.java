package com.csam.ObjectsFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
	
	public static boolean isChecked(WebDriver driver,By by){
		//WebElement ele = driver.findElement(by);
		return driver.findElement(By.tagName("input")).getAttribute("checked").equals("true");
	}
	
	public static void Check(WebDriver driver,By by){		
		if(!isChecked(driver, by)){
			driver.findElement(by).click();
		}		
	}
	
	public static void unCheck(WebDriver driver,By by){
		if(isChecked(driver, by)){
			driver.findElement(by).click();
		}
	}
	
	public static boolean isPresent(WebDriver driver,By by){
		return driver.findElement(by).isDisplayed();
	}
	
	public static boolean isEnabled(WebDriver driver,By by){
		return driver.findElement(by).isEnabled();
	}
}