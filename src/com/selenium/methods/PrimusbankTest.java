package com.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusbankTest 
{
	


//app launch
public String applaunch(String url)
{
	System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
    FirefoxDriver driver=new FirefoxDriver();
    driver.get(url);
    driver.manage().window().maximize();
    //validation
    
    String res;
	if(driver.findElement(By.id("txtuId")).isDisplayed())
    		{
    //	System.out.println("pass");
    	res="pass";
    	}else
    	{
    	//	System.out.println("fail");
    	res="fail";
    	}
return res;
}
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		//app launch
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://primusbank.qedgetech.com");
	    driver.manage().window().maximize();
	    //validation 
	    if(driver.findElement(By.id("txtuId")).isDisplayed())
	    		{
	    	System.out.println("pass");
	    	}else
	    	{
	    		System.out.println("fail");
	    	}
	    		
	   

	}

}
