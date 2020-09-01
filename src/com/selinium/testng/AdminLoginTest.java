package com.selinium.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void adminlogin()
{
	String ExpTitle="Primus Bank";
	String expurl="http://primusbank.qedgetech.com/adminflow.aspx";
	String username="Admin";
	String password="Admin";
//app launch
	  System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
      FirefoxDriver driver=new FirefoxDriver();
      driver.navigate().to("http://www.primusbank.qedgetech.com/");
      driver.manage().window().maximize();
      //app login
      driver.findElement(By.id("txtuId")).sendKeys("username");
      driver.findElement(By.name("txtPword")).sendKeys("password");
      driver.findElement(By.id("login")).sendKeys(Keys.ENTER);

	}

}
