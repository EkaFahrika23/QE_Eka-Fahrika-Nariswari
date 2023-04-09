Feature: Product
  As I a user
  I want to navigate product page
  So that I can choice the product

  Scenario: Successful choice the product
    Given user login to Sepulsa application
    When user navigate to the product page
    Then user choice the one or some product
    And user can be transaction to buy the product