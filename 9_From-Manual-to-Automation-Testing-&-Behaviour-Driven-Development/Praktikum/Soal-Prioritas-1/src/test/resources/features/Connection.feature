Feature: Connection
  As I a user
  I want to find the connection
  So that I have many connection

  Scenario: Send a connection request
    Given user on the connection page
    When user searches for a specific person or views a suggested connection and decides to connect with them
    Then user can click on the "Connect" button and send a personalized connection request to the selected person

    Scenario: Accept a connection request
      Given user has one or more pending connection requests
      When user clicks on the "My Network" icon on the top right corner of the screen and selects "Pending Invitations"
      Then user can view their pending connection requests and click on the "Accept" button

      Scenario: Decline a connection request
        Given user has pending connection requests
        When user clicks on the "My Network" icon and selects "Pending Invitations"
        Then user can view their pending connection requests and click on the "Ignore" button
