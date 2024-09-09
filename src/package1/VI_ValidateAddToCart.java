package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



interface addPro{
	public void addProMethod() throws InterruptedException;
}

 class VI_ValidateAddToCart  extends II_BaseClass implements addPro{
	
	@Override
	public void addProMethod() throws InterruptedException {
		super.launchBrowser();
   	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"); 
        driver.findElement(By.xpath("//input[@id='login-button']")).click();	
        List<WebElement> addProduct = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"));
        for (int i = 0; i <addProduct.size() ; i++) {
        	 addProduct.get(i).click();
		}	
	}
	
	
	public void addProduct() throws InterruptedException {
		super.launchBrowser();
   	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"); 
        driver.findElement(By.xpath("//input[@id='login-button']")).click();	
        List<WebElement> pName = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        List<WebElement> addProduct = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"));
        
        System.out.println("Click on add button and add product");
        for (int i = 0; i <addProduct.size() ; i++) {
        	 addProduct.get(i).click();
        	 String productName = pName.get(i).getText();
         	String productPrice = pPrice.get(i).getText();
             System.out.println(productName + " - " + productPrice);		
		}
        driver.quit();
	}
	
	
	public void removeProduct() throws InterruptedException {
		this.addProMethod();
	    List<WebElement> pName = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
	    List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		List<WebElement> removeButton = driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory ']"));	
		System.out.println("........................................................................................");
		System.out.println("click on Remove button and remove all added product from product page");
		for (int i = 0; i < removeButton.size(); i++) {
			String productName = pName.get(i).getText();
         	String productPrice = pPrice.get(i).getText();
            System.out.println(productName + " - " + productPrice);
            removeButton.get(i).click();		
		}
		driver.quit();	
	}
	
	
	
	public void removeProductFromCart() throws InterruptedException {
		this.addProMethod();	
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		List<WebElement> pName = driver.findElements(By.xpath("//div[@class='cart_item_label']/a/div"));
		List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='item_pricebar']/div"));
		List<WebElement> removeButton = driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
		
		System.out.println("........................................................................................");
		System.out.println("click on Remove button and remove all added product from inside cart");
		for (int i = 0; i < removeButton.size(); i++) {
			String productName = pName.get(i).getText();
			String productPrice = pPrice.get(i).getText();
			
			System.out.println(productName + " - " + productPrice);
			removeButton.get(i).click();	
		}
		
		driver.quit();
		
	}
	
	
	
	public void validateCartBadgeCount() throws InterruptedException {
		super.launchBrowser();
   	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"); 
        driver.findElement(By.xpath("//input[@id='login-button']")).click();	
        List<WebElement> pName = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        List<WebElement> addProduct = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"));
        
        System.out.println("Click on add button and add product");
        for (int i = 0; i <addProduct.size() ; i++) {
        	 addProduct.get(i).click();
        	 String productName = pName.get(i).getText();
         	String productPrice = pPrice.get(i).getText();
             System.out.println(productName + " - " + productPrice);		
		}
        Thread.sleep(3000);
        
      List<WebElement> noOfRemoveButton = driver.findElements(By.xpath(" //button[@class='btn btn_secondary btn_small btn_inventory '] "));
      int  proAdded =noOfRemoveButton.size();
      System.out.println("  ");
      System.out.println("No of product added on product page");
      System.out.println("No of Product added: " + proAdded ); 
      Thread.sleep(3000);
      
    
    // Cart Badge count
     WebElement cartbadgeCount = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
     String proCountOnCartBadge = cartbadgeCount.getText();
     int proCountOnCartBadgeInt = Integer.parseInt(proCountOnCartBadge);
     System.out.println("  ");
     System.out.println("No of badge count on cart icon as per added product on product page");
     System.out.println("No of  badge count on  cart: " +proCountOnCartBadge );
     Thread.sleep(3000);
     
   
   // click on cart icon
    driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
    Thread.sleep(3000);
    
  
  // product added inside cart
   List<WebElement> cartItemInsideCart = driver.findElements(By.xpath("//div[@class='cart_item']"));
   int noOfItemInsideCart = cartItemInsideCart.size(); 
   System.out.println("  ");
   System.out.println("No of product inside the cart as per the badge and product added on product page");
   System.out.println("No of Item Inside cart: " +noOfItemInsideCart);
   Thread.sleep(3000);
   
 
 
 List<WebElement> pName1 = driver.findElements(By.xpath("//div[@class='cart_item_label']/a/div"));
	List<WebElement> pPrice1 = driver.findElements(By.xpath("//div[@class='item_pricebar']/div"));
	System.out.println("  ");
	System.out.println("added Product name and price inside the cart");
	   for (int i = 0; i <pName1.size() ; i++) {
		String productName1 = pName1.get(i).getText();
		String productPrice1 = pPrice1.get(i).getText();
		System.out.println(productName1 + " - " + productPrice1);			
	}
	   
	   
	   if (proAdded==proCountOnCartBadgeInt && proCountOnCartBadgeInt==noOfItemInsideCart) {
		   System.out.println("  ");
		   System.out.println("product added and cart badge validation: "  +  proAdded + "  =  " + proCountOnCartBadgeInt + " = " + noOfItemInsideCart);
		
	} else {
		System.out.println("product not added");

	}
       driver.quit();
       
	}
	
	

}
