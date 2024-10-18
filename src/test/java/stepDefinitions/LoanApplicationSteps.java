package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.Parent;
import pages.US608_Content;
import java.util.List;

public class LoanApplicationSteps extends Parent {
    US608_Content us8 = new US608_Content();
    @Given("Click on the Element")
    public void clickOnTheElement(DataTable dt) {
        List<String> list = dt.asList(String.class);

        for (int i = 0; i < list.size(); i++) {
            myClick(us8.getWebElement(list.get(i)));
        }
    }
    @And("Send text to placeholder")
    public void sendTextToPlaceholder(DataTable dt) {
        List<List<String>> list = dt.asLists(String.class);

        for (int i = 0; i < list.size(); i++) {

            WebElement txtBox = us8.getWebElement(list.get(i).get(0));
            mySendKeys(txtBox, list.get(i).get(1));
        }
    }
    @And("User select the account")
    public void userSelectTheAccount() {
        selectByIndex(us8.fromAccountSlct, 1);
    }
    @Then("User should see the has been approved message")
    public void userShouldSeeTheHasBeenApprovedMessage() {
        verifyContainsText(us8.textApproved, "Congratulations");
    }

    @Then("Account detail checking and verification")
    public void accountDetailCheckingAndVerification() {
        verifyContainsText(us8.accountTypeText, "LOAN");
        verifyContainsText(us8.accountBalanceText, "2000");
        verifyContainsText(us8.accountAvailableBalanceText, "2000");
        verifyContainsText(us8.noTransactionsText, "No transactions found.");
    }
    @Then("User should see the has been denied message")
    public void userShouldSeeTheHasBeenDeniedMessage() {
        verifyContainsText(us8.textDenied, "down payment");
    }
}
