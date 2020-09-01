package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusBankTest
{
public static void main (String[] args)
{
	System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtuId")).sendKeys("vasu");
}

public void appLaunch(String string) {
	// TODO Auto-generated method stub
	
}

public String branchcreation1(int branchname, String add) {
	// TODO Auto-generated method stub
	return null;
}
}
