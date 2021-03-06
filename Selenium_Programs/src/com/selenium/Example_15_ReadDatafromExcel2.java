package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Example_15_ReadDatafromExcel2 {
	static WebDriver driver;
	static FileInputStream fs;
	static Properties prop;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public static void main(String[] args) throws Exception {

		readData();
	}
// get single row or single columns from Excel sheet
	public static void readData() throws Exception {
		// String excelPath = "G:\\SampadaSelenium\\OR\\TestData.xlsx";
		String excelpath = System.getProperty("user.dir") + "//resources//TestData.xlsx";
		fs = new FileInputStream(excelpath);

		wb = new XSSFWorkbook(fs);
		sh = wb.getSheet("Sheet1");
		Row row =sh.getRow(0);	
	
		
	Cell column =	row.getCell(0);
	System.out.println(row+"\t"+column);
	String columnVal =column.getStringCellValue();
	System.out.print(columnVal);
	
	Row row1 =sh.getRow(1);
	Cell column1 =	row1.getCell(1);
	System.out.print(row1+"\t"+column1);
	
	Row row2 =sh.getRow(2);
	Cell column2 =	row2.getCell(2);
	System.out.print(row2+"\t"+column2);

	}
}
