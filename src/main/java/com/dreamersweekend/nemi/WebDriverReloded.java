package com.dreamersweekend.nemi;

import java.util.Collection;

import org.openqa.selenium.WebDriver;

public interface WebDriverReloded extends WebDriver{

	Collection<?> getAllLinks();
	
	Object scrollElementIntoView(NemiElement element);
	
	Object scrollElementIntoViewIfNeeded(NemiElement element);
	
	
	
	
}
