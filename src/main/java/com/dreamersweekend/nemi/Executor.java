package com.dreamersweekend.nemi;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

 class Executor {
	 
	static WebDriver driver = null;
	
	protected static Object execute(String command) {
		JavascriptExecutor jsx = ((JavascriptExecutor)driver);
		Object obj = jsx.executeScript(command);
		return obj;
	}
	
}
