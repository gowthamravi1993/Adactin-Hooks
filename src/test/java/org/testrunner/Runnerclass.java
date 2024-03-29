package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utils.ReportsUtils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles",
glue="org.stepdefinition",dryRun=false,tags={"@sanitary"},monochrome =true,
plugin={"pretty",
		"html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\output.json",
		"junit:src\\test\\resources\\Reports\\fb.xml"})


public class Runnerclass {
@AfterClass

public static void jvmReportGeneration() {
	ReportsUtils.generatejvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\output.json");
	
	


}

}
