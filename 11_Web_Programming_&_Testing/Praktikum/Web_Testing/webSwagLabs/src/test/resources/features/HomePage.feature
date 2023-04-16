Feature: Home Page
  As I user
  I want to buy a product
  So that I can add the product to cart

  Scenario: As a user, I have be able to success add the product to cart
    Given I on the home page
    When I click add to cart button
    And I click cart feature
    Then I am on the cart page