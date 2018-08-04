package com.csam.ObjectsFrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
		
	public static void Select(WebDriver driver,By by, String valueToSelect){
		WebElement ele = driver.findElement(by);
		if(IsPresent(driver,by)){
			if(IsEnabled(driver,by)){
				Select sel = new Select(ele);
				List<WebElement> list = sel.getOptions();
				for(WebElement element:list){
						if ( element.getText().trim().equalsIgnoreCase(valueToSelect)){
								element.click();
								break;
						}
					}
			}
		}
	}
	
	public static boolean IsPresent(WebDriver driver,By by){
		return driver.findElement(by).isDisplayed();
	}
	
	public static boolean IsEnabled(WebDriver driver,By by){
		return driver.findElement(by).isEnabled();
	}

}
