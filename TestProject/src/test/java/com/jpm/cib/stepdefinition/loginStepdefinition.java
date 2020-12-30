package com.jpm.cib.stepdefinition;

import com.jpm.cib.pages.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepdefinition
{

    private WebDriver driver;
    public loginPage login;
    public loginStepdefinition() {
        login = new loginPage();
    }

    @And("^User login with \"([^\"]*)\"$")
    public void He_enters_user_name(String userName) {
        System.out.println(userName);
        login.launchApp(userName);

    }

}
