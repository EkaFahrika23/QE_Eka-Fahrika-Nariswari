Feature: Login
  As a user
  I want to Sign In to LinkedIn
  So that I can access my account and connect with other professionals

  Scenario: As user i have be able to success SignIn
    Given I am on the sign in page
    When I enter my email or phone number and password correctly
    And I click sign in button
    Then I am on the LinkedIn home page
