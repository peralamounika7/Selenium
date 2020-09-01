package com.selinium.testng;

import org.testng.annotations.Test;

public class MultipletestCases 
{
	@Test(priority=1)
	public void Applaunch()
	{
		System.out.println("Applaunch Executed");
	}
	@Test 
	public void AppLogin()
	{
		System.out.println("Applogin Executed");
		
	}
	@Test
	public void AppClose()
	{
		System.out.println("Appclose Executed");
		
	}
	
}
