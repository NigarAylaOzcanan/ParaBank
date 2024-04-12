Feature: Login functionality

  Background:
    Given Navigate to Parabank website
  @SmokeTest @Regression
  Scenario: Valid username and password combination

    When Enter username is "Newton" password as "Qx6YXX"
    And Enter log out button
  @SmokeTest @Regression
  Scenario: Invalid username and password combination

    When Enter username is "" password as "123654"
    Then Failed message should be displayed


