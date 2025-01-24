package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage 
{
	
	WebDriver driver;
	WebDriverWait wait;
	public SearchResultsPage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set explicit wait duration
		PageFactory.initElements(driver, this);
	}
}
