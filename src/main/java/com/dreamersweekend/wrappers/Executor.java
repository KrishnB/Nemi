package com.dreamersweekend.wrappers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.dreamersweekend.nemi.NemiDriver;

 class Executor {
	 
	static WebDriver driver = null;
	
	protected static Object execute(String command) {
		JavascriptExecutor jsx = ((JavascriptExecutor)driver);
		Object obj = jsx.executeScript(command);
		return obj;
	}
	
}
