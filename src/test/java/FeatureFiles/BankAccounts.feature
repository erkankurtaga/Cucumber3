Feature: Bank Accounts Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create Bank Accounts
    And Click on the element in the left Nav
      | setup        |
      | parameters   |
      | bankAccounts |

    And Click on the element in the Add Bank Account
      | addButton |

    And User new Bank Account item from in the Dialog
      | nameInput       | <name>            |
      | ibanInput       | <iban>            |
      | integrationCode | <integrationCode> |

    And Click on the element in the Add Bank Account
      | currencySelect |
      | <currency>     |
      | saveButton     |

   And Success massage should be displayed

   And User new Bank Account item from in the Dialog
     | searchNameInput | <searchName> |

   And Click on the element in the Add Bank Account
     | search     |
     | editButton |

    And User new Bank Account item from in the Dialog
      | nameInput       | <editName> |
      | ibanInput       | <editIban> |
      | integrationCode | <editCode> |

    And Click on the element in the Add Bank Account
      | currencySelect |
      | <editCurrency> |
      | saveButton     |

    And Success massage should be displayed

    And User delete item from Dialog
    |searchNameInput| <editName> |

    And Click on the element in the Add Bank Account
      | search          |
      | delete          |
      | deleteButtonTwo |

    And Success massage should be displayed


    Examples:
      | name | iban           | currency    | integrationCode | searchName | editName | editIban     | editCurrency | editCode  |
      | Zeki | TR347281322046 | currencyEUR | 552347146       | Zeki       | Amine    | TR8765115546 | currencyTRY  | 433216746 |


