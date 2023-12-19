package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    @Given("I am on register page")
    public void iAmOnRegisterPage() {
    }

    @When("I click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I can verify {string} text")
    public void iCanVerifyText(String verifyRegisterText) {
        new RegisterPage().verifyRegisterText1(verifyRegisterText);
    }

    @Then("Verify the error message {string}")
    public void verifyTheErrorMessage(String errorMessage3) {
        new RegisterPage().verifyErrorMessage(errorMessage3);
    }

    @And("Select gender {string}")
    public void selectGender(String gender) {
        new RegisterPage().selectGender1(gender);
    }

    @And("Enter firstname {string}")
    public void enterFirstname(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("Enter lastname {string}")
    public void enterLastname(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("Select day {string}")
    public void selectDay(String day) {
        new RegisterPage().enterDayOfBirth(day);
    }

    @And("Select month {string}")
    public void selectMonth(String month) {
        new RegisterPage().enterMonthOfBirth(month);
    }

    @And("Select year {string}")
    public void selectYear(String year) {
        new RegisterPage().enterYearOfBirth(year);
    }

    @And("Enter email {string}")
    public void enterEmail(String email) {
        new RegisterPage().enterEmailaddress(email);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        new RegisterPage().enterPasswordDetails(password);
    }

    @And("Enter Confirm Password {string}")
    public void enterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPasswordDetails(confirmPassword);
    }



    @Then("Verify message {string}")
    public void verifyMessage(String registrationSuccessfulText) {
        new RegisterPage().verifyRegisterSuccessful(registrationSuccessfulText);
    }

    @And("Click on Register button")
    public void clickOnRegisterButton() {
        new RegisterPage().clickOnRegiButton();
    }
}
