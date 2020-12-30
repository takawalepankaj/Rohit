package com.jpm.cib.pages;

import com.jpm.cib.utils.EnvSetup;
import com.jpm.cib.utils.common;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    protected WebDriver driver;

    @FindBy (name ="q")
    public WebElement TextBoxSearch;



    public loginPage ()
    {
        driver = EnvSetup.WEBDRIVER;
        PageFactory.initElements(driver,this);
    }
    public void launchApp(String userName) {

        driver.get("https://www.google.com");
        System.out.println("User Name: " + userName);
        common.waitForSpecifiedTime(5);

        TextBoxSearch.sendKeys(userName+ Keys.ENTER);

        common.waitForSpecifiedTime(5);
    }
}
