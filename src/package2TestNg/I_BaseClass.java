package package2TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class I_BaseClass {
public static WebDriver driver;

/*
       @BeforeSuit
       @BeforeClass or @BeforeTest
       @BeforeMethod
       @Test
       @AfterMethod
       @AfterClass  or @AfterTest
       @AfterSuit
*/

                @BeforeMethod
                public void launchBrowse() {
                	driver=new ChromeDriver();
                	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
                	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                	driver.manage().window().maximize();
                	driver.navigate().to("https://www.saucedemo.com/");
                	
                }
                
                @AfterMethod
                public void closeBrowser() throws InterruptedException {
                	Thread.sleep(3000);
                	driver.quit();
                }
                

}
