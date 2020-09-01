package com.selinum.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowseTest {

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "D:\\Mounika\\Selinum\\chromedriver.exe");
			System.out.println("--");
			ChromeDriver ob = new ChromeDriver();
			ob.get("https://www.google.com/");

	}

}
