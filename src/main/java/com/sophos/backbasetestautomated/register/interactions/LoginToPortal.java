package com.sophos.backbasetestautomated.register.interactions;

import com.sophos.backbasetestautomated.register.models.UserAccessAplication;
import com.sophos.backbasetestautomated.register.userinterface.MainPage;
import com.sophos.backbasetestautomated.register.utils.AccessAttempts;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

public class LoginToPortal implements Interaction{
	private static final String SECURITY_PROTOCOL = "https://";
	private static final String STANDAR_PROTOCOL = "http://";
	private UserAccessAplication userAplication;
	
	public LoginToPortal(UserAccessAplication userAplication) {
		this.userAplication = userAplication;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {		
		if (Boolean.FALSE.equals(AccessAttempts.getEntry())) {
			AccessAttempts.setEntry();
			String actualUrl = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
			String newUrl = actualUrl;
			String loginAndUser = userAplication.getUser() + ":" + userAplication.getPassword() + "@";
			if (actualUrl.contains(SECURITY_PROTOCOL)) {
				newUrl = SECURITY_PROTOCOL + actualUrl.split(SECURITY_PROTOCOL)[0] + loginAndUser + actualUrl.split(SECURITY_PROTOCOL)[1];
			} else if (actualUrl.contains(STANDAR_PROTOCOL)) {
				newUrl = STANDAR_PROTOCOL + actualUrl.split(STANDAR_PROTOCOL)[0] + loginAndUser + actualUrl.split(STANDAR_PROTOCOL)[1];
			}
			BrowseTheWeb.as(actor).getDriver().navigate().to(newUrl);
		}
		actor.attemptsTo(Click.on(MainPage.TITLE_HEADER));
		
	}
	
	public static LoginToPortal signIn(UserAccessAplication userAplication) {
		return Tasks.instrumented(LoginToPortal.class, userAplication);
	}
	
	public UserAccessAplication getUserAplication() {
		return userAplication;
	}

	public void setUserAplication(UserAccessAplication userAplication) {
		this.userAplication = userAplication;
	}

}
