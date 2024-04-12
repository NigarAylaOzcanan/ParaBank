package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Parent;
import pages.US602_Content;
import pages.US606_Content;

public class LoginSteps extends Parent {
    US606_Content us6 = new US606_Content();
    US602_Content us2=new US602_Content();

    @Then("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        mySendKeys(us6.usernamePlc, "Newton");
        mySendKeys(us6.passwordPlc, "12345");
        myClick(us6.loginBtn);
    }
    @When("Enter username as {string} password as {string}")
    public void enterUsernameIsPasswordAs(String username, String password) {
        mySendKeys(us6.usernamePlc,username);
        mySendKeys(us6.passwordPlc,password);
        myClick(us6.loginBtn);
    }
    @When("Enter log out button")
    public void enterLogOutButton() {
        myClick(us2.logOutBtn);
    }
    @Then("Failed message should be displayed")
    public void failedMessageShouldBeDisplayed() {
        verifyContainsText(us2.failedMessage, "username");
    }
}
