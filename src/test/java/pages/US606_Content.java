package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class US606_Content {

    public US606_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[name=\"username\"]")
    public WebElement usernamePlc;

    @FindBy(css = "input[name=\"password\"]")
    public WebElement passwordPlc;

    @FindBy(css = "input[type=\"submit\"]")
    public WebElement loginBtn;

    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFunds;

    @FindBy(css = "tr > td > a")
    public WebElement accountsOverviewAccountNum;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverview;

    @FindBy(css = "input[id=\"amount\"]")
    public WebElement amountPlc;

    @FindBy(css = "input[value=\"Transfer\"]")
    public WebElement transferBtn;

    @FindBy(css = "select[id=\"fromAccountId\"]")
    public WebElement fromAccountSlc;

    @FindBy(css = "select[id=\"toAccountId\"]")
    public WebElement toAccountSlc;

    @FindBy(xpath = "//h1[contains(text(), \"Transfer Complete\")]")
    public WebElement transferCompleteMessage;

    @FindBy(css = "tr[ng-repeat=\"transaction in transactions\"]:nth-child(1) td")
    public List<WebElement> transactionHistory;


    public WebElement getWebElement(String e) {
        switch (e) {
            case "transferFunds":
                return this.transferFunds;
            case "accountNum":
                return this.accountsOverviewAccountNum;
            case "accountsOverview":
                return this.accountsOverview;
            case "amountPlc":
                return this.amountPlc;
            case "transferBtn":
                return this.transferBtn;
            case "fromAccountSlc":
                return this.fromAccountSlc;
            case "toAccountSlc":
                return this.toAccountSlc;
            case "transferCompleteMessage":
                return this.transferCompleteMessage;
        }
        return null;
    }


}
