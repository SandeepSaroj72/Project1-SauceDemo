package package2TestNg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

 public class II_GetScreenShot extends I_BaseClass implements ITestListener{



	@Override
	public void onTestFailure(ITestResult result) {
	 String name = result.getName();
	   TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		
		
		File destinationFile= new File("./getScreenshot/"+name +".png");
		
		try {
			Files.copy(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ITestListener.super.onTestFailure(result);
	}

}
