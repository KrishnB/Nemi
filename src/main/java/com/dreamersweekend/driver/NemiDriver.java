package com.dreamersweekend.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

public class NemiDriver extends RemoteWebDriver{
	
	private static WebDriver mDriver;
	private DesiredCapabilities mCapabilities;
	
	public NemiDriver(DriverType pType) {
		//TestComment
	}
	
	public NemiDriver(DriverType pType, DesiredCapabilities pCapabilities) {
		
	}
	
	
	public NemiDriver(ChromeOptions chromeOptions) {
		
	}
	
	public NemiDriver(SafariOptions safariOptions) {
		
	}
	
	public NemiDriver(WebDriver driver) {
		
	}
	
	public static WebDriver getDriver() {
		return mDriver;
	}

}
