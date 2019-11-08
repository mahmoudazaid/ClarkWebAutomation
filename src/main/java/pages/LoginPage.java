package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user_email")
    WebElement emailField;

    @FindBy(id = "user_password")
    WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    public static WebElement loginButton;

    public void userLogin (String email, String password){
        typeText(emailField,email);
        typeText(passwordField,password);
    }
}
