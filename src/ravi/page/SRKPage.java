package ravi.page;

import org.openqa.selenium.By;

import ravi.base.RaviPredefinedAction;

public class SRKPage extends RaviPredefinedAction {
	
	public String srkPageVerification(){
		return driver.findElement(By.xpath("//table[@class='infobox biography vcard']//tr[7]//td")).getText();
	}
	
	public void driverOff(){
		driverClose();
	}
}
