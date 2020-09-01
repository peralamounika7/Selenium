package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingTest {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.navigate().to("https://www.bing.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("sb_form_q")).sendKeys("bookmyshow");
	  
	}
}