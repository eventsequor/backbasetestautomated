package com.sophos.backbasetestautomated.register.interactions;

import com.sophos.backbasetestautomated.register.userinterface.MainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoPageSignUp implements Interaction {

	private Target target;

	public GoPageSignUp(Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MainPage.BUTTON_SIGN_UP));
	}

	public static GoPageSignUp goToSignUpPage(final Target target) {
		return Tasks.instrumented(GoPageSignUp.class, target);
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

}
