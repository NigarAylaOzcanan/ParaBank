package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;



public class US608_Content extends Parent {
    public US608_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanBtn;

    @FindBy(id = "amount")
    public WebElement loanAmountPlc;

    @FindBy(id = "downPayment")
    public WebElement downPaymentPlc;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccountSlct;

    @FindBy(css = "[type='submit']")
    public WebElement applyNowBtn;

    @FindBy(xpath = "//*[contains(text(),'Congratulations')]")
    public WebElement textApproved;

    @FindBy(css = "[id='newAccountId']")
    public WebElement newAccountIdCl;

    @FindBy(id = "accountType")
    public WebElement accountTypeText;

    @FindBy(id = "availableBalance")
    public WebElement accountAvailableBalanceText;

    @FindBy(id = "balance")
    public WebElement accountBalanceText;

    @FindBy(xpath = "//p[@class='ng-scope']")
    public WebElement noTransactionsText;

    @FindBy(css = "[class='error ng-scope']")
    public WebElement textDenied;


    public WebElement getWebElement(String elements) {
        switch (elements) {
            case "requestLoanBtn":
                return this.requestLoanBtn;
            case "loanAmountPlc":
                return this.loanAmountPlc;
            case "downPaymentPlc":
                return this.downPaymentPlc;
            case "fromAccountSlct":
                return this.fromAccountSlct;
            case "applyNowBtn":
                return this.applyNowBtn;
            case "textApproved":
                return this.textApproved;
            case "newAccountIdCl":
                return this.newAccountIdCl;
            case "noTransactionsText":
                return this.noTransactionsText;
            case "textDenied":
                return this.textDenied;
        }
        return null;
    }
}
