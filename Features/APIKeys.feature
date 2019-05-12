@smoke
Feature: User should be able to click on account manager menu

Background: Flow from homepage to Account manager menu

Given I should navigate to login page and clicks on login
Scenario: I want to create api key 
When I Login to the application with valid credentials
And Click on Add API Key present under API Keys in Account Manager
Then I should be able to Add new API key.
#
#Scenario: I want to update api key
#When I Clicks on account manager menu
#And User clicks on API keys submenu
#And I click edit button
#And I enter session name details 
#And I click on generate apikey button
#And I click on save button
#Then I should see page with message API key was successfully edited
#
#Scenario: I want to deactivate api key
#When I Clicks on account manager menu
#And User clicks on API keys submenu
#And I click on deactivate button
#And I click on deactivate button on pop up
#Then I should see page with message Api key deactivated successfully
#
#Scenario: I want to activate api key
#When I Clicks on account manager menu
#And User clicks on API keys submenu
#And I click on activate button
#And I click on got it button on pop up
#Then I should see page with message Api key activated successfully