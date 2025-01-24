package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set explicit wait duration
		PageFactory.initElements(driver, this);
	}
	
	
	//webelements
	
	@FindBy(xpath= "//input[@id='input-email']") WebElement emailTxt;
	@FindBy(xpath= "//input[@id='input-password']") WebElement passwordTxt;
	@FindBy(xpath="//input[@class='btn btn-primary']") WebElement loginBtn;

	//Actions
	
	public void EnterEmail(String email)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(emailTxt)).sendKeys(email);
		}
		catch(Exception e)
		{
			System.out.println("unable to enter email address" + e.getMessage());
		}
	}
	
	public void EnterPassword(String password)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(passwordTxt)).sendKeys(password);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void ClickLoginbtn()
	{
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	


}
