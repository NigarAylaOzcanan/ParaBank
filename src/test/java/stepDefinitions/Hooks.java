package stepDefinitions;

import utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before (){
        System.out.println( " Scenario is running...");
    }
    @After
    public void after (Scenario scenario){

        if (scenario.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            byte[] bytes= ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(bytes, "image/png", "screenshot name");
        }
        System.out.println(" Scenario has been completed. ");
        GWD.tearDown();
    }
}
