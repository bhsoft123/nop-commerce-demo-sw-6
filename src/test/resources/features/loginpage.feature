@regression
Feature: Login Feature
  As a user, I am able to login successfully

  @regression
  Scenario:  UserShouldNavigateToLoginPageSuccessFully.
    Given I am on Home Page
    When  I click on login link
    Then  I navigate to Login Page
    And   Verify that "Welcome, Please Sign In!" message is displayed
  @regression
  Scenario Outline: VerifyTheErrorMessageWithInValidCredentials.
    Given I am on Home Page
    When  I click on login link
    And   I enter email "<email>"
    And   I enter password "<password>"
    And   I click on login button
    Then  I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                               |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  @regression
  Scenario: VerifyThatUserShouldLogInSuccessFullyWithValidCredentials.
    Given I am on Home Page
    When  I click on login link
    And   I enter email "olivergreen123@gmail.com"
    And   I enter password "Oliver@green"
    And   I click on login button
    And   Verify that LogOut link is display

@regression
  Scenario: VerifyThatUserShouldLogOutSuccessFully
    Given I am on Home Page
    When  I click on login link
    And   I enter email "olivergreen123@gmail.com"
    And   I enter password "Oliver@green"
    And   I click on login button
    Then  I click on LogOut Link
    And   Verify that LogIn Link Display
