package com.excelhandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {


	public static void main(String[] args) throws IOException{

		File f=new File("TestData.xlsx"); //we no need to give path if is "directly we can access by name" 
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("Writing excel data");
		FileOutputStream fos=new FileOutputStream(f); //for output ..to write data in the excel
		workbook.write(fos);
		fos.close();
		
				
	}

}
