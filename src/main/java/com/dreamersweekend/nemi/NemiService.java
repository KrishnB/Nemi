package com.dreamersweekend.nemi;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.service.DriverService;

import com.dreamersweekend.constants.Constants.Paths;
import com.dreamersweekend.exceptions.NemiException;

public class NemiService {
	private static DriverService mChromeService, mIEService, mFirefoxService;
	public static DriverService chromeService() {
		File chromeServerFile = new File(Paths.CHROME_DRIVER);
		if (mChromeService==null) {
			try{
			mChromeService = new ChromeDriverService.Builder()
					.usingDriverExecutable(chromeServerFile)
					.usingAnyFreePort().build();
			mChromeService.start();
			}catch(IOException e) {
				new NemiException("Unable to find chrome driver server at location "+chromeServerFile.getAbsolutePath());
			}
			
		}
		return mChromeService;
	}
	
	public static DriverService ieService() {
		File ieServerFile = new File(Paths.IE_DRIVER);
		if (mIEService==null) {
			try{
				mIEService = new InternetExplorerDriverService.Builder()
								.usingDriverExecutable(ieServerFile)
								.usingAnyFreePort().build();
				mIEService.start();
			}catch(IOException e) {
				new NemiException("Unable to find internet explorer driver server at location "+ieServerFile.getAbsolutePath());
			}
		}
		return mChromeService;
	}
	
	public static DriverService firefoxService() {
		File firefoxServerFile = new File(Paths.FIREFOX_DRIVER);
		if (mFirefoxService==null) {
			try{
			mFirefoxService = new GeckoDriverService.Builder()
								.usingDriverExecutable(firefoxServerFile)
								.usingAnyFreePort().build();
			mFirefoxService.start();
			}catch (IOException e) {
				new NemiException("Unable to find firefox driver server at location "+firefoxServerFile.getAbsolutePath());
			}
		}
		
		return mFirefoxService;
	}

	public static void stopAllServices() {
		stopFirefoxService();
		stopChromeService();
		stopIEService();
	}
	
	private static void stopChromeService(){
		if (mChromeService!=null) {
			mChromeService.stop();
		}
	}
	
	private static void stopIEService() {
		if (mIEService!=null) {
			mIEService.stop();
		}
	}
	
	private static void stopFirefoxService() {
		if (mFirefoxService!=null) {
			mFirefoxService.stop();
		}
	}
	
}
