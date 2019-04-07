package testNGPractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeSuite
	public void bs(){
		System.out.println("Before suite Class2");
	}
	
	@BeforeTest
	public void bt(){
		System.out.println("Before test Class2");
	}
	
	@BeforeClass
	public void bc(){
		System.out.println("Before class Class2");
	}
	
	@BeforeMethod
	public void bm(){
		System.out.println("Before method Class2");
	}
	
	@Test
	public void m1(){
		System.out.println("Test class2 : m1");
	}
	
	/*@Test
	public void m2(){
		System.out.println("Test class2 : m2");
	}*/

}
