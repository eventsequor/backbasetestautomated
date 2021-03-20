package com.sophos.backbasetestautomated.register.tasks;

import com.sophos.backbasetestautomated.register.userinterface.MainPage;
import com.sophos.backbasetestautomated.register.userinterface.favoritearticles.UserProfileView;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToFavoriteArticles implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MainPage.LINK_REF_USER));
		actor.attemptsTo(Click.on(UserProfileView.GLOBAL_FEED_BUTTON));		
	}
	
	public static GoToFavoriteArticles goToPageUserProfile() {
		return Tasks.instrumented(GoToFavoriteArticles.class);
	}

}
