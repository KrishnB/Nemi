package cucumbertests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,features="src/main/resources/features",glue="com.dreamersweekend.stepdefinitions",dryRun = false,
				format = {"pretty","html:src/main/resources/reports/htmlreports","json:src/main/resources/reports/jsonreports/cucumber.json",
							"junit:src/main/resources/reports/junitreports/test.xml"},name = "Hook scenario",snippets=SnippetType.UNDERSCORE)
public class NemiTest {

}
