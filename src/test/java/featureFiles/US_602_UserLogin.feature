@Smoke @Regression
Feature: Login functionality

  Background:
    Given Navigate to Parabank website

  Scenario: Valid username and password combination
    When Enter username and password and click login button
    And Enter log out button

  Scenario: Invalid username and password combination
    When Enter username as "" password as "123654"
    Then Failed message should be displayed


