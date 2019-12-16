package com.TestNGAnnoatations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	@org.testng.annotations.DataProvider(name = "data-provider2")
	public static Object[][] dataProviderMethod2() {
		return new Object[][] { { "Username", "Password" }, { "Username1", "Password1" },
				{ "Username2", "Password2" } };

	}

	@Test(dataProvider = "data-provider2")
	public void testMethod(String username, String password) {
		System.out.println("UserData is : " + username);
		System.out.println("PasswordData is: " + password);
		//or//
		//Live application example passing data through "data provider"
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url ="https://demo.nopcommerce.com/";
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(password);
	
	}

}
