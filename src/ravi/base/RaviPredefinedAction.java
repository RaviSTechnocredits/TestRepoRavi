package ravi.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaviPredefinedAction {
	protected static WebDriver driver;
	protected WebDriver driverInitToURL(String url){
		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		return driver;
	}
	
	protected WebDriver driverInitToURL(){
		driverInitToURL("https://www.wikipedia.org/");
		return driver;
	}

	protected void driverClose(){
		driver.close();
	}
}
