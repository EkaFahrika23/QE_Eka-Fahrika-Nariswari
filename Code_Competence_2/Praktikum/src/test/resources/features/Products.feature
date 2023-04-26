Feature: Products service Fake Store API

  @FakeStoreAPI @ProductsFakeStore @GetAllProducts
  Scenario: User get all product
    Given User call an api "/products" with method "GET"
    Then User verify response is match with json schema "AllProducts.json"

  @FakeStoreAPI @ProductsFakeStore @GetSingleProduct
  Scenario: User get single products
    Given User call an api "/products/1" with method "GET"


  @FakeStoreAPI @ProductFakeStore @GetAllProductsWithLimit
  Scenario: User get all products with limit
    Given User call an api "/products?limit=5" with method "GET"
    Then User verify response is match with json schema "AllProducts.json"