package z.ravi.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedTasks {
	static public WebDriver driver = null;

	public WebDriver start(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	public WebDriver start() {
		start("https://automationbykrishna.com");
		return driver;
	}

}
