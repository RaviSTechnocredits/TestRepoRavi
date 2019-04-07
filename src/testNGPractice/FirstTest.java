package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Example of all the annotations for test
public class FirstTest {

	@BeforeClass
	public void mBC() {
		System.out.println("Before class");
	}

	@AfterClass
	public void mAC() {
		System.out.println("After class");
	}

	@BeforeMethod
	void mBM() {
		System.out.println("Before method");
	}

	@AfterMethod
	void mAM() {
		System.out.println("After method");
	}

	// @Test(priority=1)
	@Test
	void m1() {
		System.out.println("Method 1");
	}

	@Test(dependsOnMethods = "m1") // default priority 0
	void m2() {
		System.out.println("Method 2");
	}
	
	@Test
	void m3() {
		System.out.println("Method 3");
	}

	@BeforeTest
	void bTM() {
		System.out.println("Before Test");
	}

	@AfterTest
	void aTM() {
		System.out.println("After Test");
	}

	@BeforeSuite
	void bSM() {
		System.out.println("Before suit");
	}

	@AfterSuite
	void aSM() {
		System.out.println("After suit");
	}
}
