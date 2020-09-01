package com.selinium.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest1 
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
	/*@BeforeTest
	public void beforetest()
	{
		System.out.println("Beforetest Executed");
	}
@AfterTest
public void afetrtest()
{
	System.out.println("Aftertest Executed");
}*/
}