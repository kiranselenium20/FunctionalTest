package com.csam.ObjectsFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class Buttons {
	
	public static void Click(WebDriver driver,By by) throws ElementNotFoundException {
		driver.findElement(by).click();			
	}
	
	public static boolean IsPresent(WebDriver driver,By by){
		return driver.findElement(by).isDisplayed();
	}
	
	public static boolean IsEnabled(WebDriver driver,By by){
		return driver.findElement(by).isEnabled();
	}


}
