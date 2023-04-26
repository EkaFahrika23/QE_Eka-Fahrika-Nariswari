Feature: Users Fake Store API

  Scenario: User can get all users
    Given User call an api "/users" with method "GET"
    Then User verify response is match with json schema "Users.json"

  Scenario: User can get single users
    Given User call an api "/users/1" with method "GET"
    Then User verify response is match with json schema "SingleUsers.json"