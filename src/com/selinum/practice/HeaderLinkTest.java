package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HeaderLinkTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement header= driver.findElement(By.id("nav-xshop"));
	 List<WebElement> headerLinks=header.findElements(By.tagName("sript"));
	 System.out.println(headerLinks.size());
         /* List <WebElement>headerlinks= driver.findElement(By.xpath("//div[@id='nav-xshop']/a"));
           System.out.println(headerlinks.size());
           for ( WebElement element:headerlinks)
	
	
{
	System.out.println(element.getText());*/
}

	
}
	}



