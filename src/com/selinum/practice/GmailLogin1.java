package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	     FirefoxDriver driver=new FirefoxDriver();
	     driver.navigate().to("http://gmail.com");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("identifierId")).sendKeys("smlcodes@gmail.com");
         driver.findElement(By.className("RveJvd")).click();
         driver.findElement(By.name("password")).sendKeys("123abcABC@");
         driver.findElement(By.className("CwaK9")).click();
        
      // driver.findElement(By.className("whsOnd")).sendKeys("123abcABC@");
	}

}
