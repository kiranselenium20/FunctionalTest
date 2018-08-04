package com.csam.ObjectsFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buttons {
	
	public static void Click(WebDriver driver,By by){
		driver.findElement(by).click();			
	}
	
	public static boolean IsPresent(WebDriver driver,By by){
		return driver.findElement(by).isDisplayed();
	}
	
	public static boolean IsEnabled(WebDriver driver,By by){
		return driver.findElement(by).isEnabled();
	}


}
