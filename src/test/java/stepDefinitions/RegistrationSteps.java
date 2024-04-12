package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Parent;
import pages.US601_Content;
import utilities.ConfigReader;
import utilities.GWD;

public class RegistrationSteps extends Parent {
    US601_Content us1 = new US601_Content();
    @Given("Navigate to Parabank website")
    public void navigateToParabankWebsite() {
        GWD.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @When("Click on the Register button")
    public void clickOnTheRegisterButton() {
        myClick(us1.registerBtn);

    }
    @Then("Fill the registration information")
    public void fillTheRegistrationInformation() {
        mySendKeys(us1.customerForm.get(0), "Arpan");
        mySendKeys(us1.customerForm.get(1), "Newton");
        mySendKeys(us1.customerForm.get(2), "Ratios St 5206, Philippines, 848608");
        mySendKeys(us1.customerForm.get(3), "Pella");
        mySendKeys(us1.customerForm.get(4), "Tonga");
        mySendKeys(us1.customerForm.get(5), "34432");
        mySendKeys(us1.customerForm.get(6), "374354765");
        mySendKeys(us1.customerForm.get(7), "131153203");
        mySendKeys(us1.customerForm.get(8), "Newton");
        mySendKeys(us1.customerForm.get(9), "Qx6YXX");
        mySendKeys(us1.customerForm.get(10), "Qx6YXX");
    }
    @And("Click on the Register Submit button")
    public void clickOnTheRegisterSubmitButton() {
        myClick(us1.customerForm.get(11));
    }
    @And("User should see the success message")
    public void userShouldSeeTheSuccessMessage() {
        verifyContainsText(us1.successMessage, "success");
    }
}
