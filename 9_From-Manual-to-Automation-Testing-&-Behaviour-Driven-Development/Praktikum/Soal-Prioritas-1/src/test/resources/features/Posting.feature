Feature: Posting
  As I a user
  I want to share my activities on the LinkedIn
  So that I should be create the posting

  Scenario: Successful create a post
    Given user navigate to the home page
    When user click "create a post" button
    Then user will be able to create a post, including adding text, images, videos, links or other multimedia content.
    And user the finish the post after that the connection can be see the posting