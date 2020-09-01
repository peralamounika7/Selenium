package com.selinium.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.org.apache.bcel.internal.classfile.Field;

public class ReadingTest {

	public static void main(String[] args) throws Exception
	{
		File srcFile=new File("C:\\Users\\Satya\\Desktop\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(srcFile);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("sheet1");
		//reading single set of data
	/*	String data=ws.getRow(0).getCell(0).getStringCellValue();
		String data1=ws.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data+"   "+data1);*/
		//reading mutiple set of data
		//row count
	     int rcnt= ws.getLastRowNum();
	     for (int i = 0; i <rcnt; i++)
	     {
	    	/* String data1a=ws.getRow(i).getCell(0).getStringCellValue();
	 		String data11=ws.getRow(i).getCell(1).getStringCellValue();*/
	    	 int data= Integer.parseInt(ws.getRow(i).getCell(1).getStringCellValue());
	 		//System.out.println(data11+"   "+data11);
	 		System.out.println(data);
	 	
		}
		
	}

}
