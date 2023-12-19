package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(css =".ico-register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(css ="div[class='page-title'] h1")
    WebElement verifyRegisterText;

    @CacheLookup
    @FindBy(id ="gender-female")
    WebElement elementFemale;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement elementMale;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement elementFirstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement elementLastName;
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void verifyRegisterText1(String registerText){
        Assert.assertEquals(getTextFromElement(verifyRegisterText), registerText,"Error" );

    }
    public void selectGender1(String gender1){
        if(gender1.equalsIgnoreCase("Female")){
            clickOnElement(elementFemale);
        } else {   clickOnElement(elementMale);
        }
    }
    public void enterFirstName(String firstName1){
        sendTextToElement(elementFirstName, firstName1);
    }
    public void enterLastName(String lastName1){
        sendTextToElement(elementLastName, lastName1);
    }

    @CacheLookup
    @FindBy(name ="DateOfBirthDay")
    WebElement elementDay;
    @CacheLookup
    @FindBy(name ="DateOfBirthMonth")
    WebElement elementMonth;
    @CacheLookup
    @FindBy(name ="DateOfBirthYear")
    WebElement elementYear;

    public void enterDayOfBirth(String day1){        selectByVisibleTextFromDropDown(elementDay, day1);
    }

    public void enterMonthOfBirth(String month1){
        selectByVisibleTextFromDropDown(elementMonth, month1);
    }
    public void enterYearOfBirth(String year1){
        selectByVisibleTextFromDropDown(elementYear, year1);
    }
    @CacheLookup
    @FindBy(id ="Email")
    WebElement elementEmail;
    @CacheLookup
    @FindBy(id="Password")
    WebElement elementPassword;
    @CacheLookup
    @FindBy(id ="ConfirmPassword")
    WebElement elementConfirmPassword;

    public void enterEmailaddress(String email1){
        sendTextToElement(elementEmail, email1);
    }

    public void enterPasswordDetails(String password1){
        sendTextToElement(elementPassword, password1);
    }
    public void enterConfirmPasswordDetails(String confirmPassword1){
        sendTextToElement(elementConfirmPassword, confirmPassword1);
    }
    @CacheLookup
    @FindBy(id ="register-button")
    WebElement elementRegisterButton;
    @CacheLookup
    @FindBy(css =".result")
    WebElement elementSuccessMessgage;

    public void clickOnRegiButton(){
        clickOnElement(elementRegisterButton);
    }

    public void verifyRegisterSuccessful(String registrationSuccessfulText1){
        Assert.assertEquals(getTextFromElement(elementSuccessMessgage), registrationSuccessfulText1, "Error");
    }
    @CacheLookup
    @FindBy(id ="FirstName-error")
    WebElement elementFirstNameText;
    @CacheLookup
    @FindBy(id ="LastName-error")
    WebElement elementLastNameText;
    @CacheLookup
    @FindBy(id ="Email-error")
    WebElement elementEmailText;
    @CacheLookup
    @FindBy(id ="Password-error")
    WebElement elementPasswordText;
    @CacheLookup
    @FindBy(id ="ConfirmPassword-error")
    WebElement elementConfirmPasswordText;
    public void verifyErrorMessage(String errorMessage1){
        if(errorMessage1.contains("First name")){
            Assert.assertEquals(getTextFromElement(elementFirstNameText), errorMessage1, "Error");
        } else if (errorMessage1.contains("Last name")) {
            Assert.assertEquals(getTextFromElement(elementLastNameText), errorMessage1, "Error");
        }else if (errorMessage1.contains("Email"))  {
            Assert.assertEquals(getTextFromElement(elementEmailText), errorMessage1, "Error");
        } else if (errorMessage1.contains("Password")){
             Assert.assertEquals(getTextFromElement(elementPasswordText), errorMessage1, "Error");
        }else {
            Assert.assertEquals(getTextFromElement(elementConfirmPasswordText), errorMessage1, "Error");
        }
    }
}
