package seleniumBasic;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Init;

public class ExplicitWaitDemo {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = Init.start();
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			driver.get("http://automationbykrishna.com/");
			driver.findElement(By.id("demotable")).click();
			//Thread.sleep(3000);    not per industry standards
			//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //correct way -- Implicit wait
			WebDriverWait wait=new WebDriverWait(driver,30); //Explicit method
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demotable")));
			int rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr")).size();
			System.out.println("Total number of employees : " + rows);
			for (int i = 1; i <= rows; i++) {
				String deptName = driver
						.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[5]")).getText();
				if (hm.containsKey(deptName)) {
					hm.put(deptName, hm.get(deptName) + 1);
				} else {
					hm.put(deptName, 1);
				}
			}
			System.out.println(hm);
			Set<String> key = hm.keySet();
			System.out.println("Total dept " + key.size());
			int max = 0;
			String maxEmpDept = "";
			for (String s : key) {
				System.out.println("Dept Name " + s + " and No of Emp " + hm.get(s));
				if (hm.get(s) > max) {
					max = hm.get(s);
					maxEmpDept = s;
				}
			}
			System.out.println("dept with max emp is " + maxEmpDept + " and count is " + max);
		}
}



