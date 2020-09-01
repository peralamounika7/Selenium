package com.selinium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PrimusBank {
	FirefoxDriver driver;

	@BeforeSuite
	public void appLauch() {
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
	}
//validation

	@BeforeTest
	public void appLogin() {
		System.out.println("Driver :  ::::: " + driver);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);

	}

//applogout
	@AfterTest
	public void appLogout() {
		driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")).click();

	}

	@AfterSuite
	public void appClose() {
		driver.close();
	}
}