Feature: Sign Up Accoun in Retail Website

  
  Scenario: Verify User Creat Account
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email                     | password   | confirmPassword |
      | Bashir | Bashir.CapstoneP10@tek.com | Bashir@786 | Bashir@786      |
    And User click on SignUp button
    Then User should be logged into account page
