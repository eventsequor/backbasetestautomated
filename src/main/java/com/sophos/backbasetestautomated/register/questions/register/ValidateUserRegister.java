package com.sophos.backbasetestautomated.register.questions.register;

import com.sophos.backbasetestautomated.register.models.UserRegistrationData;
import com.sophos.backbasetestautomated.register.userinterface.MainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateUserRegister implements Question<String> {
	private UserRegistrationData userData;

	public ValidateUserRegister(UserRegistrationData userData) {
		this.userData = userData;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MainPage.LINK_REF_USER).viewedBy(actor).asString();
	}

	public UserRegistrationData getUserData() {
		return userData;
	}

	public void setUserData(UserRegistrationData userData) {
		this.userData = userData;
	}

	public static ValidateUserRegister getTextUser(UserRegistrationData userData) {
		return new ValidateUserRegister(userData);
	}

}
