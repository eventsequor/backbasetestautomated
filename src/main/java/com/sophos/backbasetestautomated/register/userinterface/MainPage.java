package com.sophos.backbasetestautomated.register.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://qa-task.backbasecloud.com/")
public class MainPage extends PageObject {
	public static final Target TITLE_HEADER = Target.the("Title of header")
			.locatedBy("(//*[contains(text(),'BBlog')])[position()=2]");

	public static final Target BUTTON_SIGN_UP = Target.the("Button sign up")
			.locatedBy("//a[contains(text(),'Sign up')]");

	public static final Target LINK_REF_USER = Target.the("name user")
			.locatedBy("(//a[@class = 'nav-link'])[position()=1]");
	
	public static final Target BUTTON_SIGN_IN = Target.the("button sign in").locatedBy("//a[@class='nav-link' and contains(text(),'Sign in')]");

}
