package com.selinium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest
{

	public static void main(String[] args) throws IOException 
	{
		File srcFile=new File("C:\\Users\\Satya\\Desktop\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(srcFile);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("sheet1");
		ws.getRow(0).createCell(2).setCellValue("qedge123");
		ws.getRow(1).createCell(2).setCellValue("selenium9");
		FileOutputStream fos=new FileOutputStream(srcFile);
		wb.write(fos);
		wb.close();

	}

}
