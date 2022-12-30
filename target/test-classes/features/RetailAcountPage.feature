Feature: Retail Account Page

  Background: 
    Given User is on retail website
    Then User click on Sign in option
    And User enter email 'ajtest@yahoo.com' and password 'Ajmal123$'
    And User click on login button
    Then User should be logged in into Account

  @AddaPhoneNumber
  Scenario: Verify User can update Profiel information
    When User click on Account option
    And User update Name 'Ajmal' and Phone '916 645 3214'
    And User click on Update button
    Then User profile information should be updated

  @PasswordChange
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      |  Ajmal1235$  | Ajmal123$ | Ajmal123$     |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @AddCard
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4321123456788765 | Ajmal     |              12 |           2025 |          543 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @EditingCard
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    When User click on card image
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3456123443217654 | Nadim     |              11 |           2026 |          690 |
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
      | United States | Ajmal   | 9165436578 | 547clayton st | 65 | Sacramento | California |   76789 |
    And User click Add Your Address button
    Then a message should be displayed ’Address Added Successfully’

  @EditAddrress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city       |    state      | zipCode |
      | United States |   Ajmal   |  916 654 8987 | 5454Alameda St | 50 | Sacramento |California |      95828 |
    And User click update Your Address button
    Then a message should be displayed ’Address Updated Successfully’

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
