Feature: Login
  As I a user
  I want to see the home page
  So that I can buy a product

  Scenario: As a user, I have be able to success login
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    Then I am on the home page