Feature: Home page tests

  @US2000
  Scenario:  Test header of the home page
    Given I open website url
    Then Verify header text is Interview App

  @US2001
  Scenario: Verify buttons is displayed
    Given I open website url
    Then Verify button "Sign Out" is displayed
    Then Verify button "Manage Access" is disabled

  @US1004c
  Scenario: Testing do section does not add statement with symbols
    And Add a do statement "team 5 do statement!!!@#$%^"
    Then Verify "team 5 do statement!!!@#$%^" statement is not displayed

  @US1004d
  Scenario: Testing dont section does not add statement with symbols
    And Add a dont statement "team 5 dont statement!!!@#$%^"
    Then Verify "team 5 dont statement!!!@#$%^" statement is not displayed

  @US1005a
  Scenario: Testing ability to add questions in Coding dashboard
    And Navigate to "Coding" dashboard
    And Click a button "Enter new question "
    And Add question "team 5 test lala"
    And Click a button "Enter"
    Then Verify text "team 5 test lala" is displayed

  @US1005b
  Scenario: Testing ability to add questions in Coding dashboard
    And Navigate to "Soft skills" dashboard
    And Click a button "Enter new question "
    And Add question "team 5 test lala"
    And Click a button "Enter"
    Then Verify text "team 5 test lala" is displayed

  @US2002
  Scenario:Verify Dashboard is present
    Given I open website url
    Then Verify All Topics is displayed
    Then Verify Coding is displayed
    Then Verify Soft skills is displayed