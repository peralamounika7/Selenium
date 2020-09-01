package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitStatementTest {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.navigate().to("http://gmail.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("identifierId")).sendKeys("peralamounika7");
			//driver.findElement(By.id("identifierNext")).click();
		//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
			

	}

}
