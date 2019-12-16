package com.excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {


		//get the excel path
		
		File f=new File("./TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Data");
		
		XSSFRow row=sheet.getRow(1);
		
		XSSFCell cell=row.getCell(4);
		
		
		switch (cell.getCellTypeEnum()) {
		case STRING:
			System.out.println(cell.getStringCellValue());
			break;
			
		case NUMERIC:
			System.out.println(Integer.valueOf((int) cell.getNumericCellValue()));
			break;

		default:
			break;
		}
		
		
		//get total number of rows
		
		System.out.println(sheet.getLastRowNum());
		
		//get total number of columns
		
		System.out.println(sheet.getRow(0).getLastCellNum());
		

	}

}
