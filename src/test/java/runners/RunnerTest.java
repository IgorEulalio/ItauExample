package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-html-report",
        "json:target/cucumber-json-report.json"},
        features = "src/test/steps/",
        tags = {"~@ignore"}
)
public class RunnerTest {
}
