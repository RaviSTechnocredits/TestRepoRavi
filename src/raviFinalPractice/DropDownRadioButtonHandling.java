package raviFinalPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.Init;

public class DropDownRadioButtonHandling {
	@Test
	public void dropDownRadioButtonHandle() {
		WebDriver driver = Init.start();
		/*String expected="You successfully double clicked it";
		driver.get("http://automationbykrishna.com");
		driver.findElement(By.id("basicelements")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//div/a[text()='Double-click on me']"));
		//WebElement e1=driver.findElement(By.xpath("//a[text()='Double-click on me']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
		Alert alert=driver.switchTo().alert();
		String actual=alert.getText();
		alert.accept();
		Assert.assertEquals(actual, expected);
		driver.close();*/
		
		Actions act=new Actions(driver);
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("draggable"));
		String e1=draggable.getAttribute("Class");
		WebElement droppable=driver.findElement(By.id("droppable"));
		String e2=droppable.getAttribute("Class");
		act.dragAndDrop(draggable, droppable).build().perform();
		//act.clickAndHold(from).moveToElement(to).build().perform();
		act.release();
		System.out.println(e1.equals(e2));
		driver.close();
	}
}