package com.excelhandling;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;

public interface XSSFWorkbook {
	


	File f=new File("C:\\Users\\Admin\\Desktop\\TestData"); //it is a folderpath
	/*if(f.exists())
	{
		System.out.println("Folder Exsits");
	}
	else
	{
		System.out.println("Folder doesnot Exsits");
	}*/

	XSSFCellStyle getCellStyle();
}

