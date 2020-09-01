package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {

	public static void main(String[] args)
	{
	 System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	 FirefoxDriver driver=new FirefoxDriver();
	 driver.navigate().to("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("newmobiles");
	 driver.findElement(By.className("nav-input")).click();
	 //capture title of the page
	 System.out.println(driver.getTitle());
     //capture the url of the page
	 System.out.println(driver.getCurrentUrl());
	/* driver.navigate().back();*/
	}
}

