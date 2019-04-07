package testNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo { //same test case on different data-- data driven approach

	@Test(dataProvider = "logindataprovider")
	public void demoTest(String userName,String password) {
		String uname = userName;
		String pwd = password;
		System.out.println(uname);
		System.out.println(pwd);
	}

	@DataProvider(name = "logindataprovider")
	public String[][] provideLogindata() {
			String[][] data=new String[3][2];
			
			data[0][0]="U1";
			data[0][1]="P1";
			data[1][0]="U2";
			data[1][1]="P2";
			data[2][0]="U3";
			data[2][1]="P3";
		return data;
	}
}
