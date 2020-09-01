package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoirTest1 
{
public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
			 FirefoxDriver driver=new FirefoxDriver();
			 driver.navigate().to("https://goir.ap.gov.in/");
			 driver.manage().window().maximize();
			 	WebElement dept=driver.findElement(By.id("DDLDeptname"));
		        List<WebElement> deptList=dept.findElements(By.tagName("option"));
			        System.out.println(deptList.size());
			        for (int i = 0; i<deptList.size(); i++) 
			        {
			        	//capture all names
						System.out.println(deptList.get(i).getText());
			          //select one by one item from dropdownlist
					if(deptList.get(i).getText().equals("ITC01 -INFORMATION TECHNOLOGY, ELECTRONICS AND COMMUNICATIONS"))
						{
						
						 System.out.println("======== Clieckings");
							deptList.get(i).click();
						}
				}
			        
			        WebElement Section=driver.findElement(By.id("sectddl"));
			        List<WebElement> SectionList=dept.findElements(By.tagName("option"));
				        System.out.println(SectionList.size());
				        for (int i = 0; i<SectionList.size(); i++) 
				        {
				        	//capture all names
							System.out.println(SectionList.get(i).getText());
				        }
			     
				   
		}
}