Feature: Amazon Automation

Scenario: Automate Amazon workflow
    Given I open the Amazon login page
    When I enter username "azarriju" and password "Azar~!@#4"
    Then I should see the Home Screen
    When I search for "Bag"
    Then I validate the search results
    When I select the bag named "Skybags"
    And I click on "Add to Cart"
    Then I navigate to the cart and validate the items
    When I scroll to the bottom of the screen
    And I scroll to the top of the screen
    And I take a screenshot
    Then I click on "Proceed to Buy"
    And I select the second address
    Then I validate the purchase details