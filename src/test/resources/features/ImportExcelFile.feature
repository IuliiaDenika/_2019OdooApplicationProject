Feature:Import Excel File

@KalininTest
  Scenario: Download excel file as contact user
    Given contact user logs in using "imm59@info.com" and "inventorymanager"
    Then contact user click on Contacts page
    Then contact user click on Import page
    Then click on "Load File" and download excel file
    Then Check the excel file was succesfully downloaded

