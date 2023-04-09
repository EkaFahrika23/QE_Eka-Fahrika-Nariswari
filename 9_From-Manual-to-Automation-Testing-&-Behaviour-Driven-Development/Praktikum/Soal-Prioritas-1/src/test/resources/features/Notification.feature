Feature: Notification
  As I a user
  I want to access notification page on the LinkedIn
  So that I can receive the notification

  Scenario: Receive a notification
    Given user login to linkedIn account
    When another user interacts with their profile, such as liking or commenting on a post, sending a connection request or endorsing a skill
    Then user will receive a notification about the interaction
    And user can be viewed by clicking on the notification icon on the top right corner of the screen