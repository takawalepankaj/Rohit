package com.jpm.cib.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/features/"},
        glue={"com/jpm/cib/stepdefinition/"}
        ,monochrome = true //console output in readable format
				//	,dryRun = true
        ,plugin = {"pretty",
        "html:target/cucumber-htmlreport",
        "json:target/cucumber-report.json"
        ,"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
}
)

public class runTest {

}