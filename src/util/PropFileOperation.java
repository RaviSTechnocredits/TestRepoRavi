package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFileOperation {
	
	public static Properties loadPropData() throws IOException{
		File file=new File(".//credentials.properties"); //open file
		FileInputStream input=new FileInputStream(file); //make file readable, throws FileNotFoundException	
		Properties prop=new Properties(); //object creation to load file in memory
		prop.load(input); //load file in memory, throws IOException	
		//prop.load(new FileInputStream(new file(".//credentials.properties") ))   single statement for all above lines
		return prop;
	}
}
