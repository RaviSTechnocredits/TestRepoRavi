package seleniumBasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class RobotClassDemo {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=Init.start();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		System.out.println("Browser open");
		driver.findElement(By.id("basicelements")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("exampleInputFile")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='file' and @id='exampleInputFile']")).click();
		StringSelection filePath=new StringSelection("F:\\Selenium\\FirstProgram.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Entered file path");
	}
}
