package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://www.shaadi.com/");
		 driver.manage().window().maximize();	
         WebElement religion=driver.findElement(By.className("Dropdown-placeholder is-selected"));
        List<WebElement> religionlist=religion.findElements(By.tagName("div"));
         for (WebElement Element:religionlist )
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
	


