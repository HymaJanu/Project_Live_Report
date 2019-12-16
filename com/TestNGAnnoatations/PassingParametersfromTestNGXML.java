package com.TestNGAnnoatations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParametersfromTestNGXML {

	// @Parameters(value="browser")
	// or
	
	@Parameters({"firstname","lastname"})
	@Test()
	public void para(String firstname,String lastname)
	{
		//one way
//		System.out.println(firstname);
//		System.out.println(lastname);
		
		//or//
		
		//second way
		//live application input data passing through parameters from TestNG.xml
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url ="https://demo.nopcommerce.com/";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lastname);
	}
}
