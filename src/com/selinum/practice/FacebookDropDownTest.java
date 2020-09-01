package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookDropDownTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://www.facebook.com/");
		 driver.manage().window().maximize();
		
		   WebElement  birthday_day=driver.findElement(By.name("birthday_day"));
	       List<WebElement> birthday_daylist=birthday_day.findElements(By.tagName("option"));
	       for (WebElement Element : birthday_daylist) 
	       {
			Element.click();
			//validation
			if(Element.isSelected())
			{
			System.out.println(Element.getText()+" :is selected");
			}else
			System.out.println(Element.getText()+" :is not selected");
			}
	}
}
	       
	       
	     /*  WebElement birthday_month=driver.findElement(By.name("birthday_month"));
	       List<WebElement> birthday_month_list=birthday_month.findElements(By.tagName("option"));
	       for (WebElement Element : birthday_month_list) 
	       {
			Element.click();
			//validation
			if(Element.isSelected())
			{
			System.out.println(Element.getText()+" :is selected");
			}else
			System.out.println(Element.getText()+" :is not selected");
			}
	   
       
	       
	       
	       WebElement birthday_year=driver.findElement(By.name("birthday_year"));
	       List<WebElement> birthday_yr_list=birthday_year.findElements(By.tagName("option"));
	       for (WebElement Element : birthday_yr_list) 
	       {
			Element.click();
			//validation
			if(Element.isSelected())
			{
			System.out.println(Element.getText()+" :is selected");
			}else
			System.out.println(Element.getText()+" :is not selected");
			}*/
	       
	       
	  
       
       
       
       
	
	
	


