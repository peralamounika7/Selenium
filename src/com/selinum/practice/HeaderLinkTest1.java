package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinkTest1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.quikar.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchedCat")).click();
		

	}

}
