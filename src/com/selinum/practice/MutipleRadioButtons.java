package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MutipleRadioButtons
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("http://www.echoecho.com/htmlforms10.htm");
		 driver.manage().window().maximize();
   WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	  List<WebElement> radiobuttonList=table.findElements(By.tagName("input"));
	  System.out.println(radiobuttonList.size());
	  for (int i = 0; i <radiobuttonList.size() ; i++) 
	  {
		  radiobuttonList.get(i).click();	
	  
	
	}
	
	}
}
