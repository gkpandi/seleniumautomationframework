package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetcher;

public class LoginPageEvents {

	ElementFetcher element = new ElementFetcher();

	public void verifyIfLoginPageLoaded() {
		Assert.assertTrue(element.getWebElements("XPATH", LoginPageElements.logInButtonText).size() > 0,
				"Element not found");
	}

	public void enterLoginCredentials(String userName, String password) {
		element.getWebElement("XPATH", LoginPageElements.emailTextField).sendKeys(userName);
		element.getWebElement("XPATH", LoginPageElements.passwordTextField).sendKeys(password);
	}
}