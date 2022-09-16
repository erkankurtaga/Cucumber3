Feature: Add-Edit-Delete Document Types under Parameters Setup Feature

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
      | setup      |
      | parameters    |
      | document-types |

  @Regression
  Scenario Outline: Create, Edit, Delete a Document Type
    And Click on the element in the Dialog
      | add |

    And User sending the keys in Dialog content
      | name | <name> |
      | stages-select | <stage> |
      | description | <description> |

    And Click on the element in the Dialog
      | save |

    And Success message should be displayed

    And User Edit item from Dialog
      | searchName | <name> |
      | name | <newName> |
      | stages-select | <newStage> |
      | description | <newDescription> |

    And Click on the element in the Dialog
      | save |

    And Success message should be displayed

    And User Delete item from Dialog
      | <newName> |

    And Success message should be displayed

    Examples:
      | name  | stage       | description |  newName      | newStage             | newDescription  |
      | Exams3 | Examination | Bla Bla Bla |  Student Info2 | Student Registration | Bla Bla Bla ... |

