package com.sophos.backbasetestautomated.register.questions.register;

import com.sophos.backbasetestautomated.register.userinterface.register.PageSignUpRegister;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateErrorMessageInRegistry implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PageSignUpRegister.LABEL_MESSAGE_ERROR).viewedBy(actor).asString();
	}

	public static ValidateErrorMessageInRegistry getTextUser() {
		return new ValidateErrorMessageInRegistry();
	}
}
