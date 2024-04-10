package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class US604_Content extends Parent {
    public US604_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Open New Account')]") public WebElement openNewAccount;
    @FindBy(xpath = "//select[@id='type']") public WebElement selectAccountType;
    @FindBy(xpath = "//*[contains(text(),'Please choose an existing account to transfer funds')]") public WebElement warningMessage;
    @FindBy(xpath = "//select[@id='fromAccountId']") public WebElement selectAccount;
    @FindBy(xpath = "//input[@class='button']") public WebElement getOpenNewAccountButton;
    @FindBy(xpath = "//div[@class='ng-scope']//p") public WebElement successMsg;
    @FindBy(xpath = "//div[@id='rightPanel']//a[@id='newAccountId']") public WebElement newAccountId;

}

