package runners;

import utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"stepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class ParallelTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browserType")
    public void beforeClass(String browserName)
    {
        GWD.threadBrowserName.set(browserName);

    }
}
