package ownPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import util.Init;

public class DoubleClickDemo {
	
	public static void main(String[] args) {
		WebDriver driver=Init.start();
		//System.setProperty("wedriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		driver.get("http://www.automationbykrishna.com");
		Actions act=new Actions(driver);
		driver.findElement(By.id("basicelements")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e1=driver.findElement(By.xpath("//a[text()='Double-click on me']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e1);
		act.doubleClick(e1).perform();
	}
}
