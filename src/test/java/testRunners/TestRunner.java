package testRunners;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
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







public class TestRunner {

}
