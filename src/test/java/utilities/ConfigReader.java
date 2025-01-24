package utilities;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	public static Properties getDataFromProperty() throws IOException
	
	{
		FileReader reader = new FileReader("src/test/resources/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(reader);
		
		return prop;
	}

	
}
