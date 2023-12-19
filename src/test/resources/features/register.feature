@regression
Feature: As a user, I should be able to register successfully

@regression
  Scenario: VerifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on Home Page
    When I click on Register Link
    Then I can verify "Register" text

@regression
Scenario Outline: VerifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
Given I am on Home Page
When  I click on Register Link
And   Click on Register button
Then  Verify the error message "<errorMessage>"
  Examples:
                | errorMessage          |
                |First name is required. |
                |Last name is required.  |
                |Email is required.      |
                |Password is required.   |
                |Password is required.   |

@regression
Scenario: VerifyThatUserShouldCreateAccountSuccessfully
Given I am on Home Page
When  I click on Register Link
And   Select gender "Female"
And   Enter firstname "Oliver"
And   Enter lastname "Green"
And   Select day "1"
And   Select month "January"
And   Select year "1990"
And   Enter email "olivergreen123@gmail.com"
And   Enter password "Oliver@green"
And   Enter Confirm Password "Oliver@green"
And   Click on Register button
Then  Verify message "Your registration completed"

