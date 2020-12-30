package com.jpm.cib.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvSetup {
    public static WebDriver WEBDRIVER;
    public static boolean IS_ENVIRONMENT_READY;
    public EnvSetup() {

        if (EnvSetup.IS_ENVIRONMENT_READY != true) {
            IS_ENVIRONMENT_READY = true;
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
            WEBDRIVER = new ChromeDriver();
            System.out.println("opned browser");
        }
    }
}
