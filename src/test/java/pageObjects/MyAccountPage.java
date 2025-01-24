package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage 
{
	WebDriver driver;
	WebDriverWait wait;
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//webelements
	
	@FindBy(xpath= "//h2[text()='My Account']") WebElement pageheading;

	
	//actions
	
	public boolean IsmyAccountPageDisplayed()
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(pageheading));
			return pageheading.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}





}
