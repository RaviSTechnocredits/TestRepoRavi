package ravi.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ravi.page.SRKPage;
import ravi.page.WikiSearchPage;

public class WikiSearch {
	
	static WebDriver driver;
	@Test
	public void openSRK(){
		String expected="1988–present";
//		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.wikipedia.org/");
		WikiSearchPage sPage=new WikiSearchPage();
		driver=sPage.goToWikiSearchPage();
		/*driver.findElement(By.id("searchInput")).sendKeys("Shahrukh khan");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();*/
		sPage.searchSRK();
		SRKPage srkPage=new SRKPage();
		String actual=srkPage.srkPageVerification();
		//String actual=driver.findElement(By.xpath("//table[@class='infobox biography vcard']//tr[7]//td")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		srkPage.driverOff();
		//driver.close();
	}
}
