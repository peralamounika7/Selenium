package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShadiDropDownTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://www.shadi.com");
		 driver.manage().window().maximize();     

     WebElement  Religion=driver.findElement(By.id("ddlReligion"));
     List<WebElement> Religionlist=Religion.findElements(By.tagName("option"));
     for (WebElement Element : Religionlist) 
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

}
