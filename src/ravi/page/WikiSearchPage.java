package ravi.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ravi.base.RaviPredefinedAction;

public class WikiSearchPage extends RaviPredefinedAction {
	static WebDriver driver;
	WebDriverWait wait;
	public WebDriver goToWikiSearchPage(){
		driver=driverInitToURL();
		return driver;
	}
	
	public void searchSRK(){
		driver.findElement(By.id("searchInput")).sendKeys("Shahrukh khan");
		wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));
		driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
	}
}
