package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGHomePractice {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Method 2: Before class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Method 2: Before method");
	}
	
	@Test
	public void testMethod1(){
		System.out.println("Method 2: test method 1 ");
	}
	
	@Test
	public void testMethod2(){
		SoftAssert soft=new SoftAssert();
		System.out.println("Method 2: test method 2 ");
		String actual="A";
		String expected="B";
		//Assert.assertEquals(actual, expected);
		soft.assertEquals(actual, expected);
		soft.assertAll();
		System.out.println("done");
	}
	
	@Test
	public void testMethod3(){
		System.out.println("Method 2: test method 3");
	}
}
