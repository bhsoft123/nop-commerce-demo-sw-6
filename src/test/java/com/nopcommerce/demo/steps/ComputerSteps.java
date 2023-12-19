package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerSteps {

    @When("I click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputersTab();
            }

    @Then("I Verify {string} text")
    public void iVerifyText(String verifyText) {
        String computersText = new ComputerPage().verifyDifferentText1();
    }
    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsTab();
    }

    @And("I click on product name {string}")
    public void iClickOnProductName(String buildYourOwn ) {
        new DesktopsPage().clickOnBuildYourOwnComputerTab(buildYourOwn);
    }

    @And("Select processor {string}")
    public void selectProcessor(String selectProcessorMenu) {
        new BuildYourOwnComputerPage().sendProcessorName(selectProcessorMenu);
    }

    @And("Select RAM {string}")
    public void selectRAM(String selectRAMMenu) {
        new BuildYourOwnComputerPage().sendRAMName(selectRAMMenu);
    }

    @And("Select HDD {string}")
    public void selectHDD(String selectHDDMenu) {
        new BuildYourOwnComputerPage().sendHDDName(selectHDDMenu);
    }

    @And("Select OS {string}")
    public void selectOS(String selectOSMenu) {
        new BuildYourOwnComputerPage().sendOSName(selectOSMenu);
    }

    @And("Select Software {string}")
    public void selectSoftware(String selectSoftwareMenu) {
        new BuildYourOwnComputerPage().sendSoftwareName(selectSoftwareMenu);
    }

    @And("Click on {string} Button")
    public void clickOnButton(String addToCartButton) {
        new BuildYourOwnComputerPage().selectAddToCartButton(addToCartButton);
    }

    @Then("I Verify {string}")
    public void iVerify(String verifyProductSelectionMessage) {
        new BuildYourOwnComputerPage().verifyProductSelectedMessage(verifyProductSelectionMessage);
    }
}
