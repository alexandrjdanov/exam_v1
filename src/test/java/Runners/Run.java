package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/openProduct.feature",
        glue = {"StepDefinitions"},
        tags = "@search"
)
public class Run extends AbstractTestNGCucumberTests {
}
