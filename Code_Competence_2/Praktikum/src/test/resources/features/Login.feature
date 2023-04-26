Feature: Login to Fake Store API

  @FakeStoreAPI @LoginFakeStore
  Scenario: User login with correct username and password
#    Given User call an api "/auth/login" with method "POST"
#      | username | password |
#      | mor_2314 | 83r5^_ |
    Given User login to api "auth/login" with username "mor_2314" and password "83r5^_"
    Then User verify status code is 200
    Then User verify "token" is exist


