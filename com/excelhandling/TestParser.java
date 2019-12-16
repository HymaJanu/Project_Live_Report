package com.excelhandling;

import java.io.IOException;

public class TestParser {

public static void main(String[] args) throws IOException {
	
		
		ExcelParser parser=new ExcelParser();
		
		parser.loadExcelFile();
		
		String month=parser.getData("Data", "Tc_03", "Month");
		String confirmPassword=parser.getData("Data", "Tc_03", "ConfirmPassword");
		System.out.println(confirmPassword);
		
	}

}
