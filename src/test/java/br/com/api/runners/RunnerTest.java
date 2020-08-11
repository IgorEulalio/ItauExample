package br.com.api.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\Leonardo\\workspace\\ItauExample\\src\\test\\resource\\features\\CalculoImpostoRenda.feature",
        glue = "br.com.api.steps",
        //tags = {"@unitario", "~@funcional"},
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
)
public class RunnerTest {
}
