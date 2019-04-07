package testNGPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@AfterSuite
	public void as(){
		System.out.println("After suite Class1");
	}
	
	@BeforeTest
	public void bt(){
		System.out.println("Before test Class1");
	}
	
	@BeforeClass
	public void bc(){
		System.out.println("Before class Class1");
	}
	
	@BeforeMethod
	public void bm(){
		System.out.println("Before method Class1");
	}
	@Test
	public void m1(){
		System.out.println("Test class1 : m1");
	}
	
	/*@Test
	public void m2(){
		System.out.println("Test class1 : m2");
	}*/
}
