package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginSteps {
    @Given("I am on Home Page")
    public void iAmOnHomePage() {
            }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I navigate to Login Page")
    public void iNavigateToLoginPage() {

    }

    @And("Verify that {string} message is displayed")
    public void verifyThatMessageIsDisplayed(String welcomeMessage) {
        Assert.assertEquals(new LoginPage().getWelcomeText(), "Welcome, Please Sign In!", "Error");;
    }

    @And("I enter email {string}")
    public void iEnterEmail(String enterEmail) throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().enterEmail(enterEmail);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String enterPassword) throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().enterPassword(enterPassword);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage1) {
        new LoginPage().seeTheErrorMessage(errorMessage1);
    }

    @And("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay() {
        new LoginPage().logoutLinkDisplay();

    }

    @Then("I click on LogOut Link")
    public void iClickOnLogOutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @And("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay() {
        new LoginPage().verifyLoginText("Log in");
    }
}
