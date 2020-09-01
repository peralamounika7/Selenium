package com.selinum.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.navigate().to("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			//capturing frames count
List<WebElement> frames=driver.findElements(By.tagName("iframe"));
System.out.println(frames.size());
//give the control to the particular frame
//1.bades on index
driver.switchTo().frame(0);
//based on string
driver.switchTo().frame(driver.findElement(By.xpath("/html")));



/*WebElement drg=driver.findElement(By.id("draggable"));
WebElement drp=driver.findElement(By.id("droppable"));
Actions dAd=new Actions(driver);
dAd.dragAndDrop(drg,drp).perform();*/

	}

}
