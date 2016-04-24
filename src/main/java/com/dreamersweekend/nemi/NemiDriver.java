package com.dreamersweekend.nemi;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NemiDriver extends RemoteWebDriver implements WebDriverReloded{

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
	
	/*public NemiElement findElement(By by) {
		
	}*/

	public Collection<?> getAllLinks() {
		Collection<?> allLinks = (Collection<?>) Executor.execute(JSCommander.GET_ALL_LINKS);
		return allLinks.size()==0?new ArrayList<>():allLinks;
	}

	public Object scrollElementIntoView(NemiElement element) {
		return Executor.execute(JSCommander.SCROLL_ELEMENT_INTO_VIEW);
	}
	
	public Object scrollElementIntoViewIfNeeded(NemiElement element) {
		return Executor.execute(JSCommander.SCROLL_ELEMENT_INTO_VIEW_IF_NEEDED);
	}
	
	public long getAbsoluteHeight() {
		Long height = (Long) Executor.execute(JSCommander.GET_ABS_HEIGHT);
		return height;
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
