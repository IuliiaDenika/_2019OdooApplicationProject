package com.Odoo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/Odoo/step_definitions",
        dryRun = false,
      //  tags = "@smoke_test",
        tags ="@KalininTest",
       // plugin = {"html:target/default-cucumber-reports"}
        plugin = {"json:target/cucumber.json","html:target/default-cucumber-reports"}

)


public class CuckesRunner {



}
