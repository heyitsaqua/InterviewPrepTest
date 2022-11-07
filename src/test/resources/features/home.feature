Feature: Home page tests

  Background: Open Home Page
    Given I open website url


  @US2000
  Scenario:  Test header of the home page
    When I login using "test@yahoo.com" and "test123"
    Then Verify header text is "Interview Prep"

  @US2001
  Scenario: Verify buttons is displayed
    When I login using "test@yahoo.com" and "test123"
    Then Verify button "Sign out" is displayed
    Then Verify button "Manage Access" is not displayed

  @US2002
  Scenario: Verify Dashboards is present
    When I login using "test@yahoo.com" and "test123"
    Then Verify "All Topics" is displayed
    Then Verify "Coding" is displayed
    Then Verify "Soft skills" is displayed

  @US2010
  Scenario: Verify button Manage Access is displayed
    When I login using "admin@yahoo.com" and "admin123"
    Then Verify button "Manage Access" is displayed

  @US1004c
  Scenario: Testing do section does not add statement with symbols
    When I login using "test@yahoo.com" and "test123"
    And Add a do statement "team 5 do statement!!!@#$%^"
    Then Verify "team 5 do statement!!!@#$%^" statement is not displayed

  @US1004d
  Scenario: Testing dont section does not add statement with symbols
    When I login using "test@yahoo.com" and "test123"
    And Add a dont statement "team 5 dont statement!!!@#$%^"
    Then Verify "team 5 dont statement!!!@#$%^" statement is not displayed

  @US1005a
  Scenario: Testing ability to add questions in Coding dashboard
    When I login using "test@yahoo.com" and "test123"
    And Navigate to "Coding" dashboard
    And Click a button "Enter new question "
    And Add question "team 5 test lala"
    And Click a button "Enter"
    Then Verify text "team 5 test lala" is displayed

  @US1005b
  Scenario: Testing ability to add questions in Coding dashboard
    When I login using "test@yahoo.com" and "test123"
    And Navigate to "Soft skills" dashboard
    And Click a button "Enter new question "
    And Add question "team 5 test lala"
    And Click a button "Enter"
    Then Verify text "team 5 test lala" is displayed

  @US1006
  Scenario: user should be able to edit or delete questions
    When I login using "admin@yahoo.com" and "admin123"
    And Navigate to "Coding" dashboard
    And Click a button "Enter new question "
    And Add question "team 5 delete test"
    And Click a button "Enter"
    And Click question delete button
    Then Verify text "team 5 delete test" is not displayed