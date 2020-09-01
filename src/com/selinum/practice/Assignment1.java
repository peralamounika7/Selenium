package com.selinum.practice;


import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment1 {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("25");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jan");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1990");
		
	}
		 
	}


