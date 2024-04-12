package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.Parent;
import pages.US604_Content;
import utilities.GWD;

import java.util.List;

public class NewBankAccountSteps extends Parent {
    US604_Content cnt = new US604_Content();

    @When("Click on the Element in Content")
    public void clickOnTheElementInContent(DataTable links) {

        List<String> linkList = links.asList(String.class);
        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement = cnt.getWebElement(linkList.get(i));
            cnt.myClick(linkWebElement);
        }
    }
    @And("The user is directed to the bank account creating page")
    public void theUserIsDirectedToTheBankAccountCreatingPage() {
        String currentUrl= GWD.getDriver().getCurrentUrl();
        String expectedUrl = "https://parabank.parasoft.com/parabank/openaccount.htm";
        wait.until(ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/openaccount.htm"));
        Assert.assertEquals(currentUrl,expectedUrl, "URL does not match!");
    }
    @And("The user selects the account type as {string} from the Drop-Down menu")
    public void theUserSelectsTheAccountTypeAsFromTheDropDownMenu(String accountType) {
        cnt.selectByText(cnt.selectAccountType,accountType);
    }
    @And("The user sees a warning that the new bank account should have a minimum balance")
    public void theUserSeesAWarningThatTheNewBankAccountShouldHaveAMinimumBalance() {
        cnt.waitUntilVisibilityOf(cnt.warningMessage);
        System.out.println(cnt.warningMessage.getText());
    }
    @And("The user selects the account of {int} from the Drop-Down menu")
    public void theUserSelectsTheAccountOfIndexTheFromDropDownMenu(int index) {
        cnt.selectByIndex(cnt.selectAccount,index);
    }
    @Then("The user confirms the successful creation of the new bank account")
    public void theUserConfirmsTheSuccessfulCreationOfTheNewBankAccount() {
        cnt.waitUntilVisibilityOf(cnt.successMsg);
        System.out.println(cnt.successMsg.getText());
    }
}
