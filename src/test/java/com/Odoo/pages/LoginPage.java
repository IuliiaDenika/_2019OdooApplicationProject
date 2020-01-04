package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "login")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = "[class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(css = "[class='alert alert-danger']")
    public WebElement warningMessage;


    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);

    }
    //more wait?
    public void login(String userName, String password) {



        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password, Keys.ENTER);
    }


}


