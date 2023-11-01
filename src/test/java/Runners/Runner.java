package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"stepDefs"},
        plugin = {"pretty", "html:target/TestReport.html"},
        tags = "@smoke"
)
public class Runner extends AbstractTestNGCucumberTests {
}
