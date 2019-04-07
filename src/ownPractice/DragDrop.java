package ownPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Init;

public class DragDrop {
	
	public static void main(String[] args) {
		WebDriver driver=Init.start();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.clickAndHold(from).moveToElement(to).build().perform();
		act.release();
	}
}
