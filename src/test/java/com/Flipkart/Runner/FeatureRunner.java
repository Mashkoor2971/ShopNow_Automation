package com.Flipkart.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resouces/features/" }, 
                     glue = { "com.flipkart.stepdefs"},
		           plugin = { "pretty" },
		       monochrome = true ,
		             tags = "@test"
		)
public class FeatureRunner {	

}
