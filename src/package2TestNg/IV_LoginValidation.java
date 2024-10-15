package package2TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(II_GetScreenShot.class)
public  class IV_LoginValidation extends I_BaseClass{

	@DataProvider
	
	@Test(priority = 2, enabled = false)
	public void validLogin1() {
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys();
        driver.findElement(By.xpath("//input[@id='login-button']")).click();	
	}
}
