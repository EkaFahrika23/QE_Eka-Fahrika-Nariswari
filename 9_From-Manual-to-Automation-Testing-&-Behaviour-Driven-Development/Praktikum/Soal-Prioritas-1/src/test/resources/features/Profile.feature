Feature: Profile
  As I a user
  I want to view my profile
  So that I can edit my profile

  Scenario: View my profile
    Given user access the LinkedIn Application
    When user clicks on their profile picture
    Then user will be redirected to their profile page
    And user can view their basic information, work experience, education and other relevant details
