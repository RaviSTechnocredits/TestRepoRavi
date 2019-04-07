package ravi.testScripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.Init;

public class ScreenShotDemo {
	
	
	public String getTimeStamp() {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("ddMMyyyyhhmmss");
		//Date date=new Date();
		String timeStamp=simpleDateFormat.format(new Date());
		//System.out.println(timeStamp);
		return timeStamp;
	}
	
	@Test
	public void demoScreenShot() throws InterruptedException, IOException{
		WebDriver driver=Init.start();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		System.out.println("Google page");
		getScreenShot(driver,"demoSnapShot");
		/*TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File(".//snapShots//demoSnapShot.png"));*/
		driver.close();
	}
	
	
		void getScreenShot(WebDriver driver,String fileName) throws IOException{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File(".//snapShots//"+fileName+"_"+getTimeStamp()+".png"));
	}
}
