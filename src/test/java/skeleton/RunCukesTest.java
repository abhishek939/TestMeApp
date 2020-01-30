package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
/*@CucumberOptions(plugin = {"json:target/cucumber.json","html:target/html/html-report"})*/
@CucumberOptions(plugin = {"pretty"},tags= {"not @registration","not @data-driven", "@search"})
public class RunCukesTest 
{
	
}
