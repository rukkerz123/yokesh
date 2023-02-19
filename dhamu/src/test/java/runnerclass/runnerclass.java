package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featurefile\\product.feature" ,
glue= "stepdefinition , dryrun = false")


public class runnerclass { 

}
