package seleniumBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Initialize;

public class LoginGmail {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = Initialize.start();
		File file = new File(".//logindetails.properties");
		FileInputStream input = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(input);
		/*String username=prop.getProperty("username");
		String pwd=prop.getProperty("password");
		System.out.println(username +" : "+pwd);*/
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		System.out.println("Browser Open");
		driver.findElement(By.id("identifierId")).sendKeys(prop.getProperty("username"));
		System.out.println("User name provided");
		driver.findElement(By.id("identifierNext")).click();
		System.out.println("Next button clicked");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		System.out.println("Password Provided");
		driver.findElement(By.id("passwordNext")).click();
		//driver.close();
	}

}
