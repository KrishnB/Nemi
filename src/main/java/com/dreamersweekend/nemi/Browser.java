package com.dreamersweekend.nemi;


import org.openqa.selenium.remote.DesiredCapabilities;

public enum Browser {
	
	ANDROID(DesiredCapabilities.android()),
	CHROME(DesiredCapabilities.chrome()),
	FIREFOX(DesiredCapabilities.firefox()),
	HTMLUNIT(DesiredCapabilities.htmlUnit()),
	JSHTMLUNIT(DesiredCapabilities.htmlUnitWithJs()),
	EDGE(DesiredCapabilities.edge()),
	IE(DesiredCapabilities.internetExplorer()),
	IPHONE(DesiredCapabilities.iphone()),
	IPAD(DesiredCapabilities.ipad()),
	SAFARI(DesiredCapabilities.safari()),
	PHANTOMJS(DesiredCapabilities.phantomjs());
	
	private DesiredCapabilities eCapabilities;
	Browser(DesiredCapabilities capabilites) {
		this.eCapabilities = capabilites;
	}
	
	public DesiredCapabilities getBrowser() {
		return eCapabilities;
	}

}
