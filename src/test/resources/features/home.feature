Feature: Home page tests
  Background:
    Given I open website url
    And I login using "test@yahoo.com" and "test123"

  @US1004a
  Scenario: Testing do statement add functionality
    And Add a do statement "team 5 do statement test"
    Then Verify "team 5 do statement test" statement is displayed

  @US1004b
  Scenario: Testing dont statement add functionality
    And Add a dont statement "team 5 dont statement test"
    Then Verify "team 5 dont statement test" statement is displayed

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