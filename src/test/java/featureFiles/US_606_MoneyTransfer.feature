Feature: Money Transfer Between Accounts

  Background:
    Given Navigate to Parabank website
    Then Enter username and password and click login button

  Scenario:
    Then Click on the Element in Dialog
      | transferFunds |

    And Click on the Element in Dialog
      | accountsOverview |

    Then Click on the Element in Dialog
      | transferFunds |

    And User sending the keys in Dialog
      | amountPlc | 50 |

    And Click on the Element in Dialog
      | transferBtn |

    And User should see the transfer complete message

    Then Click on the Element in Dialog
      | accountsOverview |

    And Click on the Element in Dialog
      | account_18117 |

    And User should see transfer sent and debit amount
