package stepDefinitions;

import browser.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

import static pages.LoginPage.loginButton;

public class Login extends Driver {
    HomePage homeObject;
    LoginPage loginObject;
    ContractsPage contractsPage = new ContractsPage(driver);
    InterestPage interestPage = new InterestPage(driver);
    RequirementPage requirementPage = new RequirementPage(driver);
    InvitationsPage invitationsPage = new InvitationsPage(driver);
    Faker fakeData = new Faker();
    String email = fakeData.internet().emailAddress();

    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I go to login")
    public void iClickOnLogin() {
        homeObject = new HomePage(driver);
        homeObject.openLoginPage();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }

    @And("I have entered login data")
    public void iHaveEnteredLoginData() {
        loginObject = new LoginPage(driver);
        loginObject.userLogin("steffen.glomb@posteo.de", "Hallo123");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        loginButton.click();
    }

    @Then("I should see {string} inside the Verträge tab")
    public void iShouldSee(String message) {
        Assert.assertEquals(contractsPage.tabContractsMessage(), message);
    }


    @Then("Pension income should be over {int} Euro")
    public void deinRenteneinkommenShuldBeOver(int income) {
        Assert.assertEquals(interestPage.retirementIncome(), income);
    }

    @Then("I should see {string} in the left column")
    public void iShouldSeeInTheLeftColumn(String message) {
        Assert.assertEquals(requirementPage.tabRequirementMessage(), message);
    }

    @And("Recommend Clark by mail")
    public void recommendClarkByMail() {
        System.out.println(email);
        invitationsPage.inviteByMail(email);
    }

    @Then("I should see {string} after invitation")
    public void iShouldSeeAfterInvitation(String message) {
        Assert.assertEquals(invitationsPage.successMessage(),message);
    }
}