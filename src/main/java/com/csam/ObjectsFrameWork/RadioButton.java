package com.csam.ObjectsFrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {
	
	public static void Select(WebDriver driver, By by, String strOptionToSelect){
	List<WebElement> radioGroup = driver.findElements(by);
	if(IsPresent(driver,by)){
		if(IsEnabled(driver,by)){
			for (WebElement element : radioGroup){
				if(element.getAttribute("value").trim().equalsIgnoreCase(strOptionToSelect)){
					if(!element.isSelected()){
							element.click();
							break;
					}
					else{
						System.out.println("Radio button selected already");
						break;
					}
				}
			}
		}
	}
  }

	
	public static boolean VerifySelect(WebDriver driver, By by, String strOptionToSelect){
		List<WebElement> radioGroup = driver.findElements(by);
		if(IsPresent(driver,by)){
			if(IsEnabled(driver,by)){
				for (WebElement element : radioGroup){
					if(element.getAttribute("value").trim().equalsIgnoreCase(strOptionToSelect)){
						if(element.isSelected()){
								return true;
						}
						else{
							System.out.println("Radio button selected already");
							return false;
						}
					}
				}
			}
		}
		return false;
	}
	
	
	public static boolean IsPresent(WebDriver driver,By by){
		return driver.findElement(by).isDisplayed();
	}
	
	public static boolean IsEnabled(WebDriver driver,By by){
		return driver.findElement(by).isEnabled();
	}
	
}
