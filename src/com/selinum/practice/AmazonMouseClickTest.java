package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseClickTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
WebElement sign=driver.findElement(By.id("nav-link-accountList"));
WebElement ywl=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[3]/div[2]/div/div[3]/a[3]/span"));
Actions action=new Actions(driver);
action.moveToElement(sign).moveToElement(ywl).click().perform();

	}

}
