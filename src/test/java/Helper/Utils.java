package Helper;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.InputStream;

public class Utils {
	public static String getProperty(String property) throws Exception  {	
	InputStream  input = new FileInputStream("src/test/resources/properties/properties");
	Properties properties  = new Properties ();
	properties.load(input);
	return(properties.getProperty(property));
		
	}

}
