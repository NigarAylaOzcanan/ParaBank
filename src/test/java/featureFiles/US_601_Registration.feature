@Accounts @Smoke
Feature: Registration

  Background:
    Given Navigate to Parabank website

  Scenario:
    When Click on the Register button
    Then Fill the registration information
    And Click on the Register Submit button
    And User should see the success message
