Feature: Add a new dashboard

  Background: Navigate to home page
    Given I open website url
    And I login using "admin@yahoo.com" and "admin123"

  @US1012
    Scenario: Add a new dashboard  and user should be able to see it
      Then Create a New dashboard
      And I click the button "+ Add"
      Then Verify is the new dashboard is created





