package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Parent;
import pages.US603_Content;
import pages.US608_Content;

public class BillPaySteps extends Parent {
    US603_Content us3 = new US603_Content();
    US608_Content us8 = new US608_Content();

    @When("Click on the Bill Pay Button")
    public void clickOnTheBillPayButton() {
        myClick(us3.billPayBtn);
    }

    @And("Click on the Send Payment button")
    public void clickOnTheSendPaymentButton() {
        myClick(us3.sendPaymentCl);
    }

    @Then("Fill the payee Electric information")
    public void fillThePayeeElectricInformation() {
        mySendKeys(us3.payeeInformation.get(0), "EnerjiSA Elektrik Faturasi");
        mySendKeys(us3.payeeInformation.get(1), "Uzum Sk:26");
        mySendKeys(us3.payeeInformation.get(2), "Sariyer");
        mySendKeys(us3.payeeInformation.get(3), "Istanbul");
        mySendKeys(us3.payeeInformation.get(4), "34098");
        mySendKeys(us3.payeeInformation.get(5), "5551234545");
        mySendKeys(us3.payeeInformation.get(6), "1122");
        mySendKeys(us3.payeeInformation.get(7), "1122");
        mySendKeys(us3.payeeInformation.get(8), "85");
    }

    @And("Click on the Accounts Overview button")
    public void clickOnTheAccountsOverviewButton() {
        myClick(us3.accountsOverviewBtn);
    }

    @Then("Fill the payee Water information")
    public void fillThePayeeWaterInformation() {
        mySendKeys(us3.payeeInformation.get(0), "ISKI Su Faturasi");
        mySendKeys(us3.payeeInformation.get(1), "Bulbul Sk. No:19");
        mySendKeys(us3.payeeInformation.get(2), "Tarabya");
        mySendKeys(us3.payeeInformation.get(3), "Istanbul");
        mySendKeys(us3.payeeInformation.get(4), "34440");
        mySendKeys(us3.payeeInformation.get(5), "5551234545");
        mySendKeys(us3.payeeInformation.get(6), "3344");
        mySendKeys(us3.payeeInformation.get(7), "3344");
        mySendKeys(us3.payeeInformation.get(8), "45");
    }

    @Then("Fill the payee Natural Gas invoice information")
    public void fillThePayeeNaturalGasInvoiceInformation() {
        mySendKeys(us3.payeeInformation.get(0), "IGDAS Dogalgaz Faturasi");
        mySendKeys(us3.payeeInformation.get(1), "Caycı Sk.No:13");
        mySendKeys(us3.payeeInformation.get(2), "Besiktas");
        mySendKeys(us3.payeeInformation.get(3), "Istanbul");
        mySendKeys(us3.payeeInformation.get(4), "34555");
        mySendKeys(us3.payeeInformation.get(5), "5551234545");
        mySendKeys(us3.payeeInformation.get(6), "5656");
        mySendKeys(us3.payeeInformation.get(7), "5656");
        mySendKeys(us3.payeeInformation.get(8), "120");
    }

    @And("Account number Click")
    public void accountNumberClick() {
        myClick(us3.accountNumberCl);
    }

    @Then("Account detail checking Bill Pay")
    public void accountDetailCheckingBillPay() {
        verifyContainsText(us8.accountTypeText, "CHECKING");
        verifyContainsText(us8.noTransactionsText, "No transactions found.");
    }
}
