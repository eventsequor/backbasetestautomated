package com.sophos.backbasetestautomated.register.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://qa-task.backbasecloud.com/")
public class MainPage extends PageObject {
	public static final Target TITLE_HEADER = Target.the("Title of header")
			.locatedBy("(//*[contains(text(),'BBlog')])[position()=2]");

}
