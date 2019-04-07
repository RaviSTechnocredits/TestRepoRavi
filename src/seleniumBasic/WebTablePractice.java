package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

public class WebTablePractice {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Init.start();
		driver.get("http://automationbykrishna.com/index.html");
		driver.manage().window().maximize();
		System.out.println("Browser open");
		driver.findElement(By.id("demotable")).click();
		System.out.println("Clicked on demo table");
		Thread.sleep(3000);
		int count=driver.findElements(By.cssSelector("#table1 tr")).size();
		for(int i=1;i<count;i++){
			WebElement element=driver.findElement(By.cssSelector("#table1 tr:nth-of-type("+i+") td:nth-of-type(2)"));
			if(element.equals("Dhara")){
				System.out.println(driver.findElement(By.cssSelector("#table1 tr:nth-of-type("+i+")>td:nth-of-type(4)")).getText());
			}
			//System.out.println(element.getText());
		}
	}

}
