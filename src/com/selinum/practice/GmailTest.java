package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args)
	{

	  System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	  FirefoxDriver driver=new FirefoxDriver();
      driver.get("http://google.co.in");
      driver.manage().window().maximize();
      driver.findElement(By.className("gb_g")).click();
      
      
	}
}

