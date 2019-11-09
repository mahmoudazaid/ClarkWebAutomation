package runner;

import browser.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.ITestResult;
import org.testng.annotations.*;

import static browser.Driver.driver;

public class Hooks extends AbstractTestNGCucumberTests {
    static String browserName = "Chrome";

    @BeforeSuite
    public static void openBrowser() {
        Driver.openBrowser();
    }

    @AfterSuite
    public void closeBrowser() {
        Driver.CloseBrowser();
    }

    @AfterMethod
    public void screenShotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed");
            System.out.println("Taking screenshot...");
            utilities.Screenshot.captureScreenshot(driver, result.getName());
        }
    }
}
