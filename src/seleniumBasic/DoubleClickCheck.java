package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Init;

public class DoubleClickCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Init.start();
		driver.get("http://automationbykrishna.com");
		Thread.sleep(2000);
		driver.findElement(By.id("basicelements")).click();
		Actions act=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//a[text()='Double-click on me']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e1);
		Thread.sleep(2000);
		act.doubleClick(e1).perform();
		
	}
}
