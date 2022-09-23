Feature: Positions Functionality

  Background: :
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Add Positions Categories

    Given Click on the element in the left Nav
      | human-resources |
      | human-setup    |
      | positions |

    When  Click on the element in the Dialog
      | add |

    And User sending the keys in Dialog content
      | nameInput      | Nazal |
      | shortNameInput | zeki |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

  Scenario: Edit Positions Categories

    Given Click on the element in the left Nav
      | human-resources |
      | human-setup    |
      | positions |

    When User searches for the desired item in the Dialog Content
      | searchName | Nazal |

    And Click on the element in the Dialog
      | search |
      | edit   |

    And User sending the keys in Dialog content
      | nameInput | Zekerie |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

  Scenario: Delete Positions Categories
    Given Click on the element in the left Nav
      | human-resources |
      | human-setup    |
      | positions |

    When User searches for the desired item in the Dialog Content
      | searchName | Zekerie |

    And Click on the element in the Dialog
      | search        |
      | delete        |
      | deleteLast |

    Then Success message should be displayed