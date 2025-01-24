package stepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class CommenSteps 
{
	final WebDriver driver= BaseClass.driver;
	
	@Given("I navigate to the application URL")
	public void navigatetoappUrl() throws IOException
	{
		String appurl= BaseClass.properties.getProperty("OpencartappURL");
	   
	}
}
