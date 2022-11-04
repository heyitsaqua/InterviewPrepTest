Feature: Reset search filter option
  Background: Navigate to Manage Access
    Given I open website url
    And I login using "admin@yahoo.com" and "admin123"
    Then I click the button Manage Access


    @1017
    Scenario: There should be a "show all" button that will reset the view and display all the user fron the filtered view
    Then I verify the button is displayed "Show all"
      And I click the button sumit
      Then I click the button "Show all"