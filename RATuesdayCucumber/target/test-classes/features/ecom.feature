Feature: E-Commerce API Testing

Scenario: User login and Add Product
Given the user logs in with "azarriju@gmail.com" and "Azar~!@#4"
When the user adds a product with name "Laptop", category "Electronics", price "1500"
Then the product is successfully added
And the product details are verified