Feature: Automate Salesforce CRUD Operations

  Scenario: Login to Salesforce
    Given User navigates to "https://login.salesforce.com"
    When User enters username "azarriju88-vd7d@force.com" and password "Azar~!@#4"
    Then User should see the Salesforce home page

  Scenario: Create an Account Record
    When User navigates to the "Accounts" tab
    And User creates a new account with "Test Account", "Technology", and "12345"
    Then Account creation is successful

  Scenario: Open the Record Page
    Then User verifies the success toast message and lands on the record page

  Scenario: Attach Two Files to the Account Record
    When User uploads two files to the created Account record
    Then Files are uploaded successfully

  Scenario: Retrieve and Validate File Attachments
    Then User validates the presence and metadata of uploaded files

  Scenario: Delete One of the Files
    When User deletes one uploaded file
    Then File deletion is successful

  Scenario: Update the Account Record
    When User updates the "Industry" field to "Finance"
    Then Account record is updated successfully

  Scenario: Delete the Account Record
    When User deletes the created Account
    Then Account deletion is successful