package assignment1;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class ManagerCount {
	
	public static void main(String[] args) {
		WebDriver driver=Init.start();
		driver.get("http://automationbykrishna.com");
		System.out.println("page open");
		driver.findElement(By.id("demotable")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("clicked demotable");
		int size=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr")).size();
		System.out.println(size);
		HashSet<String> hs=new HashSet<String>();
		for(int index=1;index<=size;index++){
			hs.add(driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+index+"]/td[4]")).getText());
		}
		System.out.println(hs);
		for(int index=1;index<=size;index++){
			
		}
		System.out.println(hs.size());
	}   
}
