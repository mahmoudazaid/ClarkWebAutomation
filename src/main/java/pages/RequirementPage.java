package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequirementPage extends PageBase {
    public RequirementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='ember236']//section[1]//section[1]//h1[1]")
    WebElement tabRequirementMessage;

    public String tabRequirementMessage() {
        waitUntilElementDisplayed(tabRequirementMessage, 20);
        return tabRequirementMessage.getText();
    }
}
