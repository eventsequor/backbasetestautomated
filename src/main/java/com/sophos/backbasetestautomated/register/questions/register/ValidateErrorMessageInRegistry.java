package com.sophos.backbasetestautomated.register.questions.register;

import com.sophos.backbasetestautomated.register.models.UserRegistrationData;
import com.sophos.backbasetestautomated.register.userinterface.register.PageSignIn;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateErrorMessageInRegistry implements Question<String> {
	private String messageError;

	public ValidateErrorMessageInRegistry(String messageError) {
		this.messageError = messageError;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PageSignIn.LABEL_MESSAGE_ERROR).viewedBy(actor).asString();
	}

	public static ValidateErrorMessageInRegistry getTextUser(String messageError) {
		return new ValidateErrorMessageInRegistry(messageError);
	}

}
