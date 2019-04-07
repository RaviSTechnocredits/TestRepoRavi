package excelOparation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Init;

public class ClientExcelSheetModular {

	@Test(dataProvider = "loginData")
	public void m1(String userN, String passW, String result) {
		WebDriver driver = Init.start();

		driver.get("http://www.automationbykrishna.com");
		// driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Registration")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebDriverWait wait=new WebDriverWait(5,driver);
		driver.findElement(By.cssSelector("#unameSignin")).sendKeys(userN);
		driver.findElement(By.cssSelector("#pwdSignin")).sendKeys(passW);
		driver.findElement(By.cssSelector("#btnsubmitdetails")).click();
		Alert alert = driver.switchTo().alert();
		String actualResult = alert.getText();
		alert.accept();
		Assert.assertEquals(actualResult, result);
		/*
		  System.out.print(userN+"\t"+passW+"\t"+result); System.out.println();
		 */
		driver.close();
	}

	@DataProvider(name = "loginData")
	public String[][] loginDataProvider() throws IOException {
		ExcelSheetModular esm = new ExcelSheetModular("C:\\Users\\Ravi Sawarker\\Downloads\\TestData.xlsx");
		// String[][] data=esm.getRow(2, "Data");
		String[][] data = esm.getAllRows("Data");
		return data;
	}
}
