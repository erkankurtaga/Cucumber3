Feature:  School Locations Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Add, Edit and Delete School Locations

    And Click on the element in the left Nav
      | setup        |
      | school-setup |
      | locations    |

    And Click on the element in the Dialog Content
      | add |

    And User sending the keys in Dialog Content
      | name          | <name>      |
      | shortName     | <shortName> |
      | capacityInput | <capacity>  |

    And Click on the element in the Dialog Content
      | locationType |
      | <locOption>  |
      | <deActive>   |
      | saveButton   |

    And Success message should be displayed

    And Click on the element in the Dialog Content
      | edit |

    And User sending the keys in Dialog Content
      | name          | <newName>      |
      | shortName     | <newShortName> |
      | capacityInput | <newCapacity>  |

    And Click on the element in the Dialog Content
      | locationType   |
      | <newLocOption> |
      | <NewDeActive>  |
      | saveButton     |

    And Success message should be displayed

    And Delete on the element in the Dialog Content
      | delete     |
      | deleteLast |

    And Success message should be displayed

    Examples:
      | name    | shortName | locOption  | capacity | deActive | newName | newShortName | newCapacity | newLocOption | NewDeActive |
      | Bornova | BRV       | Laboratory | 150      | deActive | Konak   | KNK          | 200         | Classroom    | deActive    |



# locationOption : Classroom , Laboratory , Other