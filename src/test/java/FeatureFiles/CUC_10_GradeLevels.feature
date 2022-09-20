Feature:CUC-10 Grade Levels Functionality

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression
  Scenario:Add Grade Levels
    When Click on the element in the left Nav
      | setup       |
      | parameters  |
      | grade-levels |

    Then user add Grade Levels
    And Success message should be displayed

    Then user edit Grade Levels
    And Success message should be displayed

    Then user delete Grade Levels
    And Success message should be displayed
