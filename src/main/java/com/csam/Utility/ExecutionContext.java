package com.csam.Utility;

import java.net.MalformedURLException;
import java.net.UnknownHostException;

import org.openqa.selenium.WebDriver;

public class ExecutionContext {
	
	public WebDriver driver;
	public String browser;
	public String environ;
	public String startTime;
	public String endTime;
	
	public ExecutionContext() throws MalformedURLException, UnknownHostException{	
		try{	
			System.out.println(" ***** Context Intialization with the Empty Values ***** ");
		}catch(Exception e){
			e.printStackTrace();
		}
		}	
	

}
