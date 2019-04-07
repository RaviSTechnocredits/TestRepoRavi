package ownPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Init.start();
		driver.get("file:///F:/codeE/SeleniumBasics/SeleniumExamples/New%20Window%20Open.html");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='First Window']")).click();
		String mw = driver.getWindowHandle();
		System.out.println("main window " + mw);
		Set<String> aw = driver.getWindowHandles();
		for (String cw : aw) {
			if (!cw.equals(mw)) {
				driver.switchTo().window(cw);
				System.out.println("Switched to first window " + cw);
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(mw);
		System.out.println("Back to main window " + mw);
	}
}
