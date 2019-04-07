package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Init;

public class SelectMultiDropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver=Init.start();
		driver.get("http://automationbykrishna.com");
		driver.findElement(By.id("basicelements")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement e1=driver.findElement(By.xpath("//label[text()='Selects']]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Select oSelect=new Select(driver.findElement(By.xpath("//select[@class='form-control m-bot15']")));
		oSelect.selectByVisibleText("2");
		oSelect.selectByVisibleText("3");
	}
}
