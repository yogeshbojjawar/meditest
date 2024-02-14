package com.BeatO.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class medicine_lead_pg1 {
WebDriver ldriver;
	
	public medicine_lead_pg1(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
				
	}	
	
	@FindBy(xpath="//button[text()='BUY NOW'][1]")
	@CacheLookup
	WebElement buynow;



public void clickbuy() {
	buynow.click();	
}
}