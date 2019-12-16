package com.excelhandling;

		import java.io.File;
		import java.io.FileOutputStream;
		import java.io.FileInputStream;
		import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
		import org.apache.poi.xssf.usermodel.XSSFRow;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	

		public class Task2 {
			
			public static void main(String[] args) throws IOException{

				
				File f=new File("TestData.xlsx"); 
				//note : name with extension as "name.xlsx"..we no need to give path if is "directly we can access by name" 
				XSSFWorkbook workbook = new XSSFWorkbook();
				//XSSFSheet sheet=workbook.createSheet("DataSheet"); //to mention datasheet name in the workbook
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				RowCopy obj=new RowCopy();
				
				//copyRow(workbook, sheet, 0, 1);
			    
				//create row 1 and then column values 
                XSSFRow row=sheet.createRow(2);
				XSSFCell c1=row.createCell(0);
				c1.setCellValue("TestCase");
				
				XSSFCell c2=row.createCell(1);
				c2.setCellValue("username");
				
				XSSFCell c3=row.createCell(2);
				c3.setCellValue("password");
				
				//create row 2 and then column values 
                XSSFRow r=sheet.createRow(1);
				
                XSSFCell rc1=r.createCell(0);
				
				rc1.setCellValue("Tc1");
				
				XSSFCell rc2=r.createCell(1);
				rc2.setCellValue("Hyma");
				
				XSSFCell rc3=r.createCell(2);
				rc3.setCellValue("hyma@123");
				
				
				//create row 3 and then column values 
                XSSFRow rr=sheet.createRow(2);
				
                XSSFCell rrc1=rr.createCell(0);
				
				rrc1.setCellValue("Tc2");
				
				XSSFCell rrc2=rr.createCell(1);
				rrc2.setCellValue("Janu");
				
				XSSFCell rrc3=rr.createCell(2);
				rrc3.setCellValue("janu@123");
								
				
				
				FileOutputStream FOS=new FileOutputStream(f);		
				workbook.write(FOS);
				FOS.close();
				
				
				

			}

		}


