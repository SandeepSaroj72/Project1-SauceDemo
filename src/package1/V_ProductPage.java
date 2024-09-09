package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

 class V_ProductPage extends II_BaseClass {



           public void productFilter(String value) throws InterruptedException {
              super.launchBrowser();
        	 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"); 
	         driver.findElement(By.xpath("//input[@id='login-button']")).click();	
            WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
            Select pfilter = new Select(filter);
            pfilter.selectByValue(value);  
            
            List<WebElement> pName = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
            List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
            System.out.println("Product --------------------------------------------------------------------------------------");  
            System.out.println("       ");
            for (int i = 0; i < pName.size(); i++) {
            	String productName = pName.get(i).getText();
            	String productPrice = pPrice.get(i).getText();
                System.out.println(productName + " - " + productPrice);		
			}  
            driver.quit();
           
           }          
}
