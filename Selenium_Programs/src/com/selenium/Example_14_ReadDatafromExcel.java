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

public class Example_14_ReadDatafromExcel {
	static WebDriver driver;
	static FileInputStream fs;
	static Properties prop;
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	public static void main(String[] args) throws Exception {

		readData();
	}

	
	public static void readData() throws Exception {
	//	String excelPath = "G:\\SampadaSelenium\\OR\\TestData.xlsx";
		String excelpath = System.getProperty("user.dir")+ "//resources//TestData.xlsx";
		fs = new FileInputStream(excelpath);
	
	wb = new XSSFWorkbook(fs);
	sh = wb.getSheet("Sheet1");
	int rowCount = sh.getLastRowNum();
	System.out.println("Total rows are in excel"+ rowCount);
	//XSSFRow row1 = sh.getRow(4);
	//System.out.println(row1);
	System.out.println(sh.getLastRowNum());
	Iterator<Row> itr = sh.iterator();
	while (itr.hasNext()) {
		Row row = itr.next(); // return single row
		Iterator<Cell> columns = row.cellIterator();

		while (columns.hasNext()) {
			Cell cell = columns.next();
			switch (cell.getCellType()) {
			case STRING:
				System.out.print(cell.getStringCellValue()+"\t");
				break;
			case NUMERIC:
				System.out.print(cell.getNumericCellValue()+"\t");
				break;
			case FORMULA:
				System.out.print(cell.getCellFormula());
				break;
			default:
			}

		}
		System.out.println("\t");
	}

	}
}
