package practice.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadOperations{

	public static Properties readPropertyFile(String filePath) throws IOException {
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
}
