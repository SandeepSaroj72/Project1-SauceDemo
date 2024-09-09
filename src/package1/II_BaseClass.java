package package1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class II_BaseClass {
 public  WebDriver driver;

    public  void launchBrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.saucedemo.com/");
	Thread.sleep(3000);
}

}
