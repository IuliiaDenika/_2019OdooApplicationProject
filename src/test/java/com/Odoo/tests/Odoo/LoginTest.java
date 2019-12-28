package com.Odoo.tests.Odoo;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import org.junit.Test;

public class LoginTest {


    @Test
    public void test1() {

        String url = (String) ConfigurationReader.getProperty("url");

        Driver.get().get(url);

        System.out.println(Driver.get().getTitle());
        BrowserUtils.wait(2);

        Driver.close();
    }


}
