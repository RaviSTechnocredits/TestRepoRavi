package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class FrameHandle {
	
	public static void main(String[] args) {
		WebDriver driver=Init.start();
		driver.get("http://automationbykrishna.com/");
		driver.findElement(By.id("iframes")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame("site1");
		driver.findElement(By.xpath("//ul/li/a[text()='Projects']")).click();
		
		//driver.switchTo().frame("site1");
		//driver.switchTo().frame
		//driver.findElement("//*[@id="indexBody"]/iframe")
		driver.close();
	}

}
