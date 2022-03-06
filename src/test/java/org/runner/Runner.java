package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "featureAdactin",glue = {"org.stepdefinition"},monochrome =true,plugin = "html:target" )
public class Runner {
	
}
