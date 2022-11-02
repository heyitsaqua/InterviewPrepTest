Feature: Add new user form

  Background: Navigate to Manage Access
    Given I open website url
    And I login using "admin@yahoo.com" and "admin123"
    Then I click the button Manage Access


    @US1013a
    Scenario: Admin should see a form in Manage Access
      Then Verify following inputs fields are Displayed
      | First Name |
      | Last Name  |
      | E-mail     |
      Then Verify is "Role" is displayed
      Then Verify is "Batch" is displayed2

    @US1013b
    Scenario: Admin should have an option to add new user and it should be display on the table
      Then I fill out user registration form:
        | First Name | Jhon |
        | Last Name  | Wick |
        | E-mail     |j.wick@contractor.gov |
      Then select role and bacth
      |Role | Student |
      |Batch | 1      |
      And I click the button "Add User"
      Then Verify the new user is display on the table








