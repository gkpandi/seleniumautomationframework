package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetcher {

	public WebElement getWebElement(String identifierType, String identifierValue) {

		if (identifierType.equalsIgnoreCase("xpath")) {
			return BaseTest.driver.findElement(By.xpath(identifierValue));
		} else if (identifierType.equalsIgnoreCase("id"))
			return BaseTest.driver.findElement(By.id(identifierValue));
		else if (identifierType.equalsIgnoreCase("name"))
			return BaseTest.driver.findElement(By.name(identifierValue));
		else if (identifierType.equalsIgnoreCase("link"))
			return BaseTest.driver.findElement(By.linkText(identifierValue));
		else if (identifierType.equalsIgnoreCase("css"))
			return BaseTest.driver.findElement(By.cssSelector(identifierValue));
		else if (identifierType.equalsIgnoreCase("tag"))
			return BaseTest.driver.findElement(By.tagName(identifierValue));
		else
			return null;
	}

	public List<WebElement> getWebElements(String identifierType, String identifierValue) {

		if (identifierType.equalsIgnoreCase("xpath")) {
			return BaseTest.driver.findElements(By.xpath(identifierValue));
		} else if (identifierType.equalsIgnoreCase("id"))
			return BaseTest.driver.findElements(By.id(identifierValue));
		else if (identifierType.equalsIgnoreCase("name"))
			return BaseTest.driver.findElements(By.name(identifierValue));
		else if (identifierType.equalsIgnoreCase("link"))
			return BaseTest.driver.findElements(By.linkText(identifierValue));
		else if (identifierType.equalsIgnoreCase("css"))
			return BaseTest.driver.findElements(By.cssSelector(identifierValue));
		else if (identifierType.equalsIgnoreCase("tag"))
			return BaseTest.driver.findElements(By.tagName(identifierValue));
		else
			return null;
	}
}