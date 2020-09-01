package com.selenium.methods;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class Method2 
{
    public  int add(int a , int b)

    {
    	 a=30;
    	 b=20;
    	int sum=a+b; 
    	return sum;
    	
    }
	public static void main(String[] args) 
	{
	Method2 a=new Method2();
	a.add(10, 20);
	int res=a.add(10, 30);
	System.out.println(res);

	}

}
