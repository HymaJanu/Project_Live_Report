package com.TestNGFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.genericmethods.GenericMethods;

public class CommonAnnotation extends GenericMethods {
	
	@BeforeMethod
	
	public void beforemethod()
	{
		System.out.println("Lanuch application");
		String url="https://demo.nopcommerce.com/";
		launchBrowser("chrome",url);
	
	}
	
	
	/*@AfterMethod
	public void aftermethod()
	{
		//driver.close(); or use generic method
		closeBrowser();
		System.out.println("application closed successfully");
	}*/

	/*@BeforeSuite
	public void beforeSuite() throws IOException
	{
		ExcelParser excelparser=new ExcelParser();
		excelparser.loadExcelFile();
		ReadingPropertiesFiles properties=new ReadingPropertiesFiles();
		properties.loadPropertiesFile();
	}*/
	
}
