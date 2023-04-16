Feature: Payment
  As I user
  I want to buy the pulsa
  So that I can choice the payment method

  Scenario: As a user, I have be able to success choice the payment method
    Given I am on the transaction pulsa page
    When I am input valid number phone
    And I click 5.000 button
    And I am on the detail payment page
    Then I choice payment method of gopay