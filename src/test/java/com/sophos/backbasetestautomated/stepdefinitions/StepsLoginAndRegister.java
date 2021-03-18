package com.sophos.backbasetestautomated.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.backbasetestautomated.register.interactions.LoginToPortal;
import com.sophos.backbasetestautomated.register.models.UserAccessAplication;
import com.sophos.backbasetestautomated.register.userinterface.MainPage;

public class StepsLoginAndRegister {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("the name actor {string}")
	public void the_name_actor(String nameActor) {
		theActorCalled(nameActor);
	}

	@Then("the browser opens")
	public void the_browser_opens() {
		theActorInTheSpotlight().wasAbleTo(Open.browserOn(new MainPage()));
	}

	@Given("a username {string} and a password {string} I want to enter the portal of the BBlog page")
	public void a_username_and_a_password_i_want_to_enter_the_portal_of_the_b_blog_page(String user, String password) {
		UserAccessAplication userAplication = new UserAccessAplication(user, password);
		theActorInTheSpotlight().attemptsTo(LoginToPortal.signIn(userAplication));
	}

	@When("I go to the Sign in option")
	public void i_go_to_the_sign_in_option() {
	}

	@Then("I verify the if i can to see the label {string}")
	public void i_verify_the_if_i_can_to_see_the_label(String string) {
	}

}
