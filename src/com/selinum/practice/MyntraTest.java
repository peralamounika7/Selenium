package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyntraTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click();
		}
}
