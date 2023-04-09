Feature: Login
  As I a user
  I want to login on the Sepulsa Application
  So that I can make transactions there

  Scenario: Successful to login
    Given user on the login page
    When user enter valid number phone or email and password
    Then user click login button
    And user can see home page to be transactions there

    Scenario: unsuccessful login with invalid email
      Given user navigate to login page
      When user enter the invalid email
      Then an error message is displayed indicating that the email address is invalid

      Scenario: unsuccessful login with invalid number phone
        Given a user navigate to login page
        When user enter the invalid number phone
        Then an error message is displayed indicating that the number phone is invalid

        Scenario: unsuccessful login with incorrect password
          Given a user navigates to the login page
          When the user enters a valid email address or number phone and an incorrect password
          Then an error message is displayed indicating that the password