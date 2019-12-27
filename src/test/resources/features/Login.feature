Feature: Uer should be able to login

  Background:
  Given User open the login page
  And Make shure that we are on "Login" page

    Scenario: Login as contact
      When The user enter  the contact information
      Then the user should be able to login

