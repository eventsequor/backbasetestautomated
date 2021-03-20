package com.sophos.backbasetestautomated.register.userinterface.favoritearticles;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserProfileView extends PageObject{
	public static final Target GLOBAL_FEED_BUTTON = Target.the("button global feed").locatedBy("//a[@class='nav-link' and contains(text(),'Favorited Articles')]");
	public static final Target NAMES_ARTICLES = Target.the("name of the article").locatedBy("//div[@class='article-preview']//h1");
}
