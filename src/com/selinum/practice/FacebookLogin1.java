package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin1 {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
	 FirefoxDriver driver=new FirefoxDriver();
	 driver.navigate().to("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys("peralamounika7@gmail.com");
     driver.findElement(By.id("pass")).sendKeys("sweetmunna");
     driver.findElement(By.id("u_0_b")).click();
	}
}



