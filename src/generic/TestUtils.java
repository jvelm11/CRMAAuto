package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class TestUtils implements IAutoConstants{

	static String prop;
	
	public static String getProperty(String propname) {
		
		Properties property = new Properties();
		
		try {
			property.load(new FileInputStream(CONFIGPATH));
			prop=property.getProperty(propname);
		}catch (IOException e) {
			System.out.println(e);
		}
		
		return prop;
	}
	
}
