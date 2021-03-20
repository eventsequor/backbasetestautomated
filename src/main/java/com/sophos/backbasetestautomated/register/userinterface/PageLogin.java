package com.sophos.backbasetestautomated.register.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageLogin extends PageObject {
	public static final Target TEXT_BOX_USERNAME = Target.the("text box user name")
			.locatedBy("//input[@placeholder='Username']");
	public static final Target TEXT_BOX_PASSWORD = Target.the("text box password")
			.locatedBy("//input[@placeholder='Password']");
	public static final Target BUTTON_SIGN_IN = Target.the("button sign in")
			.locatedBy("//button[contains(text(),'Sign in')]");
}
