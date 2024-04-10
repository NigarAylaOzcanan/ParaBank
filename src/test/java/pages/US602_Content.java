package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class US602_Content extends Parent {

    public US602_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath ="//*[text()='Log Out']")
    public WebElement logOutBtn;

    @FindBy(css="[class='error']")
    public WebElement failedMessage;
}
