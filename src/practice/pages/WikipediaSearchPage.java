package practice.pages;

import java.io.IOException;
import java.util.Properties;
import practice.base.PreDefinedActionPractice;
import practice.util.PropertyFileReadOperations;

public class WikipediaSearchPage extends PreDefinedActionPractice {
	static Properties prop;
	private static WikipediaSearchPage searchPageInstance;
	private WikipediaSearchPage() throws IOException{
		prop=PropertyFileReadOperations.readPropertyFile(".//src//practice//config//WikiPageSearchProperty.Properties");
	}	
	
	public static WikipediaSearchPage getInstance() throws IOException{
		//searchPage=null;
		if(searchPageInstance==null){
			searchPageInstance=new WikipediaSearchPage();
			return searchPageInstance;
		}
		return searchPageInstance;
	}
	
	public void launchBrowser(){
		initializingBrowser();
	}
	
	public void turnOffBrowser(){
		closeDriver();
	}
	
	public void searchUser(String expectedName){
		setText("searchInput",expectedName);
		//driver.findElement(By.id("searchInput")).sendKeys(expectedName);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click("//button[@class='pure-button pure-button-primary-progressive']");
		//driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
	}
}
