package com.sophos.backbasetestautomated.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features",
glue = "com.sophos.backbasetestautomated.stepdefinitions",
monochrome = true,
plugin = {"pretty"},
tags = "@Register_Succesful")
public class RegisterRunner {
	
	

}
