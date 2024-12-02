Feature: Account Management
  Scenario: Create, update, and delete an account
    Given User navigates to Salesforce Login Page
    When User logs in with valid credentials
    And User creates a new account record with name "TestAccount"
