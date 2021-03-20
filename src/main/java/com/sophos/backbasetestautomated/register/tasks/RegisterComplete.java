package com.sophos.backbasetestautomated.register.tasks;

import com.sophos.backbasetestautomated.register.models.UserRegistrationData;
import com.sophos.backbasetestautomated.register.userinterface.register.PageSignUpRegister;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterComplete implements Task {
	private UserRegistrationData userData;

	public RegisterComplete(UserRegistrationData userData) {
		this.userData = userData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		if(Boolean.FALSE.equals(userData.getUserName().isEmpty())) {
			actor.attemptsTo(Enter.theValue(userData.getUserName()).into(PageSignUpRegister.TEXT_BOX_USERNAME));
		}
		if(Boolean.FALSE.equals(userData.getEmail().isEmpty())) {
			actor.attemptsTo(Enter.theValue(userData.getEmail()).into(PageSignUpRegister.TEXT_BOX_EMAIL));
		}
		if(Boolean.FALSE.equals(userData.getPassword().isEmpty())) {
			actor.attemptsTo(Enter.theValue(userData.getPassword()).into(PageSignUpRegister.TEXT_BOX_PASSWORD));
		}
		actor.attemptsTo(Click.on(PageSignUpRegister.BUTTON_SIGN_UP));
		
	}
	
	public static RegisterComplete completeRegister(UserRegistrationData userData) {
		return Tasks.instrumented(RegisterComplete.class, userData);
	}
	

}
