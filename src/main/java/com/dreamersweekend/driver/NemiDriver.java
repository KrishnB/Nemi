package com.dreamersweekend.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NemiDriver {
	
	private static WebDriver mDriver;
	private DesiredCapabilities mCapabilities;
	public NemiDriver(DriverType pType) {
		// TODO Auto-generated constructor stub
	}
	
	public NemiDriver(DriverType pType, DesiredCapabilities pCapabilities) {
		
	}
	
	
	public NemiDriver(ChromeOptions options) {
		
	}
	
	
	
	public static WebDriver getDriver() {
		return mDriver;
	}

}
