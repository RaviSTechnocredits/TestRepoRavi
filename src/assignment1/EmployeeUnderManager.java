package assignment1;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Init;

public class EmployeeUnderManager {

	public static void main(String[] args) {

		WebDriver driver = Init.start();
		driver.get("http://automationbykrishna.com");
		System.out.println("page open");
		driver.findElement(By.id("demotable")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("clicked demotable");
		int size = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr")).size();
		System.out.println(size);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int index = 1; index <= size; index++) {
			if (map.containsKey(
					driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + index + "]/td[4]"))
							.getText())) {
				map.put(driver
						.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + index + "]/td[4]"))
						.getText(), (map.get(driver.findElement(By
										.xpath("//table[@class='table table-striped']/tbody/tr[" + index + "]/td[4]")))+1)
								);
			} else {
				map.put(driver
						.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + index + "]/td[4]"))
						.getText(), 1);
			}
		}
		System.out.println(map);
		driver.close();
	}

}
