@Loan @Accounts @Regression
Feature: Credit Application

  Background:
    Given Navigate to Parabank website
    When Enter username and password and click login button

  Scenario: Request Credit
    Given Click on the Element
      | requestLoanBtn |

    And Send text to placeholder
      | loanAmountPlc  | 2000 |
      | downPaymentPlc |  400 |

    And User select the account

    And Click on the Element
      | applyNowBtn |

    Then User should see the has been approved message

    And Click on the Element
      | newAccountIdCl |
    Then Account detail checking and verification

  Scenario: Request Credit (Negative)
    Given Click on the Element
      | requestLoanBtn |

    And Send text to placeholder
      | loanAmountPlc  | 1000000 |
      | downPaymentPlc | 1000    |

    And User select the account

    And Click on the Element
      | applyNowBtn |

    Then User should see the has been denied message
