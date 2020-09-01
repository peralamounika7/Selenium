package com.selinum.practice;

import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ShaadiDropDownTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://www.shaadi.com/");
		 driver.manage().window().maximize();     
	}      
}