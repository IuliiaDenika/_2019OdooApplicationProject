package com.Odoo.step_definitions;


import com.Odoo.pages.LoginPage;
import cucumber.api.java.en.*;


public class TopMenuStepDefinitions {
    LoginPage loginPage = new LoginPage();

    // And user navigates to "_______" then to "____________"
    @Then("user navigates to {string} then to {string}")
    public void user_navigates_to_then_to(String module, String submodule) {
        loginPage.navigateTo(module, submodule);
    }

}