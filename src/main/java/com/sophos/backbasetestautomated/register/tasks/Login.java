package com.sophos.backbasetestautomated.register.tasks;

import com.sophos.backbasetestautomated.register.models.UserAccessAplication;
import com.sophos.backbasetestautomated.register.userinterface.MainPage;
import com.sophos.backbasetestautomated.register.userinterface.PageLogin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
	private UserAccessAplication userData;

	public Login(UserAccessAplication userData) {
		this.userData = userData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MainPage.BUTTON_SIGN_IN));
		actor.attemptsTo(Enter.theValue(userData.getUser()).into(PageLogin.TEXT_BOX_USERNAME));
		actor.attemptsTo(Enter.theValue(userData.getPassword()).into(PageLogin.TEXT_BOX_PASSWORD));
		actor.attemptsTo(Click.on(PageLogin.BUTTON_SIGN_IN));
		
		
	}

	public static Login signInPage(UserAccessAplication userData) {
		return Tasks.instrumented(Login.class, userData);
	}

}
