package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitTest {

	public static void main(String[] args)
	{
	    System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();	
        driver.findElement(By.className("mTxt")).click();
	}

}
