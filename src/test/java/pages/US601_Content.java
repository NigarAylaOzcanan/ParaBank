package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.HashMap;
import java.util.List;

public class US601_Content {

    public US601_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerBtn;
    @FindBy(css = "tbody > tr input")
    public List<WebElement> customerForm;
    @FindBy(xpath = "//p[contains(text(),\"success\")]")
    public WebElement successMessage;
    @FindBy(xpath = "//span[contains(text(),\"already exists\")]")
    public WebElement usernameExistMessage;

}
