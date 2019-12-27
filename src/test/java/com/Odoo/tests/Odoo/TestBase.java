package com.Odoo.tests.Odoo;
//this class is the test foundation for all test classes
//we will insert before and after parts

import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import org.junit.After;
import org.junit.Before;


public abstract class TestBase {
    

    @Before
    public void setup() {
        String url = (String) ConfigurationReader.getProperty("url");
        Driver.get().get(url);


    }

    @After
    public void teardown() {
        Driver.close();
    }
}
