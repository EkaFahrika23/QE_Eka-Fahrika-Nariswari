Feature: Cart Page
  As I a user
  I want to remove the product on the cart page
  So that I can continue to shopping

  Scenario: As a user, I have be able to success remove product the cart page and continue to shopping
    Given I on the cart page
    When I am remove the product on the cart page
    And I click continue to shopping
    Then I in the home page