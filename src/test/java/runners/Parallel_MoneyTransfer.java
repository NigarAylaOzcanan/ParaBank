package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.GWD;

@CucumberOptions(
        features = {"src/test/java/featureFiles/US_606_MoneyTransfer.feature"},
        glue = {"stepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Parallel_MoneyTransfer extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browserType")
    public void beforeClass(String browserName) {
        GWD.threadBrowserName.set(browserName);

    }
}
