Feature: Sign In Feature

   @SignIn
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    Then User click on Sign in option
    And User enter email 'ajtest@yahoo.com' and password 'Ajmal123$'
    And User click on login button
    Then User should be logged in into Account
