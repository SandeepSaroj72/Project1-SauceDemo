package package1;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


class IV_LoginValidation extends II_BaseClass{
	
	
	
	          public void validCredential(String username, String password) throws InterruptedException {
		      super.launchBrowser();
		
             driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
             driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
             driver.findElement(By.xpath("//input[@id='login-button']")).click();	
             Thread.sleep(3000);
             
             
             try {
            	  
            	 WebElement productPage = driver.findElement(By.xpath("//span[text()='Products']"));
            	 if (productPage.isDisplayed()){
      				System.out.println("Login successful for user: " +  username + " and  password " + password);	
      			   }
				
		        	} catch (NoSuchElementException e) {
				
				 WebElement errorMessage = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out')]"));
				  if (errorMessage.isDisplayed()) {
						 System.out.println("Login failed for user: " +  username  + " and password: " +  password  + " . Error:  " +  errorMessage.getText());
					 		
						}
				        } catch (Exception e) {
					       System.out.println("Unexpected error occurred for user: " + username + " and Password " + password);
					
				       }  finally {
            	          driver.quit(); 
			   }	              
	     }
	          
	          
	          
	        
	             public void invalidCredential(String username, String password) throws InterruptedException { 
	        	  super.launchBrowser();
	      		
	              driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	              driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	              driver.findElement(By.xpath("//input[@id='login-button']")).click();	
	              Thread.sleep(3000);
	              
	              WebElement errorMessage = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
	              if (errorMessage.isDisplayed()) {
	            	  System.out.println("Login failed for user: " +  username  +  "  and password: " +  password  +  "  . Error:  "  +  errorMessage.getText());
					
				} else {
					System.out.println("Login successful for user: " +  username  + "  and password:  " +  password  + "  . Error:  "  +  errorMessage.getText());

				}
	              
	              driver.quit();
	          }
	         	          
}
