package com.sophos.backbasetestautomated.runners;

import io.cucumber.java.After;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Hook extends PageObject{
	
	@After
	public void closeTheBrowser() {
		BrowseTheWeb.as(new Actor("System admin")).getDriver().quit();
	}

}
