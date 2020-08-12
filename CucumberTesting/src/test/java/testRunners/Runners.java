package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="../CucumberTesting/src/test/resources/feature/test.feature" , glue= {"stepDefinations"})

public class Runners {
 
	

}
