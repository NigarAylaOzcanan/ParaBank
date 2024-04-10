Feature: Login functionality

  Background:
    Given Navigate to Parabank website

  Scenario: Valid username and password combination
    When Enter username is "weagfdg" password as "T4rg8H!Kp6i7b"
    And Enter log out button

  Scenario: Invalid username and password combination
    When Enter username is "" password as "123654"
    Then Failed message should be displayed


