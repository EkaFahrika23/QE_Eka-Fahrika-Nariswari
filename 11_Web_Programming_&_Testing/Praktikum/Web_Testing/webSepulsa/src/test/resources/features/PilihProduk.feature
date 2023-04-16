Feature: Pilih Produk
  As I a user
  I want to see all the product
  So that I can buy a product

  Scenario: As I user, I have be able to buy a pulsa
    Given I am on Home Page
    When I am click all product button
    And I see all the product
    And I click pulsa button
    Then I on the transaction page