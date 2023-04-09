Feature: Payment
  As I a user
  I want to buy the product
  So that I should be choice the types of payment

  Scenario: Successful choice the type of payment
    Given user navigate to detail of payment
    When user choice the method of payment to buy the product
    Then user click "Buy Now" button to finish the transaction
    And user get a receipt