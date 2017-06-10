package com.grid.util.webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.grid.util.webDriver.WebDriverWaitForElement;

public class WebElementSafeActions
{
	
	public static void safeClear(
			WebDriver webDriver,
			WebElement webElement,
			int maxWaitingTimeForLoadingElementInSeconds)
	{
		
		WebDriverWaitForElement.waitForElementOnce(
				webDriver,
				webElement,
	    		maxWaitingTimeForLoadingElementInSeconds);
		
		WebElementActions.clear(
				webElement);
		
	}
	
	public static void safeSendKeys(
			WebDriver webDriver,
			WebElement webElement,
			int maxWaitingTimeForLoadingElementInSeconds,
			String keysToSend)
	{
		
		WebDriverWaitForElement.waitForElementOnce(
				webDriver,
				webElement,
	    		maxWaitingTimeForLoadingElementInSeconds);
		
		WebElementActions.sendKeys(
				webElement,
				keysToSend);
		
	}
	
	
	
	public static void safeClick(
			WebDriver webDriver,
			WebElement webElement,
			int maxWaitingTimeForLoadingElementInSeconds)
	{
		
		WebDriverWaitForElement.waitForElementOnce(
	    		webDriver,
	    		webElement,
	    		maxWaitingTimeForLoadingElementInSeconds);
	    
		WebElementActions.click(
				webElement);
		
	}
	
}
