@smoke_test
Feature: Smoke test

  Background: open login page and login as sales manager
    Given user is on the login page
    Then user logs in as sales manager

  Scenario: Verify inbox page
    And user verifies that "Inbox" page subtitle is displayed

  Scenario: Verify Dashboards page
    And user navigates to "Dashboards" then to "My Dashboard"
    Then user verifies that "My Dashboard" page subtitle is displayed

  Scenario: Verify Calendar page
    And user navigates to "Calendar" and clicks on it
    Then user verifies that "Meetings(Week __)" page subtitle is displayed

  Scenario: Verify Contacts page
    And user navigates to "Contacts" and clicks on it
    Then user verifies that "Contacts" page subtitle is displayed

