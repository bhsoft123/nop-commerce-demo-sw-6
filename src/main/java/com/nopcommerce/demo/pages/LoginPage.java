package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-links']//li//a[normalize-space()='Log out']")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(css =".ico-login")
    WebElement logInLink;

    public void verifyLoginText(String loginDisplay){
        String messg = getTextFromElement(logInLink);
        Assert.assertEquals(messg, loginDisplay, "Error");

    }
    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("email : " + welcomeText.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("password : " + welcomeText.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("login button : " + welcomeText.toString());
    }

    public void seeTheErrorMessage(String expectedErrorMessage) {
        log.info("error message : " + welcomeText.toString());
        Assert.assertEquals(getTextFromElement(errorMessage), expectedErrorMessage, "Error"); getTextFromElement(errorMessage);

    }

//    public void loginToApplication(String email, String password) {
//        enterEmailId(email);
//        enterPassword(password);
//        clickOnLoginButton();
//        log.info("logintoApplication : " + welcomeText.toString());
//    }

    public void logoutLinkDisplay(){
        Assert.assertEquals(getTextFromElement(logoutLink), "Log out","Error");
    }
    public void clickOnLogOutLink() {
        clickOnElement(logout);
        log.info("logout : " + welcomeText.toString());
    }

}