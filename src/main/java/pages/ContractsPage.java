package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractsPage extends PageBase {
    public ContractsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[@class='_score-text--large_wckp6k']")
    WebElement tabContractsMessage;





    public String tabContractsMessage(){
        waitUntilElementDisplayed(tabContractsMessage,20);
        return tabContractsMessage.getText();
    }




}
