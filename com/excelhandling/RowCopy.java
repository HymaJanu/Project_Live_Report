package com.excelhandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

public class RowCopy {

	public static void main(String[] args) throws Exception{
	    HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("c://input.xls"));
	    HSSFSheet sheet = workbook.getSheet("Sheet1");
	    Result obj=new Result();
	   // obj.copyRow(sheet, sheet, 0, 3);
	    //copyRow(workbook, sheet, 0, 1);
	    FileOutputStream out = new FileOutputStream("c://output.xls");
	    workbook.write(out);
	    out.close();
}
}
