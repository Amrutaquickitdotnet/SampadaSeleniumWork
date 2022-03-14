package com.keywordEngine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.TestBase.TestBase;

public class KeywordEngine {

	public FileInputStream fs=null;
	public XSSFSheet sh;
	public XSSFWorkbook wb;

	public void ReadData() {
		
		String path = "G:\\SampadaSelenium\\KeywordDrivenFramework\\src\\test\\resources\\Data.xlsx";
		try {
			fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		try {
			wb = new XSSFWorkbook(fs);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			WorkbookFactory.create(fs);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sh = wb.getSheet("Sheet1");
		com.TestBase.TestBase base = new TestBase();

		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			String testSteps = sh.getRow(i).getCell(0).toString().trim();
			String locatorType = sh.getRow(i).getCell(1).toString().trim();
			String selector = sh.getRow(i).getCell(2).toString().trim();
			String action = sh.getRow(i).getCell(3).toString().trim();
			String value = sh.getRow(i).getCell(4).toString().trim();

			System.out.println(testSteps + " : " + locatorType + " : " + selector + " : " + action + " : " + value);

			base.execute(testSteps, locatorType, selector, action, value);

		}
	}

}
