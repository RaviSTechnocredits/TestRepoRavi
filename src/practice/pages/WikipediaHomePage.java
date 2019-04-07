package practice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import practice.base.PreDefinedActionPractice;

public class WikipediaHomePage extends PreDefinedActionPractice {

	/*
	 * public WikipediaHomePage gotoWikipediaHomePage(){ String
	 * actual=driver.findElement(By.xpath("//div[@class='nickname']")).getText()
	 * ; }
	 */

	public String searchResult() {
		String actual = driver.findElement(By.xpath("//div[@class='nickname']")).getText();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return actual;
	}
}
