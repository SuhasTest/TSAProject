package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import base.BaseClass;
import hooks.TextContext;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class LogInSteps extends BaseClass
{
	public WebDriver driver=BaseClass.driver;
	public static HomePage homepage;
	public static LoginPage loginpage;
	public static MyAccountPage myaccpage;
	
	public TextContext testcontext;
	
	public LogInSteps(TextContext testcontext)
	{
		this.testcontext=testcontext;
	}
	 
	
	@When("I navigat to the log in page")
	public void navigateToLoginPage() 
	{
		homepage= new HomePage(driver);
	   homepage.clickMyAccount();
	   loginpage=homepage.clickLogin();
	}

	@When("I enter the valid email {string} and password {string}")
	public void EnterValidCreds(String string, String string2) 
	{
		String email= BaseClass.properties.getProperty("email");
		String password= BaseClass.properties.getProperty("password");
		loginpage.EnterEmail(testcontext.GetEmail());
		loginpage.EnterPassword(testcontext.GetPassword());
	}
	
	@When("I clicked on the signin button")
	public void clickSignInBtn() 
	{
		loginpage.ClickLoginbtn();
	}
	

	@Then("I should be redirected to the My account page")
	public void ShouldberedirecredtoMyaccount() 
	{
		myaccpage= new MyAccountPage(driver);
	
		Assert.assertFalse("Login failed", myaccpage.IsmyAccountPageDisplayed());
	}


}


