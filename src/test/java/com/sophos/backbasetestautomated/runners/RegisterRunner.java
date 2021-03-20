package com.sophos.backbasetestautomated.runners;

import javax.swing.JOptionPane;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features",
glue = "com.sophos.backbasetestautomated.stepdefinitions",
monochrome = true,
plugin = {"pretty"}
,tags="@ListOfFavoriteArticles")
public class RegisterRunner {
	
	@AfterScenario
	public void closeTheBrowser() {
		JOptionPane.showMessageDialog(null,"test");
	}
	
	

}
