Feature: Checking Account Creation

  Background:
    Given Navigate to Parabank website
    When Click on the Register button
    Then Fill the registration information
    And Click on the Register Submit button
    And User should see the success message

  Scenario Outline:  Open a New Bank Account With Minimum Balance
    When From the menu on the website, click the "Open New Account" link
    And The user is directed to the bank account creating page
    And The user selects the account  type from the Drop-Down menu as "<Account>"
    And The user sees a warning that the new bank account should have a minimum balance
    And The user selects the account from the Drop-Down menu
    And The user clicks the on "Open New Account" button
    Then The user confirms the successful creation of the new bank account

    Examples:
      | Account  | min Balance Account |
      | Checking |                     |
      | Saving   |                     |

