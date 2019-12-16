package com.TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.genericmethods.GenericMethods;

public class TC_02 extends GenericMethods{
	
	@Test(testName="login",priority=1)
	public void beforemethod()
	{
		System.out.println("Lanuch application");
		String url="https://demo.nopcommerce.com/";
		launchBrowser("chrome",url);
	}
	@Test(testName="Click on Computer",description="This test case will over on computer dropdown",priority=2)
	public void computerdropdown(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("(//a[normalize-space(text())='Computers'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space(text())='Computers'])[1]")).click();
		System.out.println("hover on computer menu successfully");
	}
	
	@Test(testName="Click on desktop",description="This test case will select desktop option from computer dropdown list",priority=3)
	public void selctdesktop(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
	System.out.println("desktop option selected successfully");
		
		}
	
	@Test(testName="click on Digital Download",description="This test case will click on under $1,000.00 on desktop landing page",priority=4)
	public void clickonDigitalDownload(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='listbox']/ul/li[@class='inactive'])[3]")).click();
		System.out.println(" digital download link clicked and navigated digital landing page successfully");
	}
	

	/*@Test(testName="Print item count",description="This test case will displays no of items avaliable under the price of $1,000.00")
	public void itemcount(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int count=driver.findElements(By.xpath(".//[@value='Add to cart']")).size();
		System.out.println("no. of .items avaliable under price $1,000.00 is displayed successfully"+count);
	}*/

}