package com.selinium.testng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest

{
@Test
public void validation()
{
	String data="selinium ";
	String data1="selinium mounika";
	//validation
	Assert.assertEquals(data,data1);
}
}
