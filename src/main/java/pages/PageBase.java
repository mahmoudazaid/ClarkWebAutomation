package pages;

import browser.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    protected WebDriver driver;

    //Create Constructor
    public  PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button){
        waitUntilElementDisplayed(button,20);
        scrollIntoView(button);
        button.click();
    }

    protected static void typeText(WebElement textBox, String text){
        waitUntilElementDisplayed(textBox,20);
        scrollIntoView(textBox);
        textBox.clear();
        textBox.sendKeys(text);
    }

    public static void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) Driver.driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void waitUntilElementDisplayed(WebElement locator,int timeoutInSeconds){
        new WebDriverWait(Driver.driver, timeoutInSeconds).until(ExpectedConditions.visibilityOf(locator));
    }
}
