package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Init;

public class AutoCompleteDemo {
	
	public static void main(String[] args) {
		WebDriver driver=Init.start();
		driver.get("http:goibibo.com");
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Pun");
		List<WebElement> autoSuggestion=driver.findElements(By.cssSelector("XYZ"));
		
		
		
		//#react-autosuggest-1-suggestion--0 > div > div.dib.marginL10.pad0.textOverflow.width90 > div.mainTxt.clearfix > span:nth-child(1)
	}

}
