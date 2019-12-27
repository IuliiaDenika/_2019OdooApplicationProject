Feature: Login
As user, I should be able to login to Odoo.

Scenario: Login as sales manager
Given user is on the login page
Then user logs in as sales manager
And user verifies that "Odoo" page subtitle is displayed

