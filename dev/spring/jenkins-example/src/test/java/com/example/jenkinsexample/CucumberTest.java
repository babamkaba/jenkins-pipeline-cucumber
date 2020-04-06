package com.example.jenkinsexample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/resources",
glue = "com.example.jenkinsexample",
format = "{json:target/cucumber.json}"
		)
public class CucumberTest {

}
