package com.Medicine_lead_TC;

import org.testng.annotations.Test;

import com.BeatO.PageObject.medicine_lead_pg1;

public class Medicine_lead_TC extends Base_class
{
	
    @Test
	public void freeglucolp1() throws InterruptedException
	{
    	driver.get(baseurl);
    	logger.info("URL Opened");
    	Thread.sleep(2000);
    	driver.manage().window().maximize();
    	
    	medicine_lead_pg1 obj=new medicine_lead_pg1(driver);
    	obj.clickbuy();
    	
}
}
