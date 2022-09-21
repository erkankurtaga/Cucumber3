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

    And Click on the element in the Dialog
      | add |

    And User sending the keys in Dialog content
      | name            | <name>            |
      | ibanInput       | <iban>            |
      | integrationCode | <integrationCode> |

    And Click on the element in the Dialog
      | currencySelect |
      | <currency>     |
      | save           |

    And Success message should be displayed

   And User Edit item from Dialog
     | searchName      | <searchName> |
     | name            | <editName>   |
     | ibanInput       | <editIban>   |
     | integrationCode | <editCode>   |

    And Click on the element in the Dialog
      | currencySelect |
      | <editCurrency> |
      | save           |

    And Success message should be displayed

    And User Delete item from Dialog
      | searchName | <editName> |

    And Click on the element in the Dialog
      | search          |
      | delete          |
      | deleteButtonTwo |

    And Success message should be displayed


    Examples:
      | name | iban           | currency    | integrationCode | searchName | editName | editIban     | editCurrency | editCode  |
      | Zeki | TR347281322046 | currencyEUR | 552347146       | Zeki       | Amine    | TR8765115546 | currencyTRY  | 433216746 |


