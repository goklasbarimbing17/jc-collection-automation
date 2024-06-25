
package com.collection.testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
//        features = "src/main/resources/features/",
        features = {"src/main/resources/features/01-Login.feature" ,"src/main/resources/features/02-MasterPerson.feature", "src/main/resources/features/12-CategoryLancar.feature", "src/main/resources/features/14-CategoryLunas.feature"},
        glue = {"com.collection"},
        dryRun = false,
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-report.json"}
)   
public class TestRun extends AbstractTestNGCucumberTests {


}