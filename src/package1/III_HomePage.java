package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class III_HomePage extends II_BaseClass{
	 
	
	public  void getPageTitle() throws InterruptedException {
		super.launchBrowser();
		String title = driver.getTitle();
		System.out.println("Title of webage: " + title);
		Thread.sleep(3000);
		driver.quit();		
	}
	

	
	
	public void logoDisplay() throws InterruptedException {
		super.launchBrowser();
		boolean logo=driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
			
		if (logo==true) {
			System.out.println("website logo is displayed");
			
		} else {
			System.out.println("website logo is  not displayed");

		}	
		driver.quit();
	}
	
	
	
	public void usernameTextfield() throws InterruptedException {
		super.launchBrowser();
		boolean usernameTextfield=driver.findElement(By.id("user-name")).isDisplayed();
		
		if (usernameTextfield==true) {
			System.out.println("username textfield is displayed");
			
		} else {
			System.out.println("username textfield is  not displayed");

		}	
		driver.quit();
		
	}
	
	
	
	public void passwordTextfield() throws InterruptedException {
		super.launchBrowser();
		
		boolean passwordTextfield=driver.findElement(By.name("password")).isDisplayed();
		if (passwordTextfield==true) {
			System.out.println("password textfield is displayed");
			
		} else {
			System.out.println("upassword textfieldis  not displayed");

		}	
		driver.quit();
		
	}
	
	
	public void loginButton() throws InterruptedException{
		super.launchBrowser();
		
		boolean loginButton=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		
		if (loginButton==true) {
			System.out.println("login button is enabled");
			
		} else {
			System.out.println("login button is disabled");

		}
		driver.quit();
		
	}
	
	
	
	
	public void allValidUsernames() throws InterruptedException {
		
		// Launch the browser and open the webpage
		super.launchBrowser();
		
		// Locate the element containing the valid credentials
		WebElement validUsernames = driver.findElement(By.xpath("(//div[@id='login_credentials'])[1]"));
		WebElement validPassword = driver.findElement(By.xpath("//div[@class='login_password']"));
		
		
		String obj1 = validUsernames.getText();             // Get the text from the element	
		String pwsobj1 = validPassword.getText();
		
        String[] arrayObj = obj1.split("\\r?\\n");              // Split the text by line breaks 
        String[] arrayObj2=pwsobj1.split("\\r?\\n");
        
        String obj2 = arrayObj[0];                                 // The first element contains the header "Accepted usernames are:"
        String pwsobj2 = arrayObj2[0];
        
        
     
        ArrayList<String> arrayListObj = new ArrayList<String>();    // Create an ArrayList and add all credentials except the first line to it
      
        for (int i = 1; i < arrayObj.length; i++) {                                 // Start from 1 to skip the header
        	arrayListObj.add(arrayObj[i]);		
		}
        
        
        ArrayList<String> arrayListObj2 = new ArrayList<String>();
        for (int i = 1; i < arrayObj2.length; i++) {
        	 arrayListObj2.add(arrayObj2[i]);
			
		}
        
        System.out.println("List of Valid Login Credentials:");           
        System.out.println(obj2);                                                         // Print the header separately
        System.out.println(arrayListObj);                                            // Print the ArrayList
        
        System.out.println();
        System.out.println(pwsobj2);
        System.out.println(arrayListObj2);
         
		driver.quit();
		
	}
	
	

}
