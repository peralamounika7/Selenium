package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FlipkartTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span")).click();
		 List<WebElement> links=driver.findElements(By.tagName("a"));//collection of links
		 System.out.println(links.size());
		 for (int i=0;i<links.size();i++)
		 {
			 System.out.println(links.get(i).getText());
			 
		 }
		
		
	}

}
