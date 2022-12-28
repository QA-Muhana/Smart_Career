package smart.usa.runnertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin = {"pretty", "json:target/cucumber.json"},
	features = ".//Features/",
	glue = {"smart.usa.stepdef","smart.usa.hookstest"},
	monochrome = true,
	dryRun = false,
	tags = " @Sanity"	
	
		)

public class Runner extends AbstractTestNGCucumberTests {

}
