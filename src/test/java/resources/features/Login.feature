Feature: Login
As user, I should be able to login to Odoo
under different roles with different email and password

Scenario: Login as sales manager
Given user is on the login page
Then user logs in as sales manager
And user verifies that "Dashboard" page subtitle is displayed

Scenario: Login as inventory manager
Given user is on the login page
Then user logs in as inventory manager
And user verifies that "Dashboard" page subtitle is displayed

