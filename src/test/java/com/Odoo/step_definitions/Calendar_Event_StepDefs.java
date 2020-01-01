package com.Odoo.step_definitions;

import com.Odoo.pages.Calendar_Event;
import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar_Event_StepDefs {

    //    LoginPage loginPage = new LoginPage();
//
//    @Given("user is on the login page")
//    public void user_is_on_the_login_page() {
//        Driver.get().get(ConfigurationReader.getProperty("url"));
//        String username = ConfigurationReader.getProperty("login");
//        String pasSword = ConfigurationReader.getProperty("password");
//        loginPage.login(username, pasSword);
//    }
    Calendar_Event calendar_event = new Calendar_Event();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 20);

    @When("clicks on calendar events")
    public void clicks_on_calendar_events() {
        wait.until(ExpectedConditions.elementToBeClickable(calendar_event.contactsButton));
        calendar_event.contactsButton.click();

    }

    @When("user picks the date {string}")
    public void user_picks_the_date(String date) {
        wait.until(ExpectedConditions.elementToBeClickable(calendar_event.monthView));
        calendar_event.monthView.click();
        wait.until(ExpectedConditions.elementToBeClickable(calendar_event.eigthJan));
        calendar_event.eigthJan.click();

        System.out.println("click on Jan 8");

    }

    @Then("{string} window pop up")
    public void window_pop_up(String create) {
        wait.until(ExpectedConditions.visibilityOf(calendar_event.createTitle));
        System.out.println(calendar_event.createTitle.isDisplayed());

    }

    @Then("input box avaiable")
    public void input_box_avaiable() {
        wait.until(ExpectedConditions.elementToBeClickable(calendar_event.inputBox));
        calendar_event.inputBox.click();
        calendar_event.inputBox.isSelected();

    }

    @Then("user types meeting {string} and click create button")
    public void user_types_meeting_and_click_create_button(String string) {
        calendar_event.inputBox.sendKeys("Tabriz");
        calendar_event.createButton.click();
    }


}