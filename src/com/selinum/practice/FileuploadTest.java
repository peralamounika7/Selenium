package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadTest {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		FirefoxDriver  driver = new FirefoxDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(4000);
		
		//emp creation
		System.out.println(" ============ Emp. Cretion =======================");
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
	    driver.findElement(By.id("firstName")).sendKeys("Mounika");
		driver.findElement(By.id("lastName")).sendKeys("Perala");
		//uploading a file
		System.out.println(" ============ Upload file =======================");
		
		driver.findElement(By.id("photofile")).sendKeys("D:\\Mounika\\Selinum\\waterfall.jpeg");
		//driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(4000);
		//Runtime.getRuntime().exec("C:\\Users\\Satya\\Desktop\\fileupload.exe");		
		//Thread.sleep(8000)
		
		//auto it
		//Runtime.getRuntime().exec("C:\\Users\\Satya\\Desktop\\fileupload.exe");
		driver.findElement(By.id("btnSave")).click();
		//validation
	if(driver.findElement(By.xpath("./html/body/div[1]/div[3]/div/div[1]/div/h1")).isDisplayed())
{
	System.out.println("pass");
	
}else
{
	System.out.println("Fail");
	
}
		
		

		

	}

}
