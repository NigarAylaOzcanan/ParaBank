package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.Parent;
import pages.US606_Content;

public class _LoginSteps_ extends Parent {
    US606_Content us6 = new US606_Content();

    @Then("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        mySendKeys(us6.usernamePlc, "weagfdg");
        mySendKeys(us6.passwordPlc, "T4rg8H!Kp6i7b");
        myClick(us6.loginBtn);
    }
}
