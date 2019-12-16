package com.TestNGFramework;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.genericmethods.GenericMethods;

public class TC_01 extends GenericMethods{
	
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
/*JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("argumements[0].click()", "diverobject");*/
		/*Actions obj=new Actions(driver);
		obj.moveToElement(le).build().perform();*/
	//sendKeys(Keys.ENTER);x	
		
		}
	
	@Test(testName="click on under $1,000.00 link",description="This test case will click on under $1,000.00 on desktop landing page",priority=4)
	public void clickonunderprice(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='PriceRange'])[1]")).click();
		System.out.println(" under $1,000.00 link clicked and lanuched underprice page successfully");
	}
	

	@Test(testName="Print item count",description="This test case will displays no of items avaliable under the price of $1,000.00")
	public void itemcount(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int count=driver.findElements(By.xpath(".//[@value='Add to cart']")).size();
		System.out.println("no. of .items avaliable under price $1,000.00 is displayed successfully"+count);
	}

}
