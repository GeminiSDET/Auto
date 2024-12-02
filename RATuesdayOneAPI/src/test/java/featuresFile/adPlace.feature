Feature: Add a place via API

  Scenario: Add a place successfully
    Given the user provides valid payload with name "Frontline house", language "French-IN", address "29, side layout, cohen 09"
    When the request to add a place is sent
    Then the response status code should be 200
    And the response should contain place_id
    And the response should have the message "Place successfully added"
