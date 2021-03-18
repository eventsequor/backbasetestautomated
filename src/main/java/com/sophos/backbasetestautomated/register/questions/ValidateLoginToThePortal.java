package com.sophos.backbasetestautomated.register.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateLoginToThePortal implements Question<Boolean>{

	private Target target;
	
	public ValidateLoginToThePortal(Target target) {
		this.target = target;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return Visibility.of(target).asABoolean().answeredBy(actor);
	}
	
	public static ValidateLoginToThePortal isVisible(Target target) {
		return new ValidateLoginToThePortal(target);
	}
	
}
