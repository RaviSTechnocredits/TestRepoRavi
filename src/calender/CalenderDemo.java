package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.Init;

public class CalenderDemo {
	
	@Test
	public void calenderRead(){
		WebDriver driver=Init.start();
		driver.get("https://www.goibibo.com");
		driver.findElement(By.xpath("//input[@class='inputSrch curPointFlt ']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='fare_20190331']")).click();
		//driver.findElement(By.xpath("//input[@class='inputSrch curPointFlt ']")).click();
	}

}
