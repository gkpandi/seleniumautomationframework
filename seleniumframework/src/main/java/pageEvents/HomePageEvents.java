package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetcher;

public class HomePageEvents {

	ElementFetcher element = new ElementFetcher();
	public void signInButtonClick() {
		element.getWebElement("XPATH", HomePageElements.signInButton).click();
	}
}