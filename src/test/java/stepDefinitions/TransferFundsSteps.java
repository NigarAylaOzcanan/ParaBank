package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Parent;
import pages.US606_Content;
import utilities.GWD;

import java.util.List;

public class TransferFundsSteps extends Parent {

    US606_Content us6 = new US606_Content();
    @And("User should see the transfer complete message")
    public void userShouldSeeTheTransferCompleteMessage() {
        verifyContainsText(us6.transferCompleteMessage, "Transfer Complete");
    }
    @And("User should see transfer sent and debit amount")
    public void userShouldSeeTransferSentAndDebitAmount() {
        wait(1);
        List<WebElement> elements = GWD.getDriver().findElements(By.cssSelector("tr[ng-repeat=\"transaction in transactions\"]:nth-child(1) td"));
        verifyContainsText(elements.get(1), "Funds Transfer Sent");
        verifyContainsText(elements.get(2), "$");
    }
    @And("User enters transaction amount")
    public void userEntersTransactionAmount(DataTable dt) {
        List<List<String>> list = dt.asLists(String.class);

        for (int i = 0; i < list.size(); i++) {
            // GET THE NECESSARY WEB ELEMENT
            wait(1);
            WebElement txtBox = us6.getWebElement(list.get(i).get(0));
            // SEND KEYS TO THAT ELEMENT
            mySendKeys(txtBox, list.get(i).get(1));
        }
    }
}
