package br.com.api.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\Leonardo\\workspace\\ItauExample\\src\\test\\resource\\features\\CalculoImpostoRenda.feature",
        glue = "br.com.api.steps",
        strict = false,
        //tags = {"@unitario", "~@funcional"},
        plugin = {"progress"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}
