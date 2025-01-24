package stepDefination;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import hooks.TextContext;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class RegistrationSteps //extends BaseClass 
{
	WebDriver driver=BaseClass.driver;
	//WebDriver driver= new ChromeDriver();
	public static HomePage homepage;
	public static RegistrationPage registrationPage;
	public TextContext testcontext;
	
	//created constructor for textcontext method achive
	
	public RegistrationSteps(TextContext testcontext)
	{
		this.testcontext=testcontext;
	}
	
	

	@When("I navigate to My Account and click Register")
	public void filldetails() 
	{
		homepage= new HomePage(driver);
		homepage.clickMyAccount();
		registrationPage=homepage.clickRegister();
	
		
		
        
	}

	@When("I fill in the registration details")
	public void FillRegDetails() 
	{
		registrationPage.setFirstName(BaseClass.generateString().toUpperCase());
		registrationPage.setFirstName(BaseClass.generateString().toUpperCase());
        registrationPage.setLastName(BaseClass.generateString().toUpperCase());
      
        String email= BaseClass.generateString() + "@gmail.com";
        
        registrationPage.setEmail(email);
   
        
        registrationPage.setTelephone(BaseClass.generateNumber()); //to achive text context, encapualations
        String userPassword = BaseClass.generateAlphaNumeric();
        
        registrationPage.setPassword(userPassword);
        registrationPage.setConfirmPassword(userPassword);
        
        testcontext.SetEmail(email);
        testcontext.SetPassword(userPassword);
        
	
	}

	@When("I agree to the Privacy Policy and submit the registration form")
	public void agreeToPrivacyPolicyandSubmitform() 
	{
		registrationPage.setPrivacyPolicy();
		registrationPage.clickContinue();
		
		
	}

	@Then("I should see the confirmation message {string}")
	public void ShouldGetConfirmationMsg(String expectedMessage) 
	{
	   Assert.assertEquals("Registration failed: Confirmation message mismatch.",
               expectedMessage, registrationPage.getConfirmationMsg());
	   
	  
	}

}
