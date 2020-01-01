package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calendar_Event extends BasePage {
    public Calendar_Event() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "login")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = "[class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(css = "[class='alert alert-danger']")
    public WebElement warningMessage;

    @FindBy(xpath = "//*[normalize-space()='Calendar' and @class ='oe_menu_text']")
    public WebElement contactsButton ;

    @FindBy(xpath ="(//td[@data-date='2020-01-08'])[2]" )
    public WebElement eigthJan;

    @FindBy(xpath = "//*[text()='Month']")
    public WebElement monthView ;

    @FindBy(xpath = "((//table)[1]//tbody)[5]//tr[25]")
    public WebElement time;


    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement createTitle;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement inputBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;


    //more wait?
    public void login(String userName, String password) {



        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password, Keys.ENTER);
    }
}
