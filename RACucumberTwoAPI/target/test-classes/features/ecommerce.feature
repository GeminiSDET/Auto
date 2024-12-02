Feature: E-Commerce API Tests

  Scenario: Login and Add Product
    Given I log in with valid credentials
    When I add a new product
    Then the product should be added successfully
