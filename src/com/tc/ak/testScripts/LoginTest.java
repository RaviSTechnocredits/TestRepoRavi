package com.tc.ak.testScripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.tc.ak.constant.ConstantPath;
import com.tc.ak.pages.RegistrationPage;
import utility.ExcelFileOperation;

public class LoginTest extends TestBase {

	@Test(dataProvider = "loginDataProvider")
	public final void login(String uname,String pwd,String expected) throws IOException {

		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.get("http://automationbykrishna.com/#");
		 */

		/*
		 * Initialization init = new Initialization(); WebDriver driver =
		 * init.start();
		 */
		start();

		// driver.findElement(By.id("registration2")).click();
		// TestBase testbase = new TestBase(driver);
		// testbase.gotoRegistrationPage();
		gotoRegistrationPage();
		System.out.println("Browser open");

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "unameSignin")));
		 * driver.findElement(By.id("unameSignin")).sendKeys("krishna");
		 * driver.findElement(By.id("pwdSignin")).sendKeys("krishna@123");
		 * driver.findElement(By.id("btnsubmitdetails")).click();
		 */

		RegistrationPage registrationPage = new RegistrationPage();
		//registrationPage.login("krishna", "krishna@123");
		registrationPage.login(uname,pwd);
		String actual = registrationPage.handleAlertOnRegistrationPage();
		//String expected = "Success!";
		closeSession();
		Assert.assertEquals(actual, expected, "Actual expected not matching");
		System.out.println("completed successfully");

		/*
		 * Alert alert = driver.switchTo().alert(); String expected =
		 * "Success!"; String actual = alert.getText(); alert.accept();
		 * driver.close(); Assert.assertEquals(actual, expected,
		 * "Actual expected not matching");
		 */
	}

	@DataProvider(name = "loginDataProvider")
	public Object[][] loginDataProvider() {
		ExcelFileOperation efo;
		try {
			efo = new ExcelFileOperation(ConstantPath.REGISTRATIONEXCELDATA);
			Object[][] data = efo.readData(ConstantPath.LOGINDATASHEET);
			return data;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not found on given location");
		}
		return null;
	}
}
