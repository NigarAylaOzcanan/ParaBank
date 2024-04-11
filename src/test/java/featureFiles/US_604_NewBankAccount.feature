@Accounts @Smoke @Regression
Feature: Futures and Demand Accounts Creation

  Background:
    Given Navigate to Parabank website
    Then Enter username and password and click login button

  Scenario Outline: Open a Bank Account With Minimum Balance

    When Click on the Element in Content
      | openNewAccount |
    And The user is directed to the bank account creating page

    And The user selects the account type as "<accountType>" from the Drop-Down menu

    And The user sees a warning that the new bank account should have a minimum balance

    And The user selects the account of <index> from the Drop-Down menu

    And Click on the Element in Content
      | openNewAccountButton |
    Then The user confirms the successful creation of the new bank account

    Examples:
      | accountType | index |
      | CHECKING    | 0     |
      | SAVINGS     | 1     |