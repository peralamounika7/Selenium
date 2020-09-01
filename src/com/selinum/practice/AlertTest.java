package com.selinum.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertTest {

	public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.navigate().to("https://www.hdfcbank.com/");
			driver.manage().window().maximize();	
			//html alert/popup
			driver.findElement(By.xpath("//*[@id=\"popupBoxClose\"]")).click();
		
		//handling java scriptalerts
		 /* System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	      FirefoxDriver driver1=new FirefoxDriver();*/
	      driver.navigate().to("http://www.primusbank.qedgetech.com/");
	      driver.manage().window().maximize();
	      //app login
	      driver.findElement(By.id("txtuId")).sendKeys("Admin");
	     // driver.findElement(By.name("txtPword")).sendKeys("Admin");
	      driver.findElement(By.id("login")).click();
	      Thread.sleep(2000);
	      Alert a1=driver.switchTo().alert();
	      System.out.println(a1.getText());
	      a1.accept();
	      a1.accept();//ok
	      a1.dismiss();//cancel
	      a1.getText();//capturing the text
	      a1.sendKeys("");//enter text
	      //branch creation
	   /*   driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	      driver.findElement(By.id("BtnNewBR")).click();
	      driver.findElement(By.id("txtZip")).sendKeys("55555");
	    Select country=new Select (driver.findElement(By.id("lst_counrtyU")));
	    country.selectByIndex(1);
	    Thread.sleep(3000);
	    Select state=new Select (driver.findElement(By.id("lst_stateI")));
	    state.selectByIndex(1);
	    Thread.sleep(3000);
	    Select city=new Select (driver.findElement(By.id("lst_cityI")));
	    city.selectByIndex(1);
	    Thread.sleep(3000);
	    driver.findElement(By.id("btn_insert")).click();
	    Thread.sleep(3000);
	    Alert a11=driver.switchTo().alert();
	    String msg=a11.getText();
	    a11.accept();
	    //validation
	    if(msg.contains("created sucessfully"))
	    {
	    	System.out.println("pass");
	    }else
	    	if(msg.contains("plese fill in"))
	    	{
	    		System.out.println("warning");
	    	}else
	    		if(msg.contains("alresdy exist"))
	    		{
	    			System.out.println("fail");
	    		}
	    }
	    		
	    
	    }*/
	      
	      
	      }
		
}


