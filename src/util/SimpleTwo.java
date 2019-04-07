package util;

import org.testng.annotations.Test;

public class SimpleTwo {

	@Test
	public void printI() throws InterruptedException{
		System.out.println();
		System.out.println("SImple Two");
		
		Thread.sleep(10000);
		/*Init.start().get("www.google.com");
		Init.start().close();*/
	}
}
