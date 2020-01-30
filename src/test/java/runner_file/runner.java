package runner_file;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue="src/test/java/Step_definition/BrowserLogin", features="src/test/java/feature_folder/log.feature",dryRun=true,monochrome=true,
plugin= {"pretty","html:/naveencucumber/target/cucumberReport"})

public class runner extends AbstractTestNGCucumberTests
{

}
