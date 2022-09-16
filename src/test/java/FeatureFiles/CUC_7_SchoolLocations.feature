Feature:  School Locations Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression
  Scenario Outline: Add, Edit and Delete School Locations

    And Click on the element in the left Nav
      | setup        |
      | school-setup |
      | locations    |

    And Click on the element in the Dialog
      | add |

    And User sending the keys in Dialog content
      | name          | <name>      |
      | shortName     | <shortName> |
      | capacityInput | <capacity>  |

    And Click on the element in the Dialog
      | locationType |
      | <locOption>  |
      | <deActive>   |
      | saveButton   |

    And Success message should be displayed

    And Click on the element in the Dialog
      | edit |

    And User sending the keys in Dialog content
      | name          | <newName>      |
      | shortName     | <newShortName> |
      | capacityInput | <newCapacity>  |

    And Click on the element in the Dialog
      | locationType   |
      | <newLocOption> |
      | <NewDeActive>  |
      | saveButton     |

    And Success message should be displayed

    And Click on the element in the Dialog
      | delete     |
      | deleteLast |

    And Success message should be displayed

    Examples:
      | name    | shortName | locOption  | capacity | deActive | newName | newShortName | newCapacity | newLocOption | NewDeActive |
      | Bornova | BRV       | Laboratory | 150      | deActive | Konak   | KNK          | 200         | Classroom    | deActive    |



# locationOption : Classroom , Laboratory , Other