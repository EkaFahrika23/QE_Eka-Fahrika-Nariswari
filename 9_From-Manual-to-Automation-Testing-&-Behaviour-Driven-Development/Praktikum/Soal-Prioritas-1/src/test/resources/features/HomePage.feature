Feature: Home Page
  As I a user
  I want to view post on the home page
  So that I can interaction with the post

  Scenario: View Home Page
    Given user is logged in to their LinkedIn
    When user opens the home page LinkedIn
    Then user will see a feed containing posts from their connections and followed pages

    Scenario: Latest posts
      Given user is logged in to their account
      When user opens the home page
      Then user will see the latest posts from their connections and followed pages

      Scenario: Search for connection
        Given user login in to their LinkedIn account
        When user types a name of a connection they want to search for in the search bar
        Then user will see search results displaying profiles that match the search criteria

          Scenario: Share a posts
            Given user login in to their LinkedIn
            When user opens the post they want to share
            Then user will see a "Share" button, after clicking it, user can share the post to their connections or a specific page.
            And The post will appear on their home page and the connection or page will receive a notification about the shared post.