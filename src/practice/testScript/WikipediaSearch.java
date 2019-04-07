package practice.testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import practice.base.PreDefinedActionPractice;
import practice.pages.WikipediaHomePage;
import practice.pages.WikipediaSearchPage;

public class WikipediaSearch extends TestBasePractice {
	//static WebDriver driver;
	@Test
	public void hitUrl() throws IOException {
		
		/*System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();*/
		/*driver.get("https://www.wikipedia.org/");*/
		String expected="Stephen William Hawking";
		WikipediaSearchPage wikiPage=gotoWikipediaPage();
		wikiPage.launchBrowser();
		/*driver.findElement(By.id("searchInput")).sendKeys("Stephen Hawking");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
*/		
		
		wikiPage.searchUser(expected);
		WikipediaHomePage homePage=gotoWikipediaHomePage();
		String actual=homePage.searchResult();	
		//String actual=driver.findElement(By.xpath("//div[@class='nickname']")).getText();
		Assert.assertEquals(expected, actual);
		System.out.println("working fine");
		wikiPage.turnOffBrowser();
	}
	
	@AfterMethod
	public void getScreenShot(ITestResult result) throws IOException{
		System.out.println(result.getStatus());
		if(result.getStatus() == ITestResult.FAILURE){
			PreDefinedActionPractice.captureScreenshot();
		}
	}
}