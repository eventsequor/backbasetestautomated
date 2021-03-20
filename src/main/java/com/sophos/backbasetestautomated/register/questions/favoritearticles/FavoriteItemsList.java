package com.sophos.backbasetestautomated.register.questions.favoritearticles;

import java.util.List;

import com.sophos.backbasetestautomated.register.userinterface.favoritearticles.UserProfileView;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FavoriteItemsList implements Question<List<String>> {
	private Actor actor;

	@Override
	public List<String> answeredBy(Actor actor) {
		this.actor = actor;
		return Text.of(UserProfileView.NAMES_ARTICLES).viewedBy(actor).asList();
	}

	public List<String> asListString() {
		return this.answeredBy(actor);
	}

	public static FavoriteItemsList getItems() {
		return new FavoriteItemsList();
	}

}
