Feature: Update the user info
  Background: Navigate to Manage Access
    Given I open website url
    And I login using "admin@yahoo.com" and "admin123"
    Then I click the button Manage Access
    Then I click the button "Action"

  @US1016
    Scenario: Each user on Manage Access page should have following option Edit
    Then I click the button "Edit"
    Then I clear "First Name"
    Then I edit "First Name"
    Then I click the button "Update User"
    Then I Verify if the First Name is update

    @1016b
    Scenario: Each user on Manage Access page should have following option Delete
      Then I click the button "Delete"
     Then I click the button "Cancel"
      Then I click the button "Action"
      Then I click the button "Delete"
      
      @1016c
      Scenario: Each user on Manage Acces page should have the following option Reset Password
        Then I verify the button is displayed "Reset Password"






    