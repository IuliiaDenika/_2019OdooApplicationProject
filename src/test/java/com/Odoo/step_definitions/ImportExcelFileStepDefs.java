package com.Odoo.step_definitions;


import com.Odoo.pages.ContactPage;
import com.Odoo.pages.ImportPage;
import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;

import com.Odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class ImportExcelFileStepDefs {




    @Given("contact user logs in using {string} and {string}")
    public void contact_user_logs_in_using_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage();
        username = ConfigurationReader.getProperty("user_name_contact");
        password = ConfigurationReader.getProperty("password_contact");
        loginPage.login(username,password);

    }


    @Then("contact user click on Contacts page")
    public void contact_user_click_on_Contacts_page() {
        // Write code here that turns the phrase above into concrete actions
        ContactPage contactPage = new ContactPage();
        BrowserUtils.waitForClickablility(contactPage.ContactsLink,20);
        contactPage.ContactsLink.click();
    }


   @Then("contact user click on Import page")
   public void contact_user_click_on_Import_page(){
    ContactPage contactPage = new ContactPage();
    contactPage.importButon.click();
   }

    @Then("click on {string} and download excel file")
    public void click_on_and_download_excel_file(String string) {
        // Write code here that turns the phrase above into concrete actions

        ContactPage contactPage = new ContactPage();
        contactPage.importButon.click();
        ImportPage importPage = new ImportPage();
        Assert.assertFalse(importPage.TestImportButton.isEnabled());
        String projectPath = System.getProperty("user.dir");
        String filePath = "/src/test/resources/features/Excel(Kalinin).xlsx";
        String fullPath = projectPath+filePath;

        //BrowserUtils.waitForClickablility(importPage.LoadButton,20);
        //importPage.inputFile.click();
        importPage.inputFile.sendKeys(fullPath);


    }

    @Then("Check the excel file was succesfully downloaded")
    public void check_the_excel_file_was_succesfully_downloaded() {
        // Write code here that turns the phrase above into concrete actions
        ImportPage importPage = new ImportPage();
        BrowserUtils.waitForClickablility(importPage.TestImportButton,10);
        Assert.assertTrue(importPage.TestImportButton.isEnabled());
    }

}
