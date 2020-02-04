Feature: Create PositionSalary
  Scenario:  PositionSalary creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on human resources on top
    And Click on setup
    And Click on position salary
    And Click on plus icon
    And Type in new position salary "asdfzxcv"
    When Click on save button
    Then "asdfzxcv" should be displayed
    Then Remove the data "asdfzxcv"
    Then Verify data is removed "asdfzxcv"
