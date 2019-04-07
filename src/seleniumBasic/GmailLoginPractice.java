package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println("Gmail page open");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("identifierId")).sendKeys("ravi8betul");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierNext")).click();
		System.out.println("Switch to password page");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		System.out.println("Password entered");
		driver.findElement(By.id("passwordNext")).click();
		System.out.println("Logged in successfully");
	}
}
