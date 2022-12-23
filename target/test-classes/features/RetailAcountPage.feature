Feature: Retail Account Page

  Background: 
    Given User is on retail website
    Then User click on Sign in option
    And User enter email 'mortytest2@yahoo.com' and password 'Sadrajan22$'
    And User click on login button
    Then User should be logged in into Account

  @AddingPhoneNumber
  Scenario: Verify User can update Profiel information
    When User click on Account option
    And User update Name 'Mortyjan' and Phone '916 450 0000'
    And User click on Update button
    Then User profile information should be updated

  @PasswordChange
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Sadrajan00$      | Sadrajan22$ | Sadrajan22$     |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @AddCard
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567891234611 | Bashir     |              12 |           2025 |          300 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @EditingCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    When User click on card image
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3456123443211000 | Morty      |              11 |           2026 |          900 |
    And user click on Update Your Card button
    Then a a message should be displayed 'Payment Method updated Successfully'

  @RemoveCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on card options
    And User click on remove option of card section
    Then payment details should be removed

  @AddingAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country     | fullName | phoneNumber  | streetAddress      | apt | city       | state | zipCode |
      | Afghanistan | Bashir   | 916 980 0091 | 987Vintage Park Dr | 910 | Sacramento | Kabul |   95823 |
    And User click Add Your Address button
    Then a message should be displayed ’Address Added Successfully’

  @EditAddrress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city       | state      | zipCode |
      | United States | bashir   |  9778788989 | 9999 Sky Park |  70 | Sacramento | Florida |   95828 |
    And User click update Your Address button
    Then a message should be displayed ’Address Updated Successfully’

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
