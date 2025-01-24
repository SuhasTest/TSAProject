package hooks;


import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass
{
	
	@Before
	public static void InitialSetup()
	{
		WebDriver driver=BaseClass.initilizeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public static void TearDown()
	{	
		driver.close();
	}
	
	
	@AfterStep
	public void addScreenshot(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			
			byte [] SS= screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(SS, "image/png", "Failed Screenshot");
		}
	}

	
	
	
	
	
	
}
