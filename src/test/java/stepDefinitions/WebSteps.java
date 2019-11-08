package stepDefinitions;

import browser.Driver;
import extensions.ElementExtensions;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import parser.ElementParser;

import java.io.IOException;

import static pages.PageBase.scrollIntoView;

public class WebSteps extends Driver {
    ElementParser parser = new ElementParser("Profile.json");

    public WebSteps() throws IOException, ParseException {
    }
    @When("I click on the {string} tab")
    public void iClickOnTheTab(String tabName) throws IOException, ParseException {
        try {
            By tabElement = parser.getElementDetails(tabName);
            ElementExtensions.waitElementToBeLoaded(tabElement,20);
            WebElement tab = ElementExtensions.InspectElement(tabElement);
            tab.click();

            By closePopUp = parser.getElementDetails("close");
            ElementExtensions.waitElementToBeLoaded(closePopUp,20);
            WebElement closeButton = ElementExtensions.InspectElement(closePopUp);
            closeButton.click();
        }catch (Exception e){
            System.out.println("Popup didn't displayed" + e);
        }

    }

    @When("I click on Clark {string} link")
    public void iClickOnClark(String _link) throws IOException, ParseException {
        By linkElement = parser.getElementDetails(_link);
        ElementExtensions.waitElementToBeLoaded(linkElement,20);
        WebElement link = ElementExtensions.InspectElement(linkElement);
        scrollIntoView(link);
        link.click();
    }
}
