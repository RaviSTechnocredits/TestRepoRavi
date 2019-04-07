package seleniumBasic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Initialize;

public class WebTableHandling {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = Initialize.start();
		driver.get("http://automationbykrishna.com");
		driver.manage().window().maximize();
		System.out.println("Browser Open");
		driver.findElement(By.id("demotable")).click();
		Thread.sleep(3000);
		int totalRows = driver.findElements(By.cssSelector("#table1 tbody tr")).size();
		for (int i = 1; i <= totalRows; i++) {
			// WebElement element=driver.findElement(By.cssSelector("#table1 >
			// tbody tr:nth-of-type("+i+")>td:nth-of-type(2)"));
			String element = driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[" + i + "]/td[2]")).getText();
			// System.out.println(element);
			if (element.equals("Dhara")) {
				System.out.println(driver
						.findElement(By.cssSelector("#table1 tbody tr:nth-child(" + (i + 1) + ")>td:nth-child(4)"))
						.getText());
			} ///write it directly using xPath without for loop
		}
		driver.close();
	}
}
