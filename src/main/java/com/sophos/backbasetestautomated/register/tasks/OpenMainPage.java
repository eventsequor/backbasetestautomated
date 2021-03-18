package com.sophos.backbasetestautomated.register.tasks;


import com.sophos.backbasetestautomated.register.questions.ValidateLoginToThePortal;
import com.sophos.backbasetestautomated.register.userinterface.MainPage;
import com.sophos.backbasetestautomated.register.utils.AccessAttempts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

public class OpenMainPage implements Task {
	private String user;
	private String keyUser;

	public OpenMainPage(String user, String keyUser) {
		this.user = user;
		this.keyUser = keyUser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		if (!AccessAttempts.getEntry()) {
			AccessAttempts.setEntry();
			String actualUrl = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
			String newUrl = actualUrl;
			String loginAndUser = user + ":" + keyUser + "@";
			if (actualUrl.contains("https://")) {
				newUrl = "https://" + actualUrl.split("https://")[0] + loginAndUser + actualUrl.split("https://")[1];
			} else if (actualUrl.contains("http://")) {
				newUrl = "http://" + actualUrl.split("http://")[0] + loginAndUser + actualUrl.split("http://")[1];
			}
			BrowseTheWeb.as(actor).getDriver().navigate().to(newUrl);
		}
		actor.attemptsTo(Click.on(MainPage.TITLE_HEADER));
	}
	
	public static OpenMainPage signInThePortal(String user,String keyUser) {
		return Tasks.instrumented(OpenMainPage.class, user,keyUser);
	}
	

}
