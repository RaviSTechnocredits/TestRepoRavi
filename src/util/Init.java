package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
	
	public static WebDriver start() { //method to create WebDriver instance  
		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
