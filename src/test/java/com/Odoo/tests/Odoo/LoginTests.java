package com.Odoo.tests.Odoo;

import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.Driver;

import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {

    @Test

    public void test1() {
        LoginPage loginPage = new LoginPage();

        loginPage.login("eventscrmmanager26@info.com", "eventscrmmanager");


         Assert.assertEquals(Driver.get().getTitle(),"Odoo");
    }

}
