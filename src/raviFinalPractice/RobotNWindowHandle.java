package raviFinalPractice;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.Init;

public class RobotNWindowHandle {

	@Test
	public void robot() throws AWTException, InterruptedException {
		WebDriver driver = Init.start();
		/*
		 * driver.get("http://automationbykrishna.com/#"); WebDriverWait
		 * wait=new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "basicelements")));
		 * driver.findElement(By.id("basicelements")).click();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * WebDriverWait wait=new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "basicelements")));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "exampleInputFile")));
		 * driver.findElement(By.xpath("//input[@id='exampleInputFile']")).click
		 * (); StringSelection filePath=new
		 * StringSelection("F://Selenium//FirstProgram.txt");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
		 * filePath, null); Robot robot=new Robot();
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * System.out.println("Entered file path");
		 */

		driver.get("file:///F:/codeE/SeleniumBasics/SeleniumExamples/New%20Window%20Open.html");
		String mw = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='First Window']")).click();
		
		System.out.println(mw);
		Set<String> aw = driver.getWindowHandles();
		System.out.println(aw);
		Thread.sleep(2000);
		for (String cw : aw) {
			if (!cw.equals(mw)) {
				driver.switchTo().window(cw);
				//System.out.println(cw);
				driver.close();
			}
		}
		driver.switchTo().window(mw);
	}

}
