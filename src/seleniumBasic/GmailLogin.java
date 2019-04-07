package seleniumBasic;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;
import util.PropFileOperation;

public class GmailLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = Init.start();
		Properties prop = PropFileOperation.loadPropData();
		driver.get("https://www.gmail.com");
		System.out.println("Browser open");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys(prop.getProperty("username"));
		System.out.println("user name provided");
		driver.findElement(By.id("identifierNext")).click();
		System.out.println("Moved to password window after clicking next");
		Thread.sleep(3000); //this is to avoid no such element exception
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		System.out.println("Password provided");
		driver.findElement(By.id("passwordNext")).click();
		System.out.println("Connected to gmail successfully");
		driver.close();
		System.out.println("Browser closed");
	}
}
