package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import jxl.read.biff.BiffException;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetcher;
import utils.ExcelDataReader;

public class SanityTest extends BaseTest {

	ElementFetcher element = new ElementFetcher();
	HomePageEvents homePageEvents = new HomePageEvents();
	LoginPageEvents loginPageEvents = new LoginPageEvents();
	ExcelDataReader dataReader = new ExcelDataReader();

	@Test(dataProvider="userlogin")
	public void runSanityTest(String user,String pwd) {
		homePageEvents.signInButtonClick();
		loginPageEvents.verifyIfLoginPageLoaded();
		logger.info("Login with " + user + " and " + pwd);
		loginPageEvents.enterLoginCredentials(user,pwd);
	}

	@DataProvider(name="userlogin")
	public Object[][] getUserCredentials() throws BiffException, IOException
	{
		Object[][] userData = dataReader.getData("users");
		return userData;
	}
}