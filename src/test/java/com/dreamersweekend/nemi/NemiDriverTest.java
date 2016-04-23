package com.dreamersweekend.nemi;

import org.testng.annotations.Test;

public class NemiDriverTest {

	@Test
	public void nemiDriverTest() {
		NemiDriver driver = new NemiDriver(Browser.CHROME);
		driver.get("https://www.google.com");
		driver.quit();
		driver.close();
	}
}
