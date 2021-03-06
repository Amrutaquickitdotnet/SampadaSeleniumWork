package com.selenium;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.Formula;
import org.openqa.selenium.WebDriver;

public class Example_16_ReadDataFromExcel_usingHSSF {
	static WebDriver driver;
	static FileInputStream fs;
	

	public static void main(String[] args) throws Exception {

		readData();
	}
// get single row or single columns from Excel sheet
	public static void readData() throws Exception {
		String excelPath = "G:\\SampadaSelenium\\ExcelSheet\\TestDataValue.xls";
		//String excelpath = System.getProperty("user.dir") + "//resources//Data.xls";
		fs = new FileInputStream(excelPath);
        HSSFWorkbook wb = new HSSFWorkbook(fs);
      HSSFSheet sh =  wb.getSheetAt(0);
      int totalRows =          sh.getLastRowNum(); // TotalRows
      
      for(int i =0; i<totalRows; i++) {
    	  HSSFRow row =  sh.getRow(i);
    	int totalcolumns =  row.getLastCellNum();
    	  for(int j=0; j<totalcolumns; j++) {
    	HSSFCell cell =	  row.getCell(j);
    	
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
		}
		
		}
    	  System.out.println(" ");
    	  }
      }
        
		
	}

