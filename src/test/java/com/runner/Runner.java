package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources",glue={"com.stefdefinition"}, 
monochrome=true, plugin= {"html:Reports\\HtmlReports","json:Reports\\JsonReports\\Cucumber.json","junit:Reports\\JunitReports\\Cucumber.xml"},
dryRun = false
//tags= ("@SmokeTest and @SanityTest")
)
public class Runner {

}
