package com.selinum.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Mounika\\Selinum.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/ul[1]/li[2]/a")).click();
	}
}
