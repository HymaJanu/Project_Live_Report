package com.browserlaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		
		//lunch browser
		
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait implicitly
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//String url="https://demo.nopcommerce.com/";
		
		//launch the site url in web broswer
		driver.get("https://demo.nopcommerce.com/");
		
		//click on the register link
		driver.findElement(By.linkText("Register")).click();
		
		//click on male 
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Rajkumar");		
        driver.findElement(By.id("LastName")).sendKeys("Juvvala");	
        driver.findElement(By.id("Email")).sendKeys("varamy@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Accenture");
        driver.findElement(By.id("Newsletter")).click();
        //driver.findElement(By.id("Password")).sendKeys("raj@123");	
        driver.findElement(By.id("ConfirmPassword")).sendKeys("raj@123");	
        driver.findElement(By.id("register-button")).click();
        //driver.findElement(By.className("button-1 register-continue-button")).click();
        driver.findElement(By.linkText("Continue")).click();
        
       
		
		

		
		
}

}
