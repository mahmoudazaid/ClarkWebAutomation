package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvitationsPage extends PageBase {
    public InvitationsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(id="sendInvitationEmail")
    WebElement sendInvitationMail;

    @FindBy(xpath = "//div[@class='success-text']")
    WebElement successMessage;

    public void inviteByMail(String email){
        typeText(emailField,email);
        clickButton(sendInvitationMail);
    }

    public String successMessage(){
        return successMessage.getText();
    }
}
