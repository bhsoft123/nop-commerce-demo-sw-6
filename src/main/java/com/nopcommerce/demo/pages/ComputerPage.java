package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {


    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement elementComputersText;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement elementDesktops;

    @CacheLookup
    @FindBy(css ="body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
    WebElement elementBuildYourOwnComputer;



    public String verifyDifferentText1(){
            return getTextFromElement(elementComputersText);
           }
    public void clickOnDesktopsTab(){
        clickOnElement(elementDesktops);
        log.info("click on desktops : " );
    }
    public void clickOnBuildYourOwnComputerTab(){
        clickOnElement(elementBuildYourOwnComputer);
    }
}
