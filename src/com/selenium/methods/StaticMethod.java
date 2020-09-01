package com.selenium.methods;

public class StaticMethod 
{
//satic method with retuen type with parameters
	public static  int add(int i, int j)
	{
		int sum=i+j;
		return sum;
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int res=StaticMethod.add(20,40);
		System.out.println(res);
		

	}

}
