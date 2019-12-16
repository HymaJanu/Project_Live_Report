package com.Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import com.genericmethods.GenericMethods;


public class XpathPrintHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		String url="https://demo.nopcommerce.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		List<WebElement> headerlinks=driver.findElements(By.xpath("//div[@class='header-menu']/child::ul/li/a"));
		
		for(WebElement links:headerlinks)
		{
			//System.out.println(links);
			System.out.println(links.getAttribute("innerHTML"));

			//System.out.println(links.getAttribute("innertext"));


			//System.out.println(links.getAttribute("innertextcontent"));
		
			
			//System.out.println("*************************All header links****************************");
			
			/*List<WebElement>sublinksAppreal=driver.findElements(By.xpath("//a[text()='Apparel ']/parent::li/child::ul/li"));
			
		for(WebElement sublinks:sublinksAppreal)
		{
			System.out.println(sublinks.getAttribute("innerHTML"));

			System.out.println(sublinks.getAttribute("innertext"));


			System.out.println(sublinks.getAttribute("innertextcontent"));
			
			
			System.out.println("*************************sublinks of Appareal****************************");
			
			List<WebElement>Alllinks=driver.findElements(By.xpath("//div[@class='header-menu']/child::ul//li/child::ul/li/a"));



			for (WebElement sublinkselectrinics : Alllinks) {


			System.out.println(sublinkselectrinics.getAttribute("innerHTML"));

			System.out.println(sublinkselectrinics.getAttribute("innertext"));


			System.out.println(sublinkselectrinics.getAttribute("innertextcontent"));

			System.out.println("**********************sublinks of computers********************");
		}
		}

		}*/
	}
}


}