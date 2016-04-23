package com.dreamersweekend.nemi;

import java.net.URL;
public class NemiFactory {
	private static URL mNemiServiceURL;
	public static URL initService(Browser browser) {

		switch (browser) {
		case CHROME:
			mNemiServiceURL = NemiService.chromeService().getUrl();
			break;
		case IE:
			mNemiServiceURL = NemiService.ieService().getUrl();
			break;
		case FIREFOX:
			mNemiServiceURL =  NemiService.firefoxService().getUrl();

			break;
		default:
			break;
		}

		return mNemiServiceURL;

	}

	public static void stopService() {
		NemiService.stopAllServices();

	}


}
