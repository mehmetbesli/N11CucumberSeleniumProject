package runner;

import Steps.Hook;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * created by MehmetBesli063 on 03.2019
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}, glue = {"Steps"})

public class TestRunner extends Hook {
}