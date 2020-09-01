package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("remember")).click();
		 if(driver.findElement(By.id("remember")).isSelected())
		 {
			 driver.findElement(By.id("remember")).click(); 
		 }
		 System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
	}
}
