package com.dreamersweekend.constants;

import java.io.File;

public final class Constants {

	private static final String SEPERATOR = File.separator;
	
	static final class Folders{
		static final String RESOURCES = "src"+SEPERATOR+"main"+SEPERATOR+"resources";
		static final String DRIVER_SERVERS = RESOURCES+SEPERATOR+"driverServers";
	}

	static final class FileNames {
		static final String CHROME_SERVER = "chromedriver.exe";
		static final String IE_SERVER = "IEDriverServer.exe";
		static final String FIREFOX_SERVER = "firefoxdriver.exe";
	}

	public static final class Paths {

		public static final String CHROME_DRIVER = Folders.DRIVER_SERVERS+SEPERATOR+FileNames.CHROME_SERVER;
		public static final String IE_DRIVER = Folders.DRIVER_SERVERS+SEPERATOR+FileNames.IE_SERVER;
		public static final String FIREFOX_DRIVER = Folders.DRIVER_SERVERS+SEPERATOR+FileNames.FIREFOX_SERVER;
	}
	
	public static final class URLS {
		public static final String SERVICE_URL = "http://localhost:4444/wd/hub";
	}
}
