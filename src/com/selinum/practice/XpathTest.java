package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("harry poter");
		Thread.sleep(2000);
		

	}

}
