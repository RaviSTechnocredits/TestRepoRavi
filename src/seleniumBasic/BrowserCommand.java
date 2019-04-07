package seleniumBasic;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import util.Init;
import util.PropFileOperation;

public class BrowserCommand {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=Init.start();
		Properties prop=PropFileOperation.loadPropData();
		driver.get("http://google.com");
		System.out.println("Browser open");
		String url=driver.getCurrentUrl();
		System.out.println("Current URL : "+url);
		String title=driver.getTitle();
		System.out.println("Title of page : "+title);
		String pageSource=driver.getPageSource(); //to get the page source in string
		//System.out.println("Page source : "+pageSource);
		driver.close();
		System.out.println("Browser closed");
	}

}
