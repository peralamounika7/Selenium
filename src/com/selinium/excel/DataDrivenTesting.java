package com.selinium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selinium.testng.PrimusBank;
import com.selinum.practice.PrimusBankAdminLogin;
import com.selinum.practice.PrimusBankTest;

public class DataDrivenTesting 
{

	private static int branchname;

	public static void main(String[] args) throws Exception
	{
		PrimusBank app=new PrimusBank();
		app.appLauch();
		app.appLogin();
		//brach creation with excel parametarization
		//reding the data from excel file
		File srcFile=new File("C:\\Users\\Satya\\Desktop\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(srcFile);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("sheet1");
		//row count
		 int rcnt= ws.getLastRowNum();
	     for (int i = 0; i <rcnt; i++)
	     {
	    	 String branch=ws.getRow(i).getCell(0).getStringCellValue();
	 		String add=ws.getRow(i).getCell(1).getStringCellValue();
	 		System.out.println(i+" :set of data"+": "+branchname+add);
	 		String results=app.branchcreation1(branchname,add);//call by ref
	 		ws.getRow(i).createCell(2).setCellValue(results);
	 		FileOutputStream fos=new FileOutputStream(srcFile);
			wb.write(fos);
	     }
			wb.close();
			app.appLogout();
			app.appClose();

		}
		

		
	}


