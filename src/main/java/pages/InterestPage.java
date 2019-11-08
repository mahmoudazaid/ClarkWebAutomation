package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterestPage extends PageBase {
    public InterestPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//dd[@class='_actual-income__value_1aoxqn _value_1aoxqn _flex-item_1aoxqn']")
    WebElement retirementIncome;

    public String retirementIncome(){
        waitUntilElementDisplayed(retirementIncome,20);
        return retirementIncome.getText();
    }
}
