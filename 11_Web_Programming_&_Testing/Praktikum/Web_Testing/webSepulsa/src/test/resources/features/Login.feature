Feature: Login
  As I a user
  I want to see product on the Sepulsa
  So that I can buy the product

  Scenario: As I user, I have be able to success login
    Given I am on the login page
    When I am input valid email
    And I am input valid password
    Then I am click login button
