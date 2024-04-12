package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"}
)
public class RegressionTest extends AbstractTestNGCucumberTests {
}
