package stepDefinitions;

import io.cucumber.java.en.And;
import pages.Parent;
import pages.US606_Content;

public class _TransferFundsSteps_ extends Parent {

    US606_Content us6 = new US606_Content();

    @And("User should see the transfer complete message")
    public void userShouldSeeTheTransferCompleteMessage() {
        verifyContainsText(us6.transferCompleteMessage, "complete");
    }

    @And("User should see transfer sent and debit amount")
    public void userShouldSeeTransferSentAndDebitAmount() {
        verifyContainsText(us6.transactionHistory.get(1), "sent");
        verifyContainsText(us6.transactionHistory.get(2), "$");
    }
}
