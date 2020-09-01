package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class MouneHoverTest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://ceoandhra.nic.in/ceoap_new/ceo/index.html");
		 driver.manage().window().maximize();
		// driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/ul/li[1]/a")).click();
	
WebElement pdf=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/nav/div/div[2]/ul/li[3]/a"));
Actions mouse=new Actions(driver);
mouse.moveToElement(pdf).perform();

	}
}