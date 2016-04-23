package com.dreamersweekend.nemi;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NemiDriver extends RemoteWebDriver implements WebDriver{

	public NemiDriver(Browser browser) {
		this(Nemi.getRemoteAddress(browser), Nemi.getDesiredCapabilities(browser),null);
	}

	public NemiDriver(Browser browser, DesiredCapabilities capabilities) {
		this(Nemi.getRemoteAddress(browser), capabilities, null);
	}

	
	private NemiDriver(URL remoteAddress, DesiredCapabilities desiredCapabilities, DesiredCapabilities requiredCapabilities) {
		super(remoteAddress,desiredCapabilities, requiredCapabilities);
	}


	public void quit() {
		try {
			execute(DriverCommand.QUIT);
		} finally {
			setSessionId(null);
			stopClient();
		}
		NemiFactory.stopService();
	}



	static class Nemi {

		static DesiredCapabilities getDesiredCapabilities(Browser browser) {
			DesiredCapabilities dCapabilities = browser.getBrowser();
			return dCapabilities;
		}

		static URL getRemoteAddress(Browser browser) {
			URL remoteAddressUrl = NemiFactory.initService(browser);
			return remoteAddressUrl;
		}

	}

}
