Feature:  user should be able to reserve a meeting

  Background: open login page and login as sales manager
    Given user is on the login page
    Then user logs in as sales manager


  Scenario:
    When clicks on calendar events
    And  user picks the date "01/08/2020"
    Then "Create" window pop up

  Scenario:
    When clicks on calendar events
    And  user picks the date "01/08/2020"
    And "Create" window pop up
    Then input box avaiable

  @wip
  Scenario:
    When clicks on calendar events
    And  user picks the date "01/08/2020"
    And "Create" window pop up
    Then input box avaiable
    Then user types meeting "Name" and click create button

