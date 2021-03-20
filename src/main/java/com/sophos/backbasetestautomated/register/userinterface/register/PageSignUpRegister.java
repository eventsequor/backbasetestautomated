package com.sophos.backbasetestautomated.register.userinterface.register;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageSignUpRegister extends PageObject {
	public static final Target LABEL_SIGN_IN = Target.the("label Sign In")
			.locatedBy("//h1[contains(text(),'Sign in')]");

	public static final Target TEXT_BOX_USERNAME = Target.the("set user name")
			.locatedBy("//input[@placeholder='Username']");

	public static final Target TEXT_BOX_EMAIL = Target.the("set email").locatedBy("//input[@placeholder='Email']");

	public static final Target TEXT_BOX_PASSWORD = Target.the("set password")
			.locatedBy("//input[@placeholder='Password']");

	public static final Target BUTTON_SIGN_UP = Target.the("click on button sign up ")
			.locatedBy("//button[contains(text(),'Sign up')]");

	public static final Target LABEL_MESSAGE_ERROR = Target.the("label messager error")
			.locatedBy("//ul[@class='error-messages']");

}
