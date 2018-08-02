package com.csam.PageObjects;

import org.openqa.selenium.By;

public class AcctSummaryObj {
	/*Login Page objects*/
	public By UserName=By.xpath("//input[@id='ContentPlaceHolder1_LoginUserIdText']");
	public By Password=By.xpath("//input[@id='ContentPlaceHolder1_PasswordText']");
	public By signButton=By.xpath("//input[@id='ContentPlaceHolder1_LoginButton']");
	public By welcomeText=By.xpath(".//[@id='ContentPlaceHolder1_PortalLandingPageTitle']");
	
	/* Help menu object*/
	public By helpMenu=By.xpath(".//strong[@class='text-uppercase' and contains(text(),'HELP')]");
	public By knowledgeCenter=By.xpath(".//*[@id='framework-container']//div[@class='tabs-container animate']//li[@ui-sref='shell.knowledgecenter']");
	public By contactUs=By.xpath(".//*[@id='framework-container']//div[@class='tabs-container animate']//li[@ui-sref='shell.contact']");
	

}
