package com.selinum.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;




public class ScreenShortsTest
{
public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	FirefoxDriver  driver = new FirefoxDriver();
	driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	driver.manage().window().maximize();
	TakesScreenshot  ts=(TakesScreenshot)driver;
 File srcFile=ts.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcFile, new File("C:\\Users\\Satya\\Desktop\\screenshots.mouni.png"));
 
 

}
}