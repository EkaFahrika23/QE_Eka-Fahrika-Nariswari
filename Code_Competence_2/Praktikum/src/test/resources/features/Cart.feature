Feature: Cart Fake Store API

  Scenario: User can get all carts
    Given User call an api "/carts" with method "GET"
    Then User verify response is match with json schema "Cart.json"

  Scenario: User can get single carts
    Given User call an api "/carts/5" with method "GET"
    Then User verify response is match with json schema "SingleCart.json"