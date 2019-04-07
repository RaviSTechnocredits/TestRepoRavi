package seleniumBasic;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Init;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Init.start();
		driver.get("file:///F:/codeE/SeleniumBasics/SeleniumExamples/New%20Window%20Open.html");
		driver.findElement(By.xpath("//button[text()='First Window']")).click();
		System.out.println("Window open");
		String mw = driver.getWindowHandle();
		System.out.println("Mainw " + mw);
		Set<String> aw = driver.getWindowHandles();
		System.out.println("allw " + aw);
		Thread.sleep(2000);
		for (String cw : aw) {
			if (!cw.equals(mw)) {
				System.out.println("Cw " + cw);
				driver.switchTo().window(cw);
				System.out.println("Switch to second window");
				driver.close();
			}
		}
		driver.switchTo().window(mw);
		System.out.println("back to main Window");
		driver.findElement(By.xpath("//button[text()='Second Window']")).click();
		System.out.println("Switch to 2nd window");
	}

}
