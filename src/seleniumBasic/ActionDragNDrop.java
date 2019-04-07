package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Init;

public class ActionDragNDrop {
//for verification check class attribute value of target before drop and after drop
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Init.start();
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		String e1=to.getAttribute("class");
		Actions act = new Actions(driver);
		act.clickAndHold(from).moveToElement(to).build().perform();
		act.release();
		String e2=to.getAttribute("class");
		boolean flag=e1.equals(e2);
		System.out.println(flag); //validation
		Thread.sleep(5000);
		//driver.close();
		
		
		
		
	}
}
