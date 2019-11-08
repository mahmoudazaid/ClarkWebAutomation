package extensions;

import browser.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementExtensions {

    public static WebElement InspectElement (By by){
        WebElement element = Driver.driver.findElement(by);
        return element;
    }

    public static WebElement typeText (By by){
        WebElement element = Driver.driver.findElement(by);
        return element;
    }

    public static void waitElementToBeLoaded(By element,int timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(Driver.driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
