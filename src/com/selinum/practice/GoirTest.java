package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoirTest 
{


	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");	
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.navigate().to("https://goir.ap.gov.in/");
		 driver.manage().window().maximize();
	   	WebElement drop=driver.findElement(By.id("DDLDeptname"));
        List<WebElement> dropList=drop.findElements(By.tagName("option"));
	        System.out.println(dropList.size());
	        for (int i = 0; i<dropList.size(); i++) 
	        {
	        	//capture all names
				System.out.println(dropList.get(i).getText());
	         //select  one item from dropdownlist
			if(dropList.get(i).getText().equals("ITC01 -INFORMATION TECHNOLOGY, ELECTRONICS AND COMMUNICATIONS"))
				{
				
				System.out.println("======== Clieckings");
					dropList.get(i).click();
				}
				//select particular item from dropdown
				//driver.findElement(By.id("DDLDeptname")).sendKeys("AGC01-AGRICULTERE AND COOPERATION");
			
				
			}
	        
	        
	        //After click
	        Thread.sleep(8000);

			//System.out.println(Element.getText()+" :is selected");
		//	}else
		//	System.out.println(Element.getText()+" :is not selected");
	   /*  WebElement GoSection=driver.findElement(By.id("DDLGoType"));
        List<WebElement> GoSectionList=GoSection.findElements(By.tagName("option"));
         for (WebElement SectionElement:GoSectionList )
         {
        	 
        	 SectionElement.click();  
         }
     	if (SectionElement.isSelected()) 
		 {
			System.out.println(SectionElement.getText()+" :is selected");
			}else
			System.out.println(SectionElement.getText()+" :is not selected");
	
	}
	     /*   for (WebElement Element:dropList )
	        		 {
				Element.click();
				//validation
				if(Element.isSelected())
				{
				System.out.println(Element.getText()+" :is selected");
				}else
				System.out.println(Element.getText()+" :is not selected");*/
	        
	        
		 WebElement GoType=driver.findElement(By.id("DDLGoType"));
	        List<WebElement> GoTypeList=GoType.findElements(By.tagName("option"));
	         for (WebElement typeElement:GoTypeList )
	         {
	        	 
	        	 typeElement.click();
					//validation
					if(typeElement.isSelected())
					{
					System.out.println(typeElement.getText()+" :is selected");
					}else
					System.out.println(typeElement.getText()+" :is not selected");
				WebElement GoCat=driver.findElement(By.id("DdlGo_cat"));
					List<WebElement> GoCatList=GoCat.findElements(By.tagName("option"));
					for (WebElement catElement : GoCatList) 
					{
						catElement.click();
						//validation
						if (catElement.isSelected()) 
						 {
							System.out.println(catElement.getText()+" :is selected");
							}else
							System.out.println(catElement.getText()+" :is not selected");
					
					}
						
	         }
	        		 }
	

	}

