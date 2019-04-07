package excelProgramsPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelSheetReadingDemo {
	
	@Test(dataProvider="loginDataProvider")
	public void login(String userName,String password,String result)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\codeE\\resources\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com");
		driver.findElement(By.id("registration2")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("unameSignin")).sendKeys(userName);
		driver.findElement(By.id("pwdSignin")).sendKeys(password);
		driver.findElement(By.id("btnsubmitdetails")).click();
		Alert alert=driver.switchTo().alert();
		String actual=alert.getText();
		alert.accept();
		driver.close();
		Assert.assertEquals(actual, result);
		System.out.println("Working fine");
	}
	
	@DataProvider(name="loginDataProvider")
	public String[][] loginDataRead() throws IOException{
		File file = new File("C:\\Users\\Ravi Sawarker\\Downloads\\Registration.xlsx");
		FileInputStream inStream= new FileInputStream(file);
		Workbook myworkbook=new XSSFWorkbook(inStream);
		Sheet sheet=myworkbook.getSheet("LoginData");
		int totalRows=sheet.getLastRowNum();
		int totalColumns=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[totalRows][totalColumns];
		for(int rowIndex=1;rowIndex<=totalRows;rowIndex++){
			for(int colIndex=0;colIndex<totalColumns;colIndex++){
				data[rowIndex-1][colIndex]=sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			}
		}
		return data;
	}
}
