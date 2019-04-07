package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileOperation {
	Properties prop;

	public PropertyFileOperation(String filepath) throws IOException {
		File file = new File(filepath); // open
		FileInputStream inStream = new FileInputStream(file); // readable input
																// file
		prop = new Properties(); // object creation
		prop.load(inStream); // property file load in memory
	}

	public String readData(String key) {
		/*
		 * File file=new File(filepath); FileInputStream inStream=new
		 * FileInputStream(file); Properties prop=new Properties();
		 * prop.load(inStream);
		 */

		String value = prop.getProperty(key);// pass key and return value
		return value;
	}
}
