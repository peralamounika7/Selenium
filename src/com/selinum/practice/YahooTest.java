package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://in.yahoo.com/");
		 driver.manage().window().maximize();
         driver.findElement(By.id("uh-search-box")).sendKeys("selinium");
         driver.findElement(By.id("uh-search-button")).click();
         
}

}
