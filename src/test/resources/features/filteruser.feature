Feature: filter user
  Background: Navigate to Manage Access
    Given I open website url
    And I login using "admin@yahoo.com" and "admin123"
    Then I click the button Manage Access

    @US1015
    Scenario: I would like to have an option to filter out the user on Manage Access page
      Then I select the Filter All is displayed
        |Firstname|
        |Lastname |
        |Email    |
        |Role     |
        |Batch    |

      Then I Verify if the search can type
      Then I click the button sumit
      Then I Verify the search
      Then I click the button "Show all"
      Then I Verify the search






