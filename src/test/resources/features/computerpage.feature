@regression
Feature:Computer page functionality

@regression
Scenario: VerifyUserShouldNavigateToComputerPageSuccessfully
Given  I am on Home Page
When   I click on Computer tab
Then   I Verify "Computers" text
@regression
Scenario: VerifyUserShouldNavigateToDesktopsPageSuccessfully
Given  I am on Home Page
When   I click on Computer tab
And    I click on Desktops link
Then   I Verify "Desktops" text
@regression @sanity
Scenario Outline: VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
Given  I am on Home Page
When   I click on Computer tab
And    I click on Desktops link
And    I click on product name "Build your own computer"
And    Select processor "<processor>"
And    Select RAM "<ram>"
And    Select HDD "<hdd>"
And    Select OS "<os>"
And    Select Software "<software>"
And    Click on "ADD TO CART" Button
Then   I Verify "The product has been added to your shopping cart"

Examples:
| processor | ram | hdd | os | software |
| 2.2 GHz Intel Pentium Dual-Core E2200 | 2 GB | 320 GB | Vista Home [+$50.00] | Microsoft Office [+$50.00] |
| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00] |
| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB | Vista Home [+$50.00] | Total Commander [+$5.00]               |