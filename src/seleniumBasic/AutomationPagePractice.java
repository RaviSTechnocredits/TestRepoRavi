package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.Init;

public class AutomationPagePractice {
	@Test
	void getPragyaDetails(){
		WebDriver driver=Init.start();
		driver.get("http://automationbykrishna.com");
		System.out.println("Page open");
		driver.findElement(By.id("demotable")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("Demotable clicked");
		for(int index=1;index<=5;index++){
			System.out.print(driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[4]/td["+index+"]")).getText());
			System.out.print("  ");
		}
	}
}
