package package1;

import org.openqa.selenium.By;

class VII_CheckoutProduct extends VI_ValidateAddToCart {
	 
	 
	 public void checkoutProduct(String FName, String LName, String PCode) throws InterruptedException {
		 super.addProMethod();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='checkout']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(FName);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(LName);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(PCode);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
		 Thread.sleep(3000);
		 driver.close();
		 
	 }
	 
	 public void productCheckout() throws InterruptedException {
		 super.addProMethod();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='checkout']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Sandeep");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Saroj");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("401209");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='finish']")).click();
		 Thread.sleep(2000);
		 String text1 = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
		String text2 = driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
		
		System.out.println(text1 + " "+ " " + text2 );
		 
		 
		 driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		 Thread.sleep(3000);
		 
		 driver.close();
		 
	 }

}
