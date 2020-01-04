package com.Odoo.step_definitions;
import com.Odoo.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("##############################");
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){
        //if test failed - do this
        if(scenario.isFailed()){
            System.out.println("Test failed!");
        }else{
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        System.out.println("##############################");

        Driver.close();
    }
}