package com.selinum.practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSourceTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://google.co.in/");
		 driver.manage().window().maximize();
		 //capture pagesiurce
		 System.out.println(driver.getPageSource());
	}

}
