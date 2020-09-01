package com.selinum.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {

	public static void main(String[] args) throws Exception 
	{
		
		 System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();
	      driver.navigate().to("http://www.primusbank.qedgetech.com/");
	      driver.manage().window().maximize();
	      //admin login
	      driver.findElement(By.id("txtuId")).sendKeys("Admin");
	      driver.findElement(By.name("txtPword")).sendKeys("Admin");
	      driver.findElement(By.id("login")).click();
	     //branch creation
	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	      driver.findElement(By.id("BtnNewBR")).click();
	      driver.findElement(By.id("txtZip")).sendKeys("55555");
	    Select country=new Select (driver.findElement(By.id("lst_counrtyU")));
	    country.selectByIndex(1);
	    Select state=new Select (driver.findElement(By.id("lst_stateI")));
	    state.selectByIndex(1);
	    Select city=new Select (driver.findElement(By.id("lst_cityI")));
	    city.selectByIndex(1);
	    driver.findElement(By.id("btn_insert")).click();
	    
	    Thread.sleep(3000);
	    Alert a1=driver.switchTo().alert();
	    String msg=a1.getText();
	    
		a1.accept();
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
	    driver.findElement(By.xpath("/html/body/form/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
	    Thread.sleep(20000);
	    driver.findElement(By.xpath("/html/body/form/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[3]/a/img")).click();
	    driver.close();
	    }
	    		
}

