package com.selinium.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BranchcreationTest extends PrimusBank
{
@Test
public void branchcreation() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
    driver.findElement(By.id("BtnNewBR")).click();
    driver.findElement(By.id("txtbName")).sendKeys("abcd123");
    driver.findElement(By.id("txtAdd1")).sendKeys("vvrnagar");
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
  
}
}
