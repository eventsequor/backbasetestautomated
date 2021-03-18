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
import static org.hamcrest.CoreMatchers.equalTo;

import com.sophos.backbasetestautomated.register.exceptions.RegistrationPageException;
import com.sophos.backbasetestautomated.register.interactions.GoPageSignUp;
import com.sophos.backbasetestautomated.register.interactions.LoginToPortal;
import com.sophos.backbasetestautomated.register.models.UserAccessAplication;
import com.sophos.backbasetestautomated.register.models.UserRegistrationData;
import com.sophos.backbasetestautomated.register.questions.ValidateAreOnRegistrationPage;
import com.sophos.backbasetestautomated.register.questions.register.ValidateUserRegister;
import com.sophos.backbasetestautomated.register.tasks.RegisterComplete;
import com.sophos.backbasetestautomated.register.userinterface.MainPage;
import com.sophos.backbasetestautomated.register.userinterface.register.PageSignIn;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

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

	@When("I go to the Sign up option")
	public void i_go_to_the_sign_in_option() {
		theActorInTheSpotlight().attemptsTo(GoPageSignUp.goToSignUpPage(MainPage.BUTTON_SIGN_UP));
	}

	@Then("I verify the if i can to see the label Sign in")
	public void i_verify_the_if_i_can_to_see_the_label() {
		theActorInTheSpotlight().should(
				seeThat(ValidateAreOnRegistrationPage.isVisibleTheLabelSignIn(PageSignIn.LABEL_SIGN_IN), equalTo(true))
						.orComplainWith(RegistrationPageException.class, "The Label Sign in is not visible"));
	}

	@When("the form is filled with the user {string} email {string} and password {string} and makes the registration")
	public void the_form_is_filled_with_the_user_email_and_password_and_makes_the_registration(String user,
			String email, String password) {
		UserRegistrationData userData = new UserRegistrationData(user, email, password);
		theActorInTheSpotlight().attemptsTo(RegisterComplete.completeRegister(userData));
	}

	@Then("I validate if the user {string} is visible in the header options")
	public void i_validate_if_the_user_is_visible_in_the_header_options(String userName) {
		UserRegistrationData userData = new UserRegistrationData(userName);
		theActorInTheSpotlight().should(seeThat(ValidateUserRegister.getTextUser(userData), equalTo(userName))
				.orComplainWith(RegistrationPageException.class,
						"The user cannot see a button with their username in the header of the page that indicates that they have successfully registered"));
	}
	
	@Then("I validate if a label appears with the message {string}")
	public void i_validate_if_a_label_appears_with_the_message(String string) {
		
	}

}
