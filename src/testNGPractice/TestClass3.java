package testNGPractice;

import org.testng.annotations.Test;

public class TestClass3 {
	
	@Test(groups="smoke")
	public void m1(){
		System.out.println("class3 m1");
	}
	
	@Test(groups={"smoke","Sanity"})
	public void m2(){
		System.out.println("class3 m2");
	}
	
	@Test(groups="Sanity")       //(enabled=false)		//this test case won't run
	public void m3(){
		System.out.println("class3 m3"); //need not to execute due to bug
	}
	
	@Test(groups="Sanity")
	public void m4(){
		System.out.println("class3 m4");
	}
}
