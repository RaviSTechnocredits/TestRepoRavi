package seleniumBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import util.PropFileOperation;

public class FirstScript {

	//We place below method in a different class as need to use this multiple time
	/*static WebDriver start() { //method to create WebDriver instance  
		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}*/

	public static void main(String[] args) throws IOException{
		//WebDriver driver = Init.start();  //created a utility class Init
		/*System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		//driver.get("http://google.com");
		/*File file=new File(".//credentials.properties"); //open file
		FileInputStream input=new FileInputStream(file); //make file readable, throws FileNotFoundException
		
		//For below all lines we created a class PropFileOperation in util package
		Properties prop=new Properties(); //object creation to load file in memory
		prop.load(input); //load file in memory, throws IOException	
		//prop.load(new FileInputStream(new file(".//credentials.properties") ))   single statement for all above lines
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");*/
		
		Properties prop=PropFileOperation.loadPropData();
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(username + ": "+password);
	}
}
