package com.jpm.cib.stepdefinition;

import com.jpm.cib.utils.EnvSetup;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class hooks {


    @Before
    public void beforeTest() {
        new EnvSetup();
    }

    @After
    public void afterTest() {
        EnvSetup.WEBDRIVER.quit();
        EnvSetup.IS_ENVIRONMENT_READY = false;
    }
}
