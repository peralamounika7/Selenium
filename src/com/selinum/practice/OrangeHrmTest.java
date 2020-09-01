package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;

public class OrangeHrmTest {

	public static void main(String[] args)
	{
		  System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			driver.manage().window().maximize();
	/*	driver.findElement(By.className("cross-btn-ppm")).click();
       WebElement resc=	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div/div/div[2]/nav/ul/li[3]/a/strong"));
       WebElement prj=	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div/div/div[2]/nav/ul/li[3]/ul/li[2]/a/span"));
    //   driver.findElement(By.xpath("/html/body/section/div/div/section[4]/div/header/a/img"));
    Actions mouse=new Actions(driver);
    mouse.moveToElement(resc).perform();
    mouse.moveToElement(prj).click().perform();
     driver.findElement(By.xpath("/html/body/section/div/div/section[4]/div/header/a/img")).click();*/
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
			driver.findElement(By.id("btnLogin")).click();
		 WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		 
		 Actions mouse=new Actions(driver);
		 mouse.moveToElement(pim).click().perform();
		 driver.findElement(By.id("menu_pim_addEmployee")).click();
		 
		 
			
    
    
	}

}
