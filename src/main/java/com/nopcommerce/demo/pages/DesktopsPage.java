package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(css ="body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
    WebElement elementBuildYourOwnComputer;

    @CacheLookup
    @FindBy(css ="div[class='page-title'] h1")
    WebElement elementDesktopsText;
    public void clickOnBuildYourOwnComputerTab(String buildYourOwn1){
        clickOnElement(elementBuildYourOwnComputer);
    }

    public String verifyDifferentText(){
        return getTextFromElement(elementDesktopsText);
    }
}
