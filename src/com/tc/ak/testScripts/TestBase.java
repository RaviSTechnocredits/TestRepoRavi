package com.tc.ak.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tc.ak.base.PredefinedActions;

public class TestBase {
	private WebDriver driver;

	/*
	 * public TestBase(){
	 * 
	 * } public TestBase(WebDriver driver) { this.driver = driver; }
	 */

	void start() {
		// Initialization init = new Initialization();
		driver = PredefinedActions.start();
	}

	void start(String url) {
		// Initialization init = new Initialization();
		driver = PredefinedActions.start(url);
	}

	void gotoRegistrationPage() {
		driver.findElement(By.id("registration2")).click();
	}

	void gotoDemoPage() {
		driver.findElement(By.id("registration2")).click();
	}

	void closeSession() {
		driver.close();
	}
}
