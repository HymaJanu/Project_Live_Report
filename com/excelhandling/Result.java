package com.excelhandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Result {

	private static void copyRow(XSSFWorkbook workbook, XSSFSheet worksheet, int sourceRowNum, int destinationRowNum) {
	    // Get the source / new row
	    XSSFRow newRow = worksheet.getRow(destinationRowNum);
	    XSSFRow sourceRow = worksheet.getRow(sourceRowNum);

	    // If the row exist in destination, push down all rows by 1 else create a new row
	    if (newRow != null) {
	        worksheet.shiftRows(destinationRowNum, worksheet.getLastRowNum(), 1);
	    } else {
	        newRow = worksheet.createRow(destinationRowNum);
	    }

	    // Loop through source columns to add to new row
	    
	    for (int i = 0; i < sourceRow.getLastCellNum(); i++) {
	        // Grab a copy of the old/new cell
	        XSSFCell oldCell = sourceRow.getCell(i);
	        XSSFCell newCell = newRow.createCell(i);

	        // If the old cell is null jump to next cell
	        if (oldCell == null) {
	            newCell = null;
	            continue;
	        }

	        // Copy style from old cell and apply to new cell
	        XSSFCellStyle newCellStyle = workbook.getCellStyle();
	        newCellStyle.cloneStyleFrom(oldCell.getCellStyle());
	        newCell.setCellStyle(newCellStyle);

	        // If there is a cell comment, copy
	        if (oldCell.getCellComment() != null) {
	            newCell.setCellComment(oldCell.getCellComment());
	        }

	        // If there is a cell hyperlink, copy
	        if (oldCell.getHyperlink() != null) {
	            newCell.setHyperlink(oldCell.getHyperlink());
	        }

	        // Set the cell data type
	        newCell.setCellType(oldCell.getCellType());

	        Object Cell;
			// Set the cell data value
	        switch (oldCell.getCellType()) {
	        case BLANK:
	                newCell.setCellValue(oldCell.getStringCellValue());
	                break;
	            case BOOLEAN:
	                newCell.setCellValue(oldCell.getBooleanCellValue());
	                break;
	            case ERROR:
	                newCell.setCellErrorValue(oldCell.getErrorCellValue());
	                break;
	            case FORMULA:
	                newCell.setCellFormula(oldCell.getCellFormula());
	                break;
	            case NUMERIC:
	                newCell.setCellValue(oldCell.getNumericCellValue());
	                break;
	            case STRING:
	                newCell.setCellValue(oldCell.getRichStringCellValue());
	                break;
	        }
	    }
	}

	                public static void main(String[] args) throws Exception{
	            	    HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("c://input.xls"));
	            	    HSSFSheet sheet = workbook.getSheet("Sheet1");
	            	    Result obj=new Result();
	            	    //obj.copyRow(workbook, sheet, oldRow(1), 1);
	            	    //obj.copyRow(workbook, sheet, sourceRowNum(oldCell), destinationRowNum(newCell));
	            	    //copyRow(workbook, sheet, 0, 1);
	            	    FileOutputStream out = new FileOutputStream("c://output.xls");
	            	    workbook.write(out);
	            	    out.close();
	            	    
	        
	    }

}



	


