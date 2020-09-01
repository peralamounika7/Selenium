package com.selinium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnaotationsTest 
{
	@Test 
	public void method1()
	{
		System.out.println("Method1 Executed");
	}
	@Test 
	public void method2()
	{
		System.out.println("Method2 Executed");
	}
@BeforeMethod	
public void beforemethod()
{
	System.out.println("BeforeMethod is Executed");
	
}
@AfterMethod
public void aftermethod()
{
	System.out.println("After method executed");
}
@AfterClass
public void beforeclass()
{
	System.out.println("Afterclass is Executed");
	
}
@BeforeSuite
public void beforesuite()
{
	System.out.println("Beforesuite is Executed");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("Aftersuite is Executed");
}
  }
