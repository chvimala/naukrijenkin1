package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123 {
	
	WebDriver driver =null;

	@Test
	public void testReg() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.com");		
		Thread.sleep(5000);
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("c:\\temp\\Screen.png");
		 FileUtils.copyFile(SrcFile, DestFile);
		
		

	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
