package com.selinum.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;



public class MultipleWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Mounika\\Selinum\\geckodriver.exe");
		FirefoxDriver  driver = new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String homepage = driver.getWindowHandle();
		System.out.println("homepage:"+homepage);

	// capturing all the windows/ids
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		for (String child : windows) {
			System.out.println(child);
		}
		
		
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());

		}
		
		
		// close one by one window
		for (String child : windows) {
			// giving focus to particular window
			driver.switchTo().window(child);
			// System.out.println(driver.getTitle());
			// driver.close();
			if (!driver.getTitle().equals("techmahindra")) {
				driver.close();
			}

		} 

	}

}
