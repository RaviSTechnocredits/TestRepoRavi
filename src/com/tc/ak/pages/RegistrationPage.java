package com.tc.ak.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tc.ak.base.PredefinedActions;
import com.tc.ak.constant.ConstantPath;

import utility.PropertyFileOperation;

public class RegistrationPage extends PredefinedActions {
	/*
	 * WebDriver driver;
	 * 
	 * public RegistrationPage(WebDriver driver) { this.driver = driver; }
	 */
	private WebDriverWait w = new WebDriverWait(driver, 10);
	PropertyFileOperation propertyOperation;
	public RegistrationPage() {
		try {
			propertyOperation = new PropertyFileOperation(ConstantPath.REGISTRATIONPAGEPROPERTY);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public final void login(String uname, String pwd) {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "unameSignin")));
		 * driver.findElement(By.id("unameSignin")).sendKeys("krishna");
		 */
		enterTextOnRegistrationPage("username",uname);
		enterTextOnRegistrationPage("password",pwd);
		
		
		//enterUserName(username);
		//enterPssword(password);
		loginButtonClick();
		// driver.findElement(By.id("pwdSignin")).sendKeys("krishna@123");
		// driver.findElement(By.id("btnsubmitdetails")).click();
	}

	private void enterTextOnRegistrationPage(String key,String text){
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(propertyOperation.readData(key))));
		//enterText(element,text);
		enterText(propertyOperation.readData(key),text);
	}
	/*private void enterUserName(String username) {
		// WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("unameSignin")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(propertyOperation.readData("username"))));
		driver.findElement((By.id(propertyOperation.readData("username")))).sendKeys(username);
	}

	private void enterPssword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(propertyOperation.readData("password"))));
		driver.findElement((By.id(propertyOperation.readData("password")))).sendKeys(password);
	}*/

	private void loginButtonClick() {
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id(propertyOperation.readData("loginbutton"))));
		driver.findElement(By.id(propertyOperation.readData("loginbutton"))).click();
	}

	public String handleAlertOnRegistrationPage() {
		return acceptAlert();
	}
}
