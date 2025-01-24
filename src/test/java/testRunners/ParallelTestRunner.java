package testRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			
			//features= {"src/test/resources/features/"},
			//features= {"src/test/resources/features/Registration.feature","src/test/resources/features/Login.feature"},
			features= {"src/test/resources/features"},
			//features= {"src/test/resources/features/Login.feature"},
			//features= {"@target/rerun.txt"}
			glue= {"stepDefination", "hooks"},
			plugin= {"pretty", "html:target/HtmlReport/index.html",
					"json:target/Cucumberreports/cucumber.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"rerun:target/rerun.txt"},
		
			dryRun=false
			
		)

public class ParallelTestRunner extends AbstractTestNGCucumberTests
{
	 @DataProvider(parallel=true)
	    public Object[][] scenarios() 
	 	{
	  
	        return super.scenarios();
	    }
}
