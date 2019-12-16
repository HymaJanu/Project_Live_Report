package com.tasks;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;

		import com.genericmethods.GenericMethods;

		public class PrintTableHyperlinks{

			public static void main(String[] args) {
				GenericMethods genericmethod=new GenericMethods();
				String url="https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose";
				genericmethod.launchBrowser("chrome", url);
				
				String xpath="//th[text()='Company']/ancestor::table/tbody/child::tr";
				
				List<WebElement>total_rows=genericmethod.driver.findElements(By.xpath(xpath));
				System.out.println(total_rows.size());
				
				
				for(int r=1;r<=total_rows.size();r++)
				{
					String col=xpath+"["+r+"]/td";
					WebElement cellData=genericmethod.driver.findElement(By.xpath(col));
		     		System.out.println(cellData.getText());			
		     			cellData.click();
		     			//genericmethod.driver.findElement(By.xpath(col));
		     			System.out.println(genericmethod.driver.getCurrentUrl());
		     			
		     			genericmethod.driver.navigate().back();
		     			WebElement group=genericmethod.driver.findElement(By.xpath(xpath+"["+r+"]/td"));
		     			
		     			WebElement prevClose=genericmethod.driver.findElement(By.xpath(xpath+"["+r+"]/td"));
		     			
		     			WebElement currentPrice=genericmethod.driver.findElement(By.xpath(xpath+"["+r+"]/td"));
		     			
		     			WebElement change=genericmethod.driver.findElement(By.xpath(xpath+"["+r+"]/td"));
		     			
		     			
		     			System.out.println("Group :"+group.getText()
		     					+" "+ "Prev Close :"+prevClose.getText()
		     					+" "+  "Current Price :"+currentPrice.getText()
		     					+" "+ "% Change :"+change.getText()
		     					+ "");
	                 
		     			List<WebElement>total_cols=genericmethod.driver.findElements(By.xpath(col));
		    			
		    			for(int c=1;c<=total_cols.size();c++){
	    				
	    				String data=col+"["+c+"]";
	    				
	    				WebElement CellData=genericmethod.driver.findElement(By.xpath(data));
	    				System.out.println(CellData.getText());
	    				System.out.println("******");
	    				break;
                 }

  }
			
}
		}	