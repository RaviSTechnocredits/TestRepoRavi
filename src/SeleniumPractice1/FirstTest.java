package SeleniumPractice1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.Init;

public class FirstTest {
	static WebDriver driver=null;
	@BeforeMethod
	public void m2(){
		driver=Init.start();
	}
	@Test
	public void m1(){
		WebDriver driver=Init.start();
		driver.get("http://www.google.com");
		System.out.println("m1");
	}
	
	@Test
	public void demoTest() {
		WebDriver driver=Init.start();
		driver.get("http://www.google.com");
		System.out.println("Hello");
		driver.close();
	}
}
	