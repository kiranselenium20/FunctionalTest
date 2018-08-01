package com.csam.CommonLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

public class MisFunctions {
	
	public static String getStackMsg(Throwable e) {
	    StringBuffer sb = new StringBuffer();
	    sb.append(e.toString()).append("}");
	    StackTraceElement[] stackArray = e.getStackTrace();

	    for(int i = 0; i < 1; i++) {
	        StackTraceElement element = stackArray[i];
	        sb.append(element.toString() + "\n");
	    }

	    return sb.toString().substring(sb.indexOf("{") + sb.length(),sb.lastIndexOf("}"));
	}

	public static String getScreenShot(WebDriver driver, String screenShotName){
	 	File scrFile= null;
 		WebDriver augmentedDriver = new Augmenter().augment(driver);
			scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE); 			
	    	try {
    		File file = new File(System.getProperty("user.dir")+"/ScreenShots");
    		if (!file.exists()) {
    			if (file.mkdir()) {
    				System.out.println("Directory is created!");
    			} else {
    				System.out.println("Failed to create directory!");
    			}
    		}
			File outputFile = new File(System.getProperty("user.dir")+"/ScreenShots"+ screenShotName +"_"+DateFormats.addDate("MM_dd_YYYY_HH_mm_ss") +".png");				
			FileUtils.copyFile(scrFile, outputFile);
			System.out.println(outputFile.getAbsolutePath());
			return outputFile.getAbsolutePath();
		} catch (IOException e) {
			e.printStackTrace();
		}    		
    return null;	
   }
		
}
