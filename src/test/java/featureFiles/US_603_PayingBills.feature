@Payment @Smoke
Feature: Bill Payment Functionality

  Background:
    Given Navigate to Parabank website
    When Enter username and password and click login button

  Scenario: Electric Bill Payment
    When Click on the Bill Pay Button
    Then Fill the payee Electric information
    And Click on the Send Payment button
    Then User should see the success message Bill Payment
    And Click on the Accounts Overview button
    And Account number Click
    Then Account detail checking Bill Pay


  Scenario: Water Bill Payment
    When Click on the Bill Pay Button
    Then Fill the payee Water information
    And Click on the Send Payment button
    Then User should see the success message Bill Payment
    And Click on the Accounts Overview button
    And Account number Click
    Then Account detail checking Bill Pay


  Scenario: Natural Gas Invoice Payment
    When Click on the Bill Pay Button
    Then Fill the payee Natural Gas invoice information
    And Click on the Send Payment button
    Then User should see the success message Bill Payment
    And Click on the Accounts Overview button
    And Account number Click
    Then Account detail checking Bill Pay