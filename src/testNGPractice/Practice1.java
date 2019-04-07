package testNGPractice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Method 1: Before class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Method 1: Before method");
	}
	
	@Test
	public void testMethod(){
		System.out.println("Method 1: test method");
	}
}
