package practice.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract public class PreDefinedActionPractice {
	protected static WebDriver driver;
	protected void initializingBrowser(){
		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wikipedia.org/");
	}
	
	protected void setText(String element, String value){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id(element)).sendKeys(value);
	}
	
	protected void click(String element){
		getElement(element).click();
		//driver.findElement(By.xpath(element)).click();
	}
	
	protected String splitString(String element, String regExp, int index){
		String[] splitedValue=element.split(regExp);
		return splitedValue[index];	
	}
	
	protected WebElement getElement(String element){
		String locatorType=splitString(element,"]: ",0).substring(1).toUpperCase();
		String locatorValue=splitString(element,"]: ",1);
		WebDriverWait wait=new WebDriverWait(driver,10);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement ele=null;
		
		switch(locatorType){
			case "XPATH":
				ele=driver.findElement(By.xpath(locatorValue));
			case "ID":
				ele=driver.findElement(By.id(locatorValue));
				}
		jse.executeScript("arguments[0].style.border='red solid 3px'", ele);
		return ele;
		}
	
		protected void closeDriver(){
		driver.close();
		}
		
		public static File captureScreenshot() throws IOException{
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
			File destFile=new File(".//src//practice.testoutput//screenshots");
			FileUtils.copyFile(srcFile, destFile);
			return destFile;
		}
}
