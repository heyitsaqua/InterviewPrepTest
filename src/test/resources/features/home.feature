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


      @US2002
      Scenario:Verify Dashboard is present
        Given I open website url
        Then Verify All Topics is displayed
        Then Verify Coding is displayed
        Then Verify Soft skills is displayed