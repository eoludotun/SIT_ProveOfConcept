package com.testrunners;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber.json",
                jsonUsageReport = "target/cucumber-usage.json",
                usageReport = true,        
                detailedAggregatedReport = true,
                overviewChartsReport = true,
                pdfPageSize = "A4 Landscape",
        overviewReport = true,
        detailedReport = true,
        outputFolder = "./target",
        toPDF = true,
        screenShotLocation ="./target/screenshots")
@CucumberOptions(
        features="./src/main/resources/features/",
        glue={"com.pageObjectHelper","com.test_PageObjectsModel","com.testPageObjects","com.testrunners","com.testHooks_Utility","com.test_StepsFolder"},
        plugin={ "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber-results.xml"},
        tags = {"~@ignore"})
public class TestRunner {

}




