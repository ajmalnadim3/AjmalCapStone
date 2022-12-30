Feature: Sign Up Accoun in Retail Website

  @signUp
  Scenario: Verify User Creat Account
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email                     | password   | confirmPassword |
      | Ajmal | ajtest2@yahoo.com | Aj12345$ | Aj12345$     |
    And User click on SignUp button
    Then User should be logged into account page
