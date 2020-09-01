package com.selinum.practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args)
	{
   System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://Gmail.com");
	}

}
