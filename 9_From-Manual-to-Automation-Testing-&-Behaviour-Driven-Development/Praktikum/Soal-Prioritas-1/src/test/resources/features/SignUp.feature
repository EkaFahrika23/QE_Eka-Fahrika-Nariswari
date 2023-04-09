Feature: Sign Up
  As I user
  I want to register my account in the LinkedIn
  So that I have profile account

  Scenario: Successful sign up
    Given the user on the sign up page
    When the user fills the valid details
    Then the user should be redirected to their LinkedIn home page
    And a confirmation email should be sent to the user's email address