package raviFinalPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.Init;

public class WebTHandle {
	
	@Test
	public void webTHandle() throws InterruptedException{
		WebDriver driver=Init.start();
		driver.get("http://automationbykrishna.com");
		driver.manage().window().maximize();
		System.out.println("Browser Open");
		driver.findElement(By.id("demotable")).click();
		Thread.sleep(3000);
		
	}

}
