package com.selinium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class ParametarizationTest
{
@Test(dataProvider = "getData")
public void adminLogin(String username,String password)
{
	System.out.println("username is :"+username);
	System.out.println("password is : "+password);
	}
@DataProvider
public Object[][]  getData()
{ 
	Object [] [] data=new Object [1][2];
	data[0][0]="vasu";
	data[0][1]="Qedge";
	
	 return data;
	 
}
}
