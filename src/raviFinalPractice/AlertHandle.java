package raviFinalPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.Init;

public class AlertHandle {

	@Test
	public void alertHandle() {
		WebDriver driver = Init.start();
		String expected="Failed! please enter password";
		driver.get("http://automationbykrishna.com");
		driver.findElement(By.id("registration2")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnsubmitdetails")));
		driver.findElement(By.id("btnsubmitdetails")).click();
		Alert alert=driver.switchTo().alert();
		String actual=alert.getText();
		alert.accept();
		Assert.assertEquals(expected, actual);
	}
}