package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class ActionSelenium {
	
	public static void main(String[] args) {
		WebDriver driver=Init.start();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		
	}
	

}
