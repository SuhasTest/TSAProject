package base;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class BaseClass

{
		public static WebDriver driver;
		public static String browsername;
		public static String appurl;

		
		public static Properties properties;
		
		public static  WebDriver initilizeDriver() 	
		
		{
			try {
				properties=ConfigReader.getDataFromProperty();
				browsername=properties.getProperty("browser");
				appurl= properties.getProperty("OpencartappURL");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(browsername.equalsIgnoreCase("Chrome"))
			{
				 driver = new ChromeDriver();
				 driver.get(appurl);
				 
				 ChromeOptions chromeOptions = new ChromeOptions();
		            chromeOptions.addArguments("--disable-notifications", "--disable-popup-blocking",
		                    "--disable-extensions", "disable-infobars", "--ignore-certificate-errors");
		            chromeOptions.setAcceptInsecureCerts(true);
				 
				// driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
			
			}
			
			else if(browsername.equalsIgnoreCase("Edge"))
			{
				 driver = new EdgeDriver();
				 driver.get(appurl);
				// driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
			
			}
			
			
			else if(browsername.equalsIgnoreCase("FireFox"))
			{
				 driver = new FirefoxDriver();
				 driver.get(appurl);
				// driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
			
			}
		
		return driver;
			
}
		
	
		
		
	
	

	// Generate a random alphabetic string
    public static String generateString() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    // Generate a random numeric string
    public static String generateNumber() {
        return RandomStringUtils.randomNumeric(10);
    }

    // Generate a random alphanumeric string
    public static String generateAlphaNumeric() 
    {
        return RandomStringUtils.randomAlphanumeric(10);
    }
	
}
