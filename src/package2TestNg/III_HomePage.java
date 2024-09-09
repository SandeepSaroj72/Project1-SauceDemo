package package2TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(II_GetScreenShot.class)
public class III_HomePage extends I_BaseClass {
	
	@Test(priority = 1)
	public void webPageTitle() {
		String title = driver.getTitle();
		Reporter.log("Web Page Title: " +  title , true);	
	}
	
	
	@Test(priority = 2)
	public void logoDisplay() {
		boolean logo=driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
		if (logo==true) {
			Reporter.log("Web Page Logo Displayed: " , true);	
			
		} else {
			Reporter.log("Web Page Logo Not Displayed: ", true);	

		}	
		
	}
	
	
	@Test(priority = 3)
	public void usernameTextfield() {
    boolean usernameTextfield=driver.findElement(By.id("user-name")).isDisplayed();
		
		if (usernameTextfield==true) {
			Reporter.log("username textfield is displayed", true);
			
			
		} else {
			Reporter.log("username textfield is not displayed", true);

		}	
	}
	
	
	
	@Test(priority = 4)
	    public void passwordTextfield() {
		boolean passwordTextfield=driver.findElement(By.name("password")).isDisplayed();
		if (passwordTextfield==true) {
			Reporter.log("password textfield is displayed", true);
			
		} else {
			Reporter.log("password textfield is displayed", true);

		}	
	}
	
	
	@Test(priority = 5)
    public void loginButton() {
    boolean loginButton=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		
		if (loginButton==true) {
			Reporter.log("login button is enabled", true);
			
		} else {
			Reporter.log("login button is disabled", true);

		}
}
	
	
	
	@Test(priority = 6)
	public void allValidUsernames() {
		WebElement validUsernames = driver.findElement(By.xpath("(//div[@id='login_credentials'])[1]"));
		WebElement validPassword = driver.findElement(By.xpath("//div[@class='login_password']"));
		
		String obj1 = validUsernames.getText();             // Get the text from the element	
		String pwsobj1 = validPassword.getText();       
        Reporter.log(obj1, true);
        Reporter.log(pwsobj1, true);
   
	}
	
	
	
	
	
	
}
