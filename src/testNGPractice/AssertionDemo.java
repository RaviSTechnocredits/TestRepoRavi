package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	@Test(groups="smoke")
	public void m1(){
		System.out.println("AssertionDemo m1");
		String expected="Success";
		String actual="Success!";
		SoftAssert softassert=new SoftAssert(); //class for soft assert
		/*if(expected.equals(actual)){ Not a right way in industry
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}*/
		// Hard assert---->Assert.assertEquals(actual, expected); //notEquals, true---> other imp methods
		softassert.assertEquals(actual, expected);
		System.out.println("Hello");
		softassert.assertAll(); // will show softAssert as fail scenario, always right it as last line of method
	}
	
	@Test(groups={"smoke","Sanity"})
	public void m2(){
		System.out.println("AssertionDemo m2");
	}

}
