package com.selinum.practice;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusBankAdminLogin {

	public static void main(String[] args)
	{
	  System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
      FirefoxDriver driver=new FirefoxDriver();
      driver.navigate().to("http://www.primusbank.qedgetech.com/");
      driver.manage().window().maximize();
      driver.findElement(By.id("txtuId")).sendKeys("Admin");
      driver.findElement(By.name("txtPword")).sendKeys("Admin");
      driver.findElement(By.id("login")).click();
      }
}

