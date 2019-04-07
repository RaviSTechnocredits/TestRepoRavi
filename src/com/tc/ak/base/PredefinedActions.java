package com.tc.ak.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract public class PredefinedActions// extends Initialization
{

	/*
	 * WebElement getElement(){ return null; }
	 */
	private WebDriverWait wait = new WebDriverWait(driver, 30);
	protected String acceptAlert() {
		Alert alert = driver.switchTo().alert();
		//String expected = "Success!";
		String actual = alert.getText();
		alert.accept();
		return actual;
	}

	static public WebDriver driver = null;

	static public WebDriver start() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe"); driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://automationbykrishna.com/#");
		 */
		start("http://automationbykrishna.com/#"); // should come from property
													// file
		return driver;
	}

	static public WebDriver start(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	// critical one include this in practice code
	/*public void click(String locator){
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(getObject(locator)));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}*/
	
	public void enterText(String locator,String text){
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(getObject(locator)));
		element.sendKeys(text);
	}
	
	private By getObject(String locator){
		
		String locatorType=locator.split(":")[0].replace("[","").replace("]","").toUpperCase();
		String locatorValue=locator.split(":")[1];
		switch(locatorType)
		{
			case "ID" :
				return By.id(locatorValue);
			case "XPATH" :
				return By.id(locatorValue);
			case "CSS" :
				return By.id(locatorValue);
		}
		return null;
	}
	
	protected String getText(String locator){
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(getObject(locator)));
		WebElement element=getElement(locator);
		String text=element.getText();
		return text;
	}
	
	private WebElement getElement(String locator){
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(getObject(locator)));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		return element;
	}
	
}
